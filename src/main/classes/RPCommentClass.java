package main.classes;

import main.Enums.StorageErrorInfo;
import main.models.UserData;

public class RPCommentClass {
    public boolean comment1 = true;
    public int comment2 = 2;
    public String comment3 = "comment3";

    void dummy() {

    }

    public StorageErrorInfo saveToLocal() {
        try {

            if (UserData.CommentDefaults.get(UserData.UserId) == null) {
                UserData.CommentDefaults.put(UserData.UserId, this);
            } else {
                UserData.CommentDefaults.replace(UserData.UserId, this);
            }
            return StorageErrorInfo.success;
        }
        catch(Exception e) {
            return StorageErrorInfo.saveFailure;
        }
    }

    public RPCommentClass retrieve(){
        return UserData.CommentDefaults.get(UserData.UserId);
    }
}
