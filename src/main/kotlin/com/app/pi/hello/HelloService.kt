package com.app.pi.hello

import com.app.pi.hello.dto.HelloDTO
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class HelloService{
    fun hello(erro: String?): ResponseEntity<out Any> {
        if (erro != null) {
            return ResponseEntity.status(HttpStatusCode.valueOf(400)).body(HelloDTO(message = erro))
        }
        return ResponseEntity.ok(HelloDTO(message = "Hello World!"))
    }
}
