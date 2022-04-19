package core;

import play.twirl.api.Html;

import java.util.List;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 07/03/2016 10:00 AM
 * |
 **/
public interface PaginationInterface<T> {

    void setRecordPerPage(int page);

    int size();

    List<T> getRecords();

    Html links();

    void setRawData(List<T> data);

}
