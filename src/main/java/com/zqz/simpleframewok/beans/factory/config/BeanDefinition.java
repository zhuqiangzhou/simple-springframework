package com.zqz.simpleframewok.beans.factory.config;

/**
 * BeanDefinition定义
 * 将Object换成Class，把实例化操作交给容器处理
 */
public class BeanDefinition {

    public Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
