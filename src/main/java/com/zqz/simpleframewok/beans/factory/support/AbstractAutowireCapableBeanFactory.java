package com.zqz.simpleframewok.beans.factory.support;

import com.zqz.simpleframewok.beans.factory.config.BeanDefinition;

/**
 * 实例化Bean类(AbstractAutowireCapableBeanFactory)
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{

    @Override
    public  Object createBean(String beanName, BeanDefinition beanDefinition) throws IllegalAccessException, InstantiationException {
        Object bean  = null;
        bean = beanDefinition.getBeanClass().newInstance();
        addSingleton(beanName,bean);
        return bean;
    }
}
