package com.ausg.service

import com.ausg.dto.PostsSaveRequestDto
import com.ausg.repository.PostsRepository
import org.springframework.stereotype.Service
import javax.transaction.Transactional

/**
 * created by jg 2021/08/14
 */
@Service
class PostsService(
    private val postsRepository: PostsRepository
) {

    @Transactional
    fun save(postsSaveRequestDto: PostsSaveRequestDto) {
        postsRepository.save(postsSaveRequestDto.toEntity())
    }

}