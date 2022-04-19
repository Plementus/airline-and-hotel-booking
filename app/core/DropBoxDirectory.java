package core;

/**
 * Created by Ibrahim Olanrewaju on 10/02/2016.
 */
public enum DropBoxDirectory {
    PARENT_DIR("/"), ASSETS_DIR("/assets/"), AVATAR_DIR("avatar");

    private String value;

    DropBoxDirectory(String value) {
        this.value = value;
    }

    public String getDir() {
        return value;
    }
}