package com.sucom.todo.member.dto;

import lombok.*;

import java.time.LocalDateTime;

public class MemberRepDto {

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CreateMemberDto {
        private String username;
        private String nickname;
        private String password;
        private LocalDateTime createAt;
        private LocalDateTime updateAt;
    }
}
