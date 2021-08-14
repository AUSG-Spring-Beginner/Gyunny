package com.ausg.dto

import com.ausg.entity.Posts

/**
 * created by jg 2021/08/14
 */
data class PostsSaveRequestDto(
    val title: String,
    val content: String,
    val author: String
) {
    fun toEntity(): Posts {
        return Posts(
            title,
            content,
            author
        )
    }
}