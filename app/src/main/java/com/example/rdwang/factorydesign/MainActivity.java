package com.example.rdwang.factorydesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.rdwang.factorydesign.phonemodels.AndroidPhone;
import com.example.rdwang.factorydesign.phonemodels.BlackBerryPhone;
import com.example.rdwang.factorydesign.phonemodels.IosPhone;
import com.example.rdwang.factorydesign.staticfactory.PhoneGenerator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //标准工厂模式
/*        IPhone android, ios, bb;
        IGenerator androidGenerator, iosGenerator, bbGenerator;
        androidGenerator = new AndroidGenerator();
        iosGenerator = new IOSGenerator();
        bbGenerator = new BlackberryGenerator();
        try {
            android = androidGenerator.generatePhone();
            ios = iosGenerator.generatePhone();
            bb = bbGenerator.generatePhone();
            android.getOS();
            ios.getOS();
            bb.getOS();
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        //简单工厂模式（静态工厂模式）
/*        IPhone android, ios, bb;
        try {
            android = PhoneGenerator.generatePhone(PhoneGenerator.GENERATE_ANDROID);
            ios = PhoneGenerator.generatePhone(PhoneGenerator.GENERATE_IOS);
            bb = PhoneGenerator.generatePhone(PhoneGenerator.GENERATE_BLACKBERRY);
            android.getOS();
            ios.getOS();
            bb.getOS();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        //结合反射的应用
        PhoneGenerator phoneGenerator = new PhoneGenerator();
        try {
            IPhone android = phoneGenerator.generatePhone(AndroidPhone.class);
            IPhone ios = phoneGenerator.generatePhone(IosPhone.class);
            IPhone bb = phoneGenerator.generatePhone(BlackBerryPhone.class);
            android.getOS();
            ios.getOS();
            bb.getOS();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //标准工厂模式
/*    public class AndroidGenerator extends IGenerator {
        @Override
        public IPhone generatePhone() {
            return new AndroidPhone();
        }
    }
    public class IOSGenerator extends IGenerator {
        @Override
        public IPhone generatePhone() {
            return new IosPhone();
        }
    }
    public class BlackberryGenerator extends IGenerator {
        @Override
        public IPhone generatePhone() {
            return new BlackBerryPhone();
        }
    }*/
}
