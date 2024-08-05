package dev.jesusramirezb.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.jesusramirezb.todo.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{

}
