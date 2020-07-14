package main.base;

import main.Enums.StorageErrorInfo;
import main.Enums.StorageType;
import main.models.RESTfulModel;
import main.models.LocalModel;

// Any class conforming to Sustainable will be able to have
//  - save
//  - retrieve
// methods to access storage which can be, specified by storageType, Parse/RESTful server, local database, or User Defaults
// Can easily extend to other future unknown storage type without touch the classes
public interface ISustainable {
    // save class instance as JSON data according to storageType
    // asynchronous callback returns storage index (as the key for future retrieve) and error code
    default StorageErrorInfo save(StorageType storageType) {
        try {

            switch (storageType){
                case restful:
                    return RESTfulModel.save(this);
                case userDefaults:
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
    default ISustainable retrieve(StorageType storageType){
        switch (storageType) {
            case restful:
            return RESTfulModel.retrieve();
            case userDefaults:
            return LocalModel.retrieve();
            default:
                return null;
        }
    }
}
