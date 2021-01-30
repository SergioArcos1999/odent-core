package com.odent.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class AppConfiguration {

    /*@Bean   ---> Ejemplo
    open fun stockRetriever(): StockRetriever {

    }*/

    private val SPRING_PROFILES_ACTIVE = "SPRING_PROFILES_ACTIVE"
}