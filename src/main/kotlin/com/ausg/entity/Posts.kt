package com.ausg.entity

import org.springframework.web.bind.annotation.GetMapping
import javax.persistence.*

/**
 * created by jg 2021/08/14
 */
@Entity
class Posts(
    @Column(length = 500, nullable = false)
    val title: String?= null,

    @Column(columnDefinition = "TEXT", nullable = false)
    val content: String?= null,

    val author: String?= null
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?= null
}