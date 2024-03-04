package org.moonshot.labs.adapter.out.persistence

import jakarta.transaction.Transactional
import org.moonshot.labs.application.port.out.ObjectivePersistencePort
import org.moonshot.labs.domain.Objective
import org.springframework.stereotype.Repository

@Repository
@Transactional
class ObjectiveRepository(
    private val objectiveJpaRepository: ObjectiveJpaRepository
) : ObjectivePersistencePort {

    override fun create(objective: Objective) {
        objectiveJpaRepository.save(ObjectiveMapper.domainToEntity(objective))
    }

    override fun read(id: Long): Objective {
        return ObjectiveMapper.entityToDomain(objectiveJpaRepository.findById(id).orElseThrow {
            RuntimeException("해당 Objective가 존재하지 않습니다.")
        })
    }

    override fun delete(id: Long) {
        objectiveJpaRepository.deleteById(id)
    }

}