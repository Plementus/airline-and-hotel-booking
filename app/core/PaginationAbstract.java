package core;
import core.PaginationException;
import core.PaginationInterface;
import play.Logger;
import play.mvc.Http;
import play.twirl.api.Html;

import java.util.List;

public abstract class PaginationAbstract<T> implements PaginationInterface<T> {

    public static final class LinkStyle {
        public static final int SLIDING = 1;
        public static final int PAGER = 2;
    }

    protected List<T> paginatingObject;

    protected int recordCount;

    public String urlEncodeString = "page";

    private int styleType = 1;

    protected int recordPerPage = 15;

    protected int currentPage = 0;

    protected void setUrlEncodeString(String value) {
        this.urlEncodeString = value;
    }

    protected void setLinkStyle(int styleType) {
        this.styleType = styleType;
    }

    public void setRecordPerPage(int value) {
        this.recordPerPage = value;
    }

    public int size() {
        return paginatingObject.size();
    }

    public List<T> getRecords() {
        if (paginatingObject == null || paginatingObject instanceof NullPointerException) {
            try {
                throw new PaginationException("'setRawData(List<T> record)' method is not called. Please call the object.");
            } catch (PaginationException e) {
                e.printStackTrace();
            }
        }
        if (this.size() > 0) {
            int sizePerPage = this.recordPerPage;
            int page = this.getCurrentPage();

            int from = Math.max(0, page * sizePerPage);
            int to = Math.min(this.size(), (page + 1) * sizePerPage);
            return this.paginatingObject.subList(from, to);
        }
        return null;
    }

    public void setRawData(List<T> records) {
        this.paginatingObject = records;
    }

    public Html links() {
        Html style = null;
        switch (this.styleType) {
            case 1:
                style = views.html.helpers.paginator_sliding.render(this);
                break;
            case 2:
                style = views.html.helpers.paginator_nexter.render(this.urlEncodeString, this.size());
                break;
        }
        return style;
    }

    protected int getCurrentPage() {
        Http.Request request = Http.Context.current().request();
        String currentPageStr = request.getQueryString(this.urlEncodeString);
        Logger.info("Page: " + currentPageStr);
        if (currentPageStr == null) {
            this.currentPage = 0;
        } else {
            this.currentPage = Integer.parseInt(currentPageStr);
        }
        return this.currentPage;
    }

    public boolean hasPrevious() {
        return true;
    }

    public boolean hasNext() {
        return true;
    }

    public boolean isCurrentPage(int page) {
        if (this.getCurrentPage() == page) {
            return true;
        } else {
            return false;
        }
    }


    public int pagesInRange() {
        return (int) Math.ceil(this.size() / this.recordPerPage);
    }

    public String appendUrl(int currentPage) {
        Http.Request request = Http.Context.current().request();
        final String[] url = {"?"};
        String _g = this.urlEncodeString + "=" + currentPage;
        if (request.queryString().size() != 0) {
            _g = "&" + this.urlEncodeString + "=" + currentPage;
            request.queryString().forEach((k, v) -> {
                if (!k.equalsIgnoreCase(this.urlEncodeString)) {
                    url[0] = url[0] + k + "=" + v[0] + "&";
                }
            });
        }
        url[0] = url[0] + _g;
        return url[0];
    }
}