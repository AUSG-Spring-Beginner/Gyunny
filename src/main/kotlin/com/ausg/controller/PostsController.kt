package com.ausg.controller

import com.ausg.dto.PostsSaveRequestDto
import com.ausg.service.PostsService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * created by jg 2021/08/14
 */
@RequestMapping("/api/v1/")
@RestController
class PostsController(
    private val postsService: PostsService
) {
    @GetMapping("posts")
    fun save(@RequestBody postsSaveRequestDto: PostsSaveRequestDto) {
        return postsService.save(postsSaveRequestDto);
    }
}