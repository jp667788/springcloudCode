package com.lijunpeng.service_feign.controller;

import com.lijunpeng.service_feign.feign.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Li on 2018/10/8.
 */
@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;


    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne( name );
    }
}
