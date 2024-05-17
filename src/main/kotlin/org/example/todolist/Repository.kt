package org.example.todolist
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface Repository: JpaRepository<Task, Long> {
}