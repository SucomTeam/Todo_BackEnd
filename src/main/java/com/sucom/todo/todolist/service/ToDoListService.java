package com.sucom.todo.todolist.service;

import com.sucom.todo.todolist.dto.ToDoListReqDto;
import com.sucom.todo.todolist.dto.ToDoListReqDto.ToDoListSaveDto;
import com.sucom.todo.todolist.dto.ToDoListResDto;
import com.sucom.todo.todolist.dto.ToDoListResDto.ToDoDto;
import com.sucom.todo.todolist.entity.ToDoList;
import com.sucom.todo.todolist.repository.ToDoListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ToDoListService {
    private final ToDoListRepository toDoListService;

    public ToDoList todoSave(ToDoListSaveDto saveDto) {
        ToDoList toDoSave = new ToDoList(saveDto);
        return toDoListService.save(toDoSave);
    }
}
