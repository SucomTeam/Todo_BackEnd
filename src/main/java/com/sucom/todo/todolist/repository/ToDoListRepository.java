package com.sucom.todo.todolist.repository;

import com.sucom.todo.todolist.entity.ToDoList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

public interface ToDoListRepository extends JpaRepository<ToDoList, Long> {

    List<ToDoList> findByCompletion(int completion);
}
