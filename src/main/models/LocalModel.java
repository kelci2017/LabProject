package main.models;

import main.Enums.StorageErrorInfo;
import main.base.ISustainable;

public class LocalModel {
    public static StorageErrorInfo save(ISustainable data) {

        if (UserData.UserDefaults.get(UserData.UserId) == null) {
            UserData.UserDefaults.put(UserData.UserId, data);
        } else {
            UserData.UserDefaults.replace(UserData.UserId, data);
        }
        return StorageErrorInfo.success;
    }

    public static ISustainable retrieve() {

        boolean successful = true;

        if (successful) {
            return UserData.UserDefaults.get(UserData.UserId);
        }
        else {
            return null;
        }
    }
}
