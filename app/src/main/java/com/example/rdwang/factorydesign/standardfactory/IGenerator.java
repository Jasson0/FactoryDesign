package com.example.rdwang.factorydesign.standardfactory;

import com.example.rdwang.factorydesign.IPhone;

/**
 * Created by rdwang on 2017/5/24.
 */

public abstract class IGenerator {
    //public abstract IPhone generatePhone() throws Exception;
    public abstract <T extends IPhone>T generatePhone(Class<T> clazz) throws Exception;
}
