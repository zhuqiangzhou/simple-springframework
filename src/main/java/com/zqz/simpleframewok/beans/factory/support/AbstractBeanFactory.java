package com.zqz.simpleframewok.beans.factory.support;

import com.zqz.simpleframewok.beans.factory.BeanFactory;
import com.zqz.simpleframewok.beans.factory.config.BeanDefinition;

/**
 * 抽象类定义模板方法
 */
public abstract  class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws InstantiationException, IllegalAccessException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name,beanDefinition);
    }

    public abstract BeanDefinition getBeanDefinition(String beanName);

    public abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws IllegalAccessException, InstantiationException;
}
