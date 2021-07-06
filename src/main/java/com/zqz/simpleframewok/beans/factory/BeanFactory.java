package com.zqz.simpleframewok.beans.factory;

public interface BeanFactory {

    Object getBean(String name ) throws InstantiationException, IllegalAccessException;
}
