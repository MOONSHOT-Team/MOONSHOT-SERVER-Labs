package org.moonshot.labs.adapter.out.persistence

import org.moonshot.labs.domain.Objective

class ObjectiveMapper {

    companion object {
        fun entityToDomain(objectiveJpaEntity: ObjectiveJpaEntity): Objective {
            return Objective(objectiveJpaEntity.title, objectiveJpaEntity.content, objectiveJpaEntity.id)
        }

        fun domainToEntity(objective: Objective): ObjectiveJpaEntity {
            return ObjectiveJpaEntity(objective.title, objective.content)
        }
    }

}