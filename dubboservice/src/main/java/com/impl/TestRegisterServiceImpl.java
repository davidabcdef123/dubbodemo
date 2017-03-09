package com.impl;

import com.api.TestRegistryService;

/**
 * Created by Super on 2017/3/9.
 */
public class TestRegisterServiceImpl implements TestRegistryService {

    public String hello(String name) {
        return "hello"+name;
    }

}
