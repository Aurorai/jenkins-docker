package com.uhomed.jenkins.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liming
 * @version 1.0
 * @date Apr 2019-04-03 17:42
 */
@RestController
public class TestController {


    @GetMapping("/api/test")
    public String test(){
        return "HelloWorld";
    }
}
