package main.Enums;

public enum StorageErrorInfo {
    noError("No error"),
    unrecognizedStorageType("Unrecognized storage type"),
    encodeFailure("Encode failure"),
    decodeFailure("Decode failure"),
    saveFailure("Save failure"),
    retrieveFailure("Retrieve failure");
    public final String storageError;

    private StorageErrorInfo(String storageError) {
        this.storageError = storageError;
    }
}
