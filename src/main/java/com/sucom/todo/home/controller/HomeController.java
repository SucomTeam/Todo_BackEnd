package com.sucom.todo.home.controller;

import com.sucom.todo.home.dto.SignUpReqDto;
import com.sucom.todo.home.dto.SignUpReqDto.SignupDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class HomeController {

    @RequestMapping("/signup")
    public void signup(@RequestBody SignupDto signupDto) {
    }
}
