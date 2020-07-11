package main.models;

import main.Enums.StorageErrorInfo;
import main.base.Sustainable;

public class ParseModel {
    static boolean simulate = true;

    public static StorageErrorInfo save(Sustainable data) {

        if (simulate) {
            return LocalModel.save(data);
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

    public static Sustainable retrieve() {

        if (simulate) {
            return LocalModel.retrieve();
        }
        else { // real Parse API

            // call real Parse API to retrieve the data
            Sustainable data = null;
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
