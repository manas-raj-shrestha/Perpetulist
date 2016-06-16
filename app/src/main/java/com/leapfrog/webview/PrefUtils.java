package com.leapfrog.webview;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Handles shared preferences
 */
public class PrefUtils {
    static SharedPreferences sharedPreferences;
    final static String KEY_URL = "default_url";
    final static String PERP_FILENAME = "Perpetulist";

    private static SharedPreferences getSharedPreferences(Context context) {
        sharedPreferences = context.getSharedPreferences(PERP_FILENAME, Context.MODE_PRIVATE);
        return sharedPreferences;
    }

    /**
     * save default url to shared preferences
     *
     * @param context {@link Context}
     * @param string Default URL
     */
    public static void saveDefaultUrl(Context context, String string) {
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        editor.putString(KEY_URL, string);
        editor.commit();
    }

    /**
     * returns the default url
     *
     * @param context {@link Context}
     * @return default url
     */
    public static String getDefaultUrl(Context context) {
        return getSharedPreferences(context).getString(KEY_URL, context.getString(R.string.default_url));
    }

}
