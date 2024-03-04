package org.moonshot.labs.application.port.out

import org.moonshot.labs.domain.Objective

interface ObjectivePersistencePort {

    fun create(objective: Objective)
    fun read(id: Long): Objective
    fun delete(id: Long)

}