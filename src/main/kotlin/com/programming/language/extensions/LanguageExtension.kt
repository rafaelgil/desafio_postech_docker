package com.programming.language.extensions

import com.programming.language.dto.LanguageDto
import com.programming.language.model.Language

fun Language.toDto() = LanguageDto(this.id, this.name)