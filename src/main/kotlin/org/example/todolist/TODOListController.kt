package org.example.todolist
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class TODOListController(private val repository: Repository) {
    @MutationMapping
    fun createTask(@Argument desc: String, @Argument title: String): Task {
        return repository.save(Task(desc = desc, title = title))
    }
    @QueryMapping
    fun findAll() : List<Task> {
        return repository.findAll()
    }
}