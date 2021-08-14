package com.ausg.service

import com.ausg.dto.HelloResponseDto
import org.springframework.stereotype.Service

/**
 * created by jg 2021/08/14
 */
@Service
class HelloService {

    fun createDto(): HelloResponseDto {
        return HelloResponseDto("Gyunny", 5)
    }

}