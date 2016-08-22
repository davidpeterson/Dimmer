package com.appyware.dimmer.helper;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by
 * --Vatsal Bajpai on
 * --22/08/16 at
 * --2:01 PM
 */
public class SuperPrefs implements Constants {

    SharedPreferences sharedPreferences;

    public SuperPrefs(Context context) {
        sharedPreferences = context.getSharedPreferences(TAG_SHARED_PREF, Context.MODE_PRIVATE);
    }

    public void setString(String KEY, String value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(KEY, value);
        editor.apply();
    }

    public String getString(String KEY) {
        return sharedPreferences.getString(KEY, null);
    }

    public void setInt(String KEY, int value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(KEY, value);
        editor.apply();
    }

    public int getInt(String KEY) {
        return sharedPreferences.getInt(KEY, 0);
    }

    public void setBool(String KEY, Boolean value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(KEY, value);
        editor.apply();
    }

    public Boolean getBool(String KEY) {
        return sharedPreferences.getBoolean(KEY, true);
    }
}