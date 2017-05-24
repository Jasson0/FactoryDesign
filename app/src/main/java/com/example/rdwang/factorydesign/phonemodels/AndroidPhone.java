package com.example.rdwang.factorydesign.phonemodels;

import android.util.Log;

import com.example.rdwang.factorydesign.IPhone;

/**
 * Created by rdwang on 2017/5/24.
 */

public class AndroidPhone implements IPhone {
    private final String TAG = AndroidPhone.class.getSimpleName();
    @Override
    public void getOS() {
        Log.e(TAG, "im Android");
    }
}
