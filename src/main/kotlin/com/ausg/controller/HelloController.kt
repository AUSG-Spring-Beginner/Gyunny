package com.ausg.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * created by jg 2021/08/14
 */
@RestController
class HelloController {

    @GetMapping("test")
    fun getTest(): String {
        return "test";
    }

}