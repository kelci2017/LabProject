package main.models;

import main.Enums.StorageErrorInfo;
import main.base.ISustainable;

public class RESTfulModel {
    static boolean simulate = true;

    public static StorageErrorInfo save(ISustainable data) {

        if (simulate) {
            return UserDefaultsModel.save(data);
        }
        else { // real Parse API

            boolean successful = true;

            if (successful) {
                return StorageErrorInfo.noError;
            }
            else {
                return StorageErrorInfo.saveFailure;
            }
        }
    }

    public static ISustainable retrieve() {

        if (simulate) {
            return UserDefaultsModel.retrieve();
        }
        else { // real Parse API

            // call real Parse API to retrieve the data
            ISustainable data = null;
            boolean successful = true;

            // when finished, dispatch the callback to main thread to make UI operation safe, if any
            if (successful) {
                return data;
            }
            else {
                return null;
            }
        }
    }
}
