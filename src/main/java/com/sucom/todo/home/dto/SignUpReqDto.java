package com.sucom.todo.home.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class SignUpReqDto {

    @Getter
    @Setter
    @NoArgsConstructor
    public static class SignupDto {
        private String username;
        private String password;
        private String name;
        private String nickname;

        @Builder
        public SignupDto(String username, String password, String name, String nickname) {
            this.username = username;
            this.password = password;
            this.name = name;
            this.nickname = nickname;
        }
    }
}
