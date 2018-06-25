package com.github.taojintianxia.springbootexample.service.impl;

import com.github.taojintianxia.springbootexample.service.TestService;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author Nianjun Sun
 * @date 2018/6/25 18:31
 */

@Service
public class TestServiceImpl implements TestService {
    @Override
    public Integer getFirstUser() {
        return new Random().nextInt();
    }
}
