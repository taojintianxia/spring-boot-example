package com.github.taojintianxia.springbootexample.service.impl;

import com.github.taojintianxia.springbootexample.exception.CustomizedException;
import com.github.taojintianxia.springbootexample.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @author Nianjun Sun
 * @date 2018/6/25 18:31
 */

@Service
public class TestServiceImpl implements TestService {
    @Override
    public Integer getFirstUser() throws Exception {
        throw new Exception("this is exception");
    }

    @Override
    public Integer getLastUser() throws CustomizedException {
        throw new CustomizedException("this is customized exception");
    }
}
