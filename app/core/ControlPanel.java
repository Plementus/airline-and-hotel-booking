package core;

import com.fasterxml.jackson.databind.JsonNode;
import models.TfxLocale;
import play.cache.Cache;
import play.libs.F;
import play.libs.ws.WS;
import play.mvc.Http;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 08/01/2016 1:31 AM
 * |
 **/
public class ControlPanel {

    public enum TfxDomainHost {
        TFX_CO("travelfix.co"), TFX_COM("travelfix.com"), TFX_COM_NG("travelfix.com.ng"), TFX_CO_UK("travelfix.co.uk"), TFX_COM_GH("travelfix.com.gh");

        public String value;

        TfxDomainHost(String str) {
            this.value = str;
        }

        public String getDomainHost() {
            return this.value;
        }
    }

    public static ControlPanel cpn = null;

    public ControlPanelMeta[] controlPanelMetas;

    public models.ControlPanel controlPanel;

    private ControlPanel() {
        //instantiate the object
        controlPanelMetas = ControlPanelMeta.values();
    }

    public static ControlPanel getInstance() {
        if (cpn == null) {
            cpn = new ControlPanel();
        }
        return cpn;
    }

    public String getMetaValue(String metaKey) {
        if (ControlPanelMeta.valueOf(metaKey) == null) {
            return null;
        }
        List<models.ControlPanel> cp = (List<models.ControlPanel>) play.cache.Cache.get("control_panel");
        if (cp == null || cp.size() <= 0) {
            cp = models.ControlPanel.find.all();
            play.cache.Cache.set("control_panel", cp);
        }
        for (models.ControlPanel eachCp : cp) {
            if (metaKey.equals(eachCp.meta_key)) {
                return eachCp.meta_value;
            }
        }
        return null;
    }

    public void reloadCache() {
        Cache.remove("control_panel");
        Cache.set("control_panel", models.ControlPanel.find.all());
    }

    public Boolean saveMetaValue(String metaKey, String metaValue) {
        models.ControlPanel cp = models.ControlPanel.find.where().eq("meta_key", metaKey).findUnique();
        Boolean status;
        if (cp == null) {
            //save the record
            cp = new models.ControlPanel();
            cp.meta_key = metaKey;
            cp.meta_value = metaValue;
            cp.insert();
            status = true;
        } else {
            //update the value
            cp.meta_value = metaValue;
            cp.update();
            status = true;
        }
        reloadCache();
        return status;
    }

    public String getMetaValue(ControlPanelMeta metaKey) {
        return this.getMetaValue(metaKey.name());
    }

    /**
     * Get user location and provide information about the domain and TravelFix for the support country.
     * Return null if TravelFix is not available in the country.
     *
     * @param request
     * @return TfxLocale | Null
     */
    public F.Promise<TfxLocale> getUserLocale(Http.Request request) {
        String httpHost = request.host();
        String ipAddress = request.remoteAddress();
        final String[] country = {null};
        return WS.url(Constants.GEO.URL).get().map(response -> {
            JsonNode json = response.asJson();
            country[0] = json.get("countryCode").asText();
            String countryCode = country[0];
            return TfxLocale.find.where().eq("country_code", countryCode).findUnique();
        });
    }

    public static Map<String, String> getDomainHosts() {
        Map<String, String> res = new LinkedHashMap<>();
        for (TfxDomainHost tfxDomainHost : TfxDomainHost.values()) {
            res.put(tfxDomainHost.getDomainHost(), tfxDomainHost.getDomainHost());
        }
        return res;
    }
}
