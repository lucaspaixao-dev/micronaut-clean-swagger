package io.github.xuenqui

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.views.View

@Controller("/hello-world")
class HelloWorld {


    @Get
    fun get(): Map<String, String> {
        return mapOf("type" to "hello-world")
    }
}

@Controller("/api-docs/swagger")
class SwaggerView(
    private val config: SwaggerConfig
) {

    @Get
    @View("swagger")
    fun swagger(): SwaggerConfig {
        return config
    }
}

@Controller("/api-docs/redoc")
class RedocView(
    private val config: SwaggerConfig
) {

    @Get
    @View("redoc")
    fun swagger() : SwaggerConfig {
        return config
    }
}