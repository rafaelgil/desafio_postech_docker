package com.programming.language.controller

import com.programming.language.service.LanguageService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("languages")
class LanguageController(
    private val languageService: LanguageService
) {

    @GetMapping
    fun findAll() = languageService.findAll()

}