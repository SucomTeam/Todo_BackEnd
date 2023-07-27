package com.sucom.todo.todolist.controller;

import com.sucom.todo.todolist.dto.ToDoListReqDto;
import com.sucom.todo.todolist.dto.ToDoListReqDto.ToDoListSaveDto;
import com.sucom.todo.todolist.service.ToDoListService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/todo")
public class ToDoListController {
    private final ToDoListService toDoListService;

    @PostMapping("/save")
    public ResponseEntity<?> toDoSave(@RequestBody ToDoListSaveDto saveDto) {
        return new ResponseEntity<>(toDoListService.todoSave(saveDto), HttpStatus.CREATED);
    }
}
