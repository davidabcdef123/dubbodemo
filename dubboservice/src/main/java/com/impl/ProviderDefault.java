package com.impl;

/**
 * Created by Super on 2017/3/9.
 */
public class ProviderDefault {




        public static void main(String args[]) {
            // biz-base-manage 开发环境下根据项目名称替换日志文件名
            System.setProperty("dubbo.logback.file", "logs/biz-qa-manage.logback.log");
            // 设置logback日志级别,由于使用dubbo框架,系统变量,高于配置文件变量
            System.setProperty("dubbo.logback.level", "info");
            // 设置dubbo配置,系统变量,高于配置文件变量 .由于dubbo 框架约定，开发环境需要设置dubbo.properties文件的位置；
            System.setProperty("dubbo.properties.file", "conf/dubbo.properties");
            com.alibaba.dubbo.container.Main.main(args);
        }



}
