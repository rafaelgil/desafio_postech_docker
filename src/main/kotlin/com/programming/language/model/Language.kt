package com.programming.language.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
data class Language (
    @Id
    val id: Long,
    @Column(name = "name", nullable = false)
    val name: String
)