package net.william278.huskclaims.util;

public class Debug {

    public static boolean enabled = false;

    public static void log(String message) {
        if (enabled) {
            System.out.println("[HuskClaims Debug] " + message);
        }
    }

}
