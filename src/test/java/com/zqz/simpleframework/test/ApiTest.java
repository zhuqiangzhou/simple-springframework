package com.zqz.simpleframework.test;



import com.zqz.simpleframewok.beans.factory.config.BeanDefinition;
import com.zqz.simpleframewok.beans.factory.support.DefaultListableBeanFactory;
import com.zqz.simpleframework.test.bean.UserService;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test() throws IllegalAccessException, InstantiationException {
        //初始化beanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //初始化beanDefinition
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);


        //获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        // 4.第二次获取 bean from Singleton
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();


    }

}
