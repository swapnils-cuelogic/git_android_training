package com.cuelogic.gittest;

/**
 * Created by Anand on 9/20/17.
 */

public class BuildUtil {
    public static String getEmailId() {
        String mEmailid = null;
        if (BuildConfig.DEBUG) {
            mEmailid ="anand.lilhare@cuelogic.com";
        }else{
            mEmailid ="anandlilhare69@gmail.com";
        }
        return mEmailid.trim();
    }
}
