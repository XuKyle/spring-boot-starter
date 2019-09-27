package com.kylexu.kotlinspringbootstarter.service

import org.springframework.util.StringUtils

class KotlinService(var config: String) {
    fun split(separatorChar: String): Array<String>? {
        return StringUtils.split(config, separatorChar)
    }
}