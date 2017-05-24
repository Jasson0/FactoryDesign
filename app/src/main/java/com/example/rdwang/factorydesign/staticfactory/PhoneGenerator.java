package com.example.rdwang.factorydesign.staticfactory;

import com.example.rdwang.factorydesign.IPhone;
import com.example.rdwang.factorydesign.standardfactory.IGenerator;

/**
 * Created by rdwang on 2017/5/24.
 */
//简单工厂模式
/*public class PhoneGenerator {
    public final static String GENERATE_IOS = "generate_ios";
    public final static String GENERATE_ANDROID = "generate_android";
    public final static String GENERATE_BLACKBERRY = "generate_blackberry";

    public static IPhone generatePhone(String flag) throws Exception {
        IPhone iPhone;
        switch (flag){
            case GENERATE_ANDROID:
                iPhone =  new AndroidPhone();
                break;
            case GENERATE_IOS:
                iPhone =  new IosPhone();
                break;
            case GENERATE_BLACKBERRY:
                iPhone =  new BlackBerryPhone();
                break;
            default:
                throw new Exception("UNDEFINED FLAG");
        }
        return iPhone;
    }
}*/
//结合反射的应用
public class PhoneGenerator extends IGenerator {

    @Override
    public <T extends IPhone> T generatePhone(Class<T> clazz) throws Exception {
        IPhone iPhone;
        iPhone = (IPhone) Class.forName(clazz.getName()).newInstance();
        return (T) iPhone;
    }
}