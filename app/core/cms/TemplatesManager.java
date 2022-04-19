package core.cms;

import models.CmsContainers;
import models.CmsPages;
import models.CmsTemplateAttr;
import models.CmsTemplates;
import org.apache.commons.lang3.StringUtils;
import play.Logger;

import java.util.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 14/02/2016 12:40 PM
 * |
 **/
public class TemplatesManager {

    private CmsPages page;

    private CmsTemplates template;

    private int ib = 0;

    private List<CmsContainers> containers = CmsContainers.find.all();


    public enum SideBarProperties {
        NONE("0"), LEFT_20("20__left"), LEFT_30("30__left"), LEFT_40("40__left"), RIGHT_20("20__right"), RIGHT_30("30__right"), RIGHT_40("40__right");
        public String value;

        SideBarProperties(String prop) {
            this.value = prop;
        }

        public String getProperty() {
            return this.value;
        }
    }

    public enum ThemeProperties {
        Default("__default");
        public String value;

        ThemeProperties(String prop) {
            this.value = prop;
        }

        public String getProperty() {
            return this.value;
        }
    }

    public enum BodyProperties {
        ONE_COLUMN_100_PERCENT("1__col1__100"),
        TWO_COLUMN_50_50_PERCENT("2__col1__50__50"),
        //        TWO_COLUMN_66_33_PERCENT("2__col1__66__33"),
//        TWO_COLUMN_33_66_PERCENT("2__col1__33__66"),
//        TWO_COLUMN_75_25_PERCENT("2__col1__75__25"),
//        TWO_COLUMN_25_75_PERCENT("2__col1__25__75"),
        THREE_COLUMN_33_33_33_PERCENT("3__col1__33__33__33"),
        FOUR_COLUMN_25_25_25_25_PERCENT("4__col1__25__25__25__25");
        public String value;

        BodyProperties(String prop) {
            this.value = prop;
        }

        public String getProperty() {
            return this.value;
        }
    }

    public static Map<String, String> sidebarOptions() {
        HashMap<String, String> map = new LinkedHashMap<>();
        for (SideBarProperties sideBarProperties : SideBarProperties.values()) {
            map.put(sideBarProperties.getProperty(), StringUtils.lowerCase(sideBarProperties.name().replaceAll("_", " ")));
        }
        return map;
    }

    public static Map<String, String> sidebarOptions(String value) {
        HashMap<String, String> map = new LinkedHashMap<>();
//        try {
//            SideBarProperties pr = SideBarProperties.valueOf(value);
        map.put(value, StringUtils.lowerCase(value.replaceAll("__", " ")));
//        } catch (IllegalArgumentException e) {
//            e.printStackTrace();
//        }
        for (SideBarProperties sideBarProperties : SideBarProperties.values()) {
            map.put(sideBarProperties.getProperty(), StringUtils.lowerCase(sideBarProperties.name().replaceAll("_", " ")));
        }
        return map;
    }

    public static Map<String, String> themeOption() {
        HashMap<String, String> map = new LinkedHashMap<>();
        for (ThemeProperties themeProperties : ThemeProperties.values()) {
            map.put(themeProperties.getProperty(), themeProperties.name());
        }
        return map;
    }

    public static Map<String, String> bodyOption() {
        HashMap<String, String> map = new LinkedHashMap<>();
        for (BodyProperties bodyProperties : BodyProperties.values()) {
            map.put(bodyProperties.getProperty(), StringUtils.lowerCase(bodyProperties.name().replaceAll("_", " ")));
        }
        return map;
    }

    public static Map<String, String> bodyOption(String value) {
        Logger.info("Value: " + value);
        HashMap<String, String> map = new LinkedHashMap<>();
        if(value != null) {
            map.put(value, StringUtils.lowerCase(value.replaceAll("__", " ")));
            for (BodyProperties bodyProperties : BodyProperties.values()) {
                map.put(bodyProperties.getProperty(), StringUtils.lowerCase(bodyProperties.name().replaceAll("_", " ")));
            }
        }
        return map;
    }

    public TemplatesManager parsePage(CmsPages page) {
        this.page = page;

        return this;
    }

    public TemplatesManager parseTemplate(CmsTemplates template) {
        this.template = template;

        return this;
    }

    public String getAttrValue(String attr) {
        String val = null;
       CmsTemplates cmsTemplates = CmsTemplates.find.fetch("cmsTemplateAttrList")
                .where().eq("id", this.page.cms_template_id.id).findUnique();
        for (CmsTemplateAttr cmsA : cmsTemplates.cmsTemplateAttrList) {
            if (attr.equalsIgnoreCase(cmsA.attr)) {
                val = cmsA.value;
            }
        }
        return val;
    }

