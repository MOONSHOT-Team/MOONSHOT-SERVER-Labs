package org.moonshot.labs.application.service

import org.moonshot.labs.application.port.`in`.ObjectiveCreateCommand
import org.moonshot.labs.application.port.`in`.ObjectiveReadCommand
import org.moonshot.labs.application.port.`in`.ObjectiveUseCase
import org.moonshot.labs.application.port.out.ObjectivePersistencePort
import org.moonshot.labs.application.port.out.ObjectiveReadResponse
import org.moonshot.labs.domain.Objective
import org.springframework.stereotype.Service

@Service
class ObjectiveService(
    private val objectivePersistencePort: ObjectivePersistencePort
) : ObjectiveUseCase {

    override fun create(objectiveCreateCommand: ObjectiveCreateCommand) {
        val objective = Objective(objectiveCreateCommand.title, objectiveCreateCommand.content)
        objectivePersistencePort.create(objective)
    }

    override fun read(objectiveReadCommand: ObjectiveReadCommand): ObjectiveReadResponse {
        val objective = objectivePersistencePort.read(objectiveReadCommand.id)
        return ObjectiveReadResponse(objective.title, objective.content, objective.id ?: 0L)
    }

    override fun delete(id: Long) {
        objectivePersistencePort.delete(id)
    }

}