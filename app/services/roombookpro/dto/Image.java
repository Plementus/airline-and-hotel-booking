/**
 * Created by Ibrahim Olanrewaju on 2/10/2016.
 */

package services.roombookpro.dto;

public class Image {
  private String url;

  public Image(String url) {
    this.url = url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getUrl() {
    return url;
  }
}