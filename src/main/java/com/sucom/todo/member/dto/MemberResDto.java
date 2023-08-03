package com.sucom.todo.member.dto;

import com.sucom.todo.todolist.entity.ToDoList;
import lombok.*;

import java.time.LocalDateTime;

public class MemberResDto {

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ToDoDto {
        private String username;
        private String nickname;
        private String password;
        private LocalDateTime createAt;
        private LocalDateTime updateAt;

    }
}
