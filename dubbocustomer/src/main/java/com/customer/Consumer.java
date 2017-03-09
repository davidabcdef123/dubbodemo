package com.customer;

import com.api.TestRegistryService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Super on 2017/3/9.
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });
        context.start();

        TestRegistryService demoService = (TestRegistryService) context.getBean("testRegisterServiceImpl");
        String hello = demoService.hello("zhangsan");
        System.out.println(hello);


    }
}
