package com.kylexu.kotlinspringbootstarter.configure

import com.kylexu.kotlinspringbootstarter.prop.KotlinServiceProperties
import com.kylexu.kotlinspringbootstarter.service.KotlinService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@ConditionalOnClass(KotlinService::class)
@EnableConfigurationProperties(KotlinServiceProperties::class)
class KotlinAutoConfigure {
    @Autowired
    lateinit var properties: KotlinServiceProperties

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "kotlin", value = ["enabled"], havingValue = "true")
    fun kotlinService(): KotlinService {
        return KotlinService(properties.config)
    }
}