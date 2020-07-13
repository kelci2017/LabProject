package main.classes;

import main.Enums.StorageErrorInfo;
import main.models.UserData;

public class RPAnnotationClass {
    public boolean annotation1 = false;
    public int annotation2 = 2;
    public String annotation3 = "annotation3";

    void dummy() {

    }

    public StorageErrorInfo save() {
        try {

            if (UserData.AnnotationDefaults.get(UserData.UserId) == null) {
                UserData.AnnotationDefaults.put(UserData.UserId, this);
            } else {
                UserData.AnnotationDefaults.replace(UserData.UserId, this);
            }
            return StorageErrorInfo.success;
        }
        catch(Exception e) {
            return StorageErrorInfo.saveFailure;
        }
    }

    public RPAnnotationClass retrieve(){
        return UserData.AnnotationDefaults.get(UserData.UserId);
    }
}
