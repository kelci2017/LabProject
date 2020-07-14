package main.Enums;

public enum StorageType {
    restful("RESTful"),
    Local("User Defaults");// test stub before the remote server is available

    public final String type;

    private StorageType(String type) {
        this.type = type;
    }
}