package main.base;

import main.Enums.StorageErrorInfo;
import main.Enums.StorageType;
import main.models.LocalModel;
import main.models.RESTfulModel;

public abstract class Sustainable {
    public StorageErrorInfo save(StorageType storageType) {
        try {

            switch (storageType){
                case restful:
                    return RESTfulModel.save(this);
                case Local:
                    return LocalModel.save(this);
                default:
                    return StorageErrorInfo.unrecognizedStorageType;
            }
        }
        catch(Exception e) {
            return StorageErrorInfo.saveFailure;
        }
    }

    // retrieve according to storageType and storage index
    // asynchronous callback returns the class instance and error code
    public Sustainable retrieve(StorageType storageType){
        switch (storageType) {
            case restful:
                return RESTfulModel.retrieve();
            case Local:
                return LocalModel.retrieve();
            default:
                return null;
        }
    }
}
