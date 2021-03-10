package com.odent.usermanager.infrastructure.entrypoint.rest.v1.json

import com.odent.usermanager.domain.entity.User

class UsersListJsonResponse(
    val allUsers: List<User>
) {
    companion object {
//        fun of(userData: User) : UsersListJsonResponse {
//            //return UsersListJsonResponse()
//        }
    }

}