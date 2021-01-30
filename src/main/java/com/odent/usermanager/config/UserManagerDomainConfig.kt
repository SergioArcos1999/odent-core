package com.odent.usermanager.config

import com.odent.usermanager.domain.repository.UserManagerRepository
import org.springframework.context.annotation.Bean

class UserManagerDomainConfig {

    @Bean
    open fun userManagerService(userManagerRepository: UserManagerRepository) {
        //return
    }
}