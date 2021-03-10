package com.odent.usermanager.infrastructure.entrypoint.rest.v1.controller

import com.odent.usermanager.domain.service.UserManagerService
import com.odent.usermanager.infrastructure.entrypoint.rest.v1.json.UsersListJsonResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@RestController
@RequestMapping("/api/usermanager")
class UserManagerController(
        private val userManagerService: UserManagerService,
) {
    private val contentDisposition = "Content-Disposition"
    private val applicationJson = "application/json"

    @PostMapping("/register")
    fun registerUser(
            request: HttpServletRequest,
            response: HttpServletResponse
    ) {
        response.status = 200
        response.contentType = applicationJson

    }

    @GetMapping("/user")
    fun getUserInfo(
        request: HttpServletRequest
    ) : ResponseEntity<UsersListJsonResponse> {
        return ResponseEntity.ok(
                userManagerService.getUserInfo()
            )
    }

    private fun getUserFromRequest(
        request: HttpServletRequest
    ) {
        return request.getParameter("id")
    }
}