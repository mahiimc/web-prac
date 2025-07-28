package com.imc.cqrs.repository.read

import com.imc.cqrs.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface UserReadRepository : JpaRepository<User,Long> {
}