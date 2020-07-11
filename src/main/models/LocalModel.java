package main.models;

import main.Enums.StorageErrorInfo;
import main.base.ISustainable;
import main.base.Sustainable;

public class LocalModel {
    public static StorageErrorInfo save(Sustainable data) {

        if (UserData.UserDefaults.get(UserData.UserId) == null) {
            UserData.UserDefaults.put(UserData.UserId, data);
        } else {
            UserData.UserDefaults.replace(UserData.UserId, data);
        }
        return StorageErrorInfo.success;
    }

    public static Sustainable retrieve() {

        boolean successful = true;

        if (successful) {
            return UserData.UserDefaults.get(UserData.UserId);
        }
        else {
            return null;
        }
    }
}
