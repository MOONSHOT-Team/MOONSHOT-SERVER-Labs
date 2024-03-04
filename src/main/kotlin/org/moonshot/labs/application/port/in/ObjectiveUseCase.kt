package org.moonshot.labs.application.port.`in`

import org.moonshot.labs.application.port.out.ObjectiveReadResponse

interface ObjectiveUseCase {

    fun create(objectiveCreateCommand: ObjectiveCreateCommand)
    fun read(objectiveReadCommand: ObjectiveReadCommand): ObjectiveReadResponse
    fun delete(id: Long)

}