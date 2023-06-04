package com.programming.language.service

import com.programming.language.extensions.toDto
import com.programming.language.repository.LanguageRepository
import org.springframework.stereotype.Service

@Service
class LanguageService(
    private val languageRepository: LanguageRepository
) {

    fun findAll() = languageRepository.findAll().map { it.toDto() }

}