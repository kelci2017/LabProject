package main.models;

import main.base.Sustainable;

import java.util.HashMap;

public class UserData {
    public static HashMap<String, Sustainable> UserDefaults = new HashMap<>();
    public static String UserId = java.util.UUID.randomUUID().toString();
}
