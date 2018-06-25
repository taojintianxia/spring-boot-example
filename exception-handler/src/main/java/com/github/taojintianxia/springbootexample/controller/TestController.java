package com.github.taojintianxia.springbootexample.controller;

import com.github.taojintianxia.springbootexample.constants.response.R;
import com.github.taojintianxia.springbootexample.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Nianjun Sun
 * @date 2018/6/25 18:46
 */

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/getFirstUser")
    public R getFirstUser() throws Exception {
        Integer result = testService.getFirstUser();
        Map<String, Object> map = new HashMap<>(1);
        map.put("firstUser", result);
        return R.ok(map);
    }

    @GetMapping("/getLastUser")
    public R getLastUser() throws Exception {
        Integer result = testService.getLastUser();
        Map<String, Object> map = new HashMap<>(1);
        map.put("lastUser", result);
        return R.ok(map);
    }

}
