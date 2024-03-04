package org.moonshot.labs.adapter.out.persistence

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class ObjectiveJpaEntity(
    title: String,
    content: String,
    id: Long = 0
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = id

    @Column(nullable = false)
    var title: String = title

    @Column(nullable = false)
    var content: String = content

}