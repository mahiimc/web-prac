package com.imc.cqrs.repository.write

import com.imc.cqrs.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User,Long> {
}