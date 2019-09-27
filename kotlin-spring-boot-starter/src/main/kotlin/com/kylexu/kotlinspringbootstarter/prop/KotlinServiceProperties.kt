package com.kylexu.kotlinspringbootstarter.prop

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("kotlin")
class KotlinServiceProperties {
    lateinit var config: String
}