    public String getTemplateAttrValue(String attr) {
        String val = null;
        for (CmsTemplateAttr cmsA : this.template.cmsTemplateAttrList) {
            if (attr.equalsIgnoreCase(cmsA.attr)) {
                val = cmsA.value;
            }
        }
        return val;
    }

    public String[] getSidebarDivClass(String property) {
        String bodyClass = "col-md-12";
        String sidebarClass = "";
        switch (property) {
            case "20__left":
                bodyClass = "col-md-9 pull-right";
                sidebarClass = "col-md-3";
                break;
            case "30__left":
                bodyClass = "col-md-8 pull-right";
                sidebarClass = "col-md-4";
                break;
            case "40__left":
                bodyClass = "col-md-7 pull-right";
                sidebarClass = "col-md-5";
                break;
            case "20__right":
                bodyClass = "col-md-9";
                sidebarClass = "col-md-3 pull-right";
                break;
            case "30__right":
                bodyClass = "col-md-8";
                sidebarClass = "col-md-4 pull-right";
                break;
            case "40__right":
                bodyClass = "col-md-7";
                sidebarClass = "col-md-5 pull-right";
                break;
        }
        String[] ret = {sidebarClass, bodyClass};
        return ret;
    }

    public String getBodyDivClass(String property, int index) {
        int row = Integer.parseInt(property.substring(0, 1));
        List<String> bodyClass = new ArrayList<>();
        if (property.equals("1__col" + index + "__100")) {
            bodyClass.add("col-md-12");
            index = bodyClass.size() - 1;
            return bodyClass.get(index);
        } else if (property.equals("2__col" + index + "__50__50")) {
            bodyClass.add("col-md-6");
            bodyClass.add("col-md-6");
            index = bodyClass.size() - 1;
            return bodyClass.get(index);
        } else if (property.equals("2__col" + index + "__66__33")) {
            bodyClass.add("col-md-7");
            bodyClass.add("col-md-5");
            return bodyClass.get(this.ib);
        } else if (property.equals("2__col" + index + "__33__66")) {
            bodyClass.add("col-md-5");
            bodyClass.add("col-md-7");
//            index = bodyClass.size() - 1;
            return bodyClass.get(this.ib);
        } else if (property.equals("2__col" + index + "__75__25")) {
            bodyClass.add("col-md-8");
            bodyClass.add("col-md-4");
            return bodyClass.get(this.ib);
        } else if (property.equals("2__col" + index + "__27__75")) {
            bodyClass.add("col-md-4");
            bodyClass.add("col-md-8");
//            index = bodyClass.size() - 1;
            return bodyClass.get(this.ib);
        } else if (property.equals("3__col" + index + "__33__33__33")) {
            bodyClass.add("col-md-4");
            bodyClass.add("col-md-4");
            bodyClass.add("col-md-4");
            index = bodyClass.size() - 1;
            return bodyClass.get(index);
        } else if (property.equals("4__col" + index + "__25__25__25__25")) {
            bodyClass.add("col-md-3");
            bodyClass.add("col-md-3");
            bodyClass.add("col-md-3");
            bodyClass.add("col-md-3");
            index = bodyClass.size() - 1;
            return bodyClass.get(index);
        } else {
            bodyClass.add("NULL");
        }
        return "";
    }

    public void inc(String property, int index) {
        if (property.equals("1__col" + index + "__100")) {
            this.ib = 0;
        } else if (property.equals("2__col" + index + "__50__50")) {
            this.ib = 2 - 1;
        } else if (property.equals("2__col" + index + "__66__33")) {
            this.ib = 2 - 1;
        } else if (property.equals("2__col" + index + "__33__66")) {
            this.ib = 1;
            this.ib = 2 - 1;
        } else if (property.equals("2__col" + index + "__75__25")) {
            this.ib = 1;
            this.ib = 2 - 1;
        } else if (property.equals("2__col" + index + "__27__75")) {
            this.ib = 1;
            this.ib = 2 - 1;
        } else if (property.equals("3__col" + index + "__33__33__33")) {
            this.ib = 0;
        } else if (property.equals("4__col" + index + "__25__25__25__25")) {
            this.ib = 0;
        } else {

        }
    }

    public CmsContainers getContainerValue(String id) {
        for (CmsContainers container : this.containers) {
            if (container.id.toString().equals(id)) {
                return container;
            }
        }
        return null;
    }


}