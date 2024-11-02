package com.app.pi.hello
import com.app.pi.Endpoints.HELLO
import com.app.pi.hello.dto.HelloDTO
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@SpringBootApplication
@RestController
@RequestMapping(HELLO)
class HelloController(
    private val service: HelloService,
) {
    @GetMapping
    fun hello(): ResponseEntity<out Any> {
        return service.hello(null)
    }
}
