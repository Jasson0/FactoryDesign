package com.example.rdwang.factorydesign.phonemodels;

import android.util.Log;

import com.example.rdwang.factorydesign.IPhone;
import com.example.rdwang.factorydesign.MainActivity;

/**
 * Created by rdwang on 2017/5/24.
 */

public class IosPhone implements IPhone {
    private final String TAG = IosPhone.class.getSimpleName();
    @Override
    public void getOS() {
        Log.e(TAG, "im IOS");
    }
}
