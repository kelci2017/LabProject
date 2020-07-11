package main.models;

import main.base.ISustainable;
import main.classes.RPAnnotationClass;
import main.classes.RPCommentClass;

import java.util.HashMap;

public class UserData {
    public static HashMap<String, RPAnnotationClass> AnnotationDefaults = new HashMap<>();
    public static HashMap<String, RPCommentClass> CommentDefaults = new HashMap<>();
    public static String UserId = java.util.UUID.randomUUID().toString();
}