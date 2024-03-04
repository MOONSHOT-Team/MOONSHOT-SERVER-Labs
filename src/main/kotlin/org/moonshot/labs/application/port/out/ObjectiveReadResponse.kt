package org.moonshot.labs.application.port.out

data class ObjectiveReadResponse(
    val title: String,
    val content: String,
    val id: Long
)
