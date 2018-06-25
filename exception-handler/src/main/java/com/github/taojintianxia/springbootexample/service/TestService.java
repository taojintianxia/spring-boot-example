package com.github.taojintianxia.springbootexample.service;

import com.github.taojintianxia.springbootexample.exception.CustomizedException;

/**
 * @author Nianjun Sun
 * @date 2018/6/25 18:30
 */
public interface TestService {

    Integer getFirstUser() throws Exception;

    Integer getLastUser() throws CustomizedException;

}
