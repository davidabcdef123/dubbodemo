package com.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Super on 2017/3/9.
 */
public class ProviderMain {

    private static boolean stop=false;
    private static final Object LOCK=new Object();
    private static ClassPathXmlApplicationContext context;

    public static void main(String[] args) {
        //initSrping();
        while (!stop){
            synchronized (LOCK){
                try {
                    LOCK.wait(666666666);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static void stopmain(){
        stop=true;
        LOCK.notify();

    }

    private static void initSrping() {
        context = new ClassPathXmlApplicationContext(new String[]{"application.xml"});
        System.out.println("start success");
    }
}
