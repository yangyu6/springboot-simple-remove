package com.onion.web.controller;

import com.onion.common.utils.Res;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @作者:yu
 * @时间:2019-04-22
 */
@RestController
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public Res<String> hello(HttpServletResponse response) {
        return Res.ok.data("hello world");
    }
}
