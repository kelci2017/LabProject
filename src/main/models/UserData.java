package main.models;

import main.base.ISustainable;

import java.util.HashMap;

public class UserData {
    public static HashMap<String, ISustainable> UserDefaults = new HashMap<>();
    public static String UserId = java.util.UUID.randomUUID().toString();
}
