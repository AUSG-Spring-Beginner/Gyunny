package com.ausg.controller

import com.ausg.dto.HelloResponseDto
import com.ausg.service.HelloService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * created by jg 2021/08/14
 */
@RestController
class HelloController(
    private val helloService: HelloService
) {

    @GetMapping("test")
    fun getTest(): HelloResponseDto {
        return helloService.createDto();
    }

}