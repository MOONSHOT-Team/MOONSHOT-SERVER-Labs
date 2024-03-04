package org.moonshot.labs.adapter.out.persistence

import org.springframework.data.jpa.repository.JpaRepository

interface ObjectiveJpaRepository : JpaRepository<ObjectiveJpaEntity, Long>