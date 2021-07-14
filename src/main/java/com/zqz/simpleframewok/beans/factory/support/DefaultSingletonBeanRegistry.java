package com.zqz.simpleframewok.beans.factory.support;

import com.zqz.simpleframewok.beans.factory.config.SingletonBeanRegistry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String,Object> singletonObjects = new ConcurrentHashMap<String, Object>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    //受保护的方法，这个方法可以被继承此类的其他类调用，包括AbstractBeanFactory 以及继承的DefaultListableBeanFactory 调用
    protected void addSingleton(String beanName,Object singletonObject) {
        singletonObjects.put(beanName,singletonObject);
    }
}
