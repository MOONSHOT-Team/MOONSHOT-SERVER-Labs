package org.moonshot.labs.adapter.`in`.web

import org.moonshot.labs.application.port.`in`.ObjectiveCreateCommand
import org.moonshot.labs.application.port.`in`.ObjectiveReadCommand
import org.moonshot.labs.application.port.`in`.ObjectiveUseCase
import org.moonshot.labs.application.port.out.ObjectiveReadResponse
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/objective")
class ObjectiveController(
    private val objectiveUseCase: ObjectiveUseCase
) {

    @PostMapping
    fun createObjective(@RequestBody objectiveCreateCommand: ObjectiveCreateCommand) {
        return objectiveUseCase.create(objectiveCreateCommand)
    }

    @GetMapping("/{id}")
    fun readObjective(@PathVariable id: Long): ObjectiveReadResponse {
        return objectiveUseCase.read(ObjectiveReadCommand(id))
    }

    @DeleteMapping("/{id}")
    fun deleteObjective(@PathVariable id: Long) {
        return objectiveUseCase.delete(id)
    }

}