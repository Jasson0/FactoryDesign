package com.example.rdwang.factorydesign.phonemodels;

import android.util.Log;

import com.example.rdwang.factorydesign.IPhone;
import com.example.rdwang.factorydesign.MainActivity;

/**
 * Created by rdwang on 2017/5/24.
 */

public class BlackBerryPhone implements IPhone {
    private final String TAG = BlackBerryPhone.class.getSimpleName();
    @Override
    public void getOS() {
        Log.e(TAG, "im BlackBerry");
    }
}
