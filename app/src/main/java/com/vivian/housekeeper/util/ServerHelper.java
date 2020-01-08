package com.vivian.housekeeper.util;

import android.util.Log;

public class ServerHelper {
    private static final String TAG = "ServerHelper";
    public static LoginStatusCode login(String phone, String passwd){
        Log.i(TAG, "begin to login with phone nubmer = " + phone + " with passwd = " + passwd);


        return LoginStatusCode.SUCCESS;
    }

    public static LoginStatusCode signup(String phone, String passwd){
        Log.i(TAG, "begin to signup with phone nubmer = " + phone + " with passwd = " + passwd);

        return LoginStatusCode.SUCCESS;
    }

}
