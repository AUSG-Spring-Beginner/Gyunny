package com.ausg.repository

import com.ausg.entity.Posts
import org.springframework.data.jpa.repository.JpaRepository

/**
 * created by jg 2021/08/14
 */
interface PostsRepository : JpaRepository<Posts, Long> {
}