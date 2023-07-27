package com.sucom.todo.todolist.dto;

import lombok.*;

public class ToDoListReqDto {

    @Getter
    @Setter
    @NoArgsConstructor
    public static class ToDoListSaveDto {
        private String title;

        public ToDoListSaveDto(String title) {
            this.title = title;
        }
    }
}
