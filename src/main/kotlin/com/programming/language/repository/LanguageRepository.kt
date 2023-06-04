package com.programming.language.repository

import com.programming.language.model.Language
import org.springframework.data.repository.CrudRepository

interface LanguageRepository : CrudRepository<Language, Long> {
}