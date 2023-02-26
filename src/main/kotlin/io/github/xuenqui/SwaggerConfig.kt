package io.github.xuenqui

import io.micronaut.context.annotation.ConfigurationProperties

@ConfigurationProperties("application.api.swagger")
class SwaggerConfig {
    val name: String? = null

}