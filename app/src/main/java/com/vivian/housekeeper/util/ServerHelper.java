package com.vivian.housekeeper.util;

import android.util.Log;

public class ServerHelper {

    public static LoginStatusCode login(String phone, String passwd){
        Log.i(config.dataTag, "begin to login with phone nubmer = " + phone + " with passwd = " + passwd);
        //validation
        if (Utils.isValidPhoneNumber(phone) == false) {
            return LoginStatusCode.VALIDATIONERROR;
        }

        return LoginStatusCode.SUCCESS;

    }
}
