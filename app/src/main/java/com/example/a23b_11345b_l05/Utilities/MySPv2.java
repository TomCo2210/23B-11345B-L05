package com.example.a23b_11345b_l05.Utilities;

import android.content.Context;
import android.content.SharedPreferences;

public class MySPv2 {

    private static final String DB_FILE = "DB_FILE";
    private SharedPreferences sharedPreferences = null;

    public MySPv2(Context context) {
        this.sharedPreferences = context.getSharedPreferences(DB_FILE, Context.MODE_PRIVATE);
    }

    public String getString(String key, String defValue) {
        return sharedPreferences.getString(key, defValue);
    }

    public void putString(String key, String value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public int getInt( String key, int defValue) {
        return sharedPreferences.getInt(key, defValue);
    }

    public void putInt(String key, int value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(key, value);
        editor.apply();
    }

}
