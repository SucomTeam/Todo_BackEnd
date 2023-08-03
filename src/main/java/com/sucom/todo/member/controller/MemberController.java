package com.sucom.todo.member.controller;

import com.sucom.todo.member.dto.MemberRepDto.CreateMemberDto;
import com.sucom.todo.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/member")
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/signup")
    public ResponseEntity<?> SingUpMember(@RequestBody CreateMemberDto createDto) {

        System.out.println(createDto);
        return new ResponseEntity<>(memberService.createMember(createDto), HttpStatus.CREATED);
    }

    @PostMapping("/signin")
    public ResponseEntity<?> signInMember(@RequestBody CreateMemberDto createDto) {

        return new ResponseEntity<>(memberService.loginMember(createDto), HttpStatus.OK);
    }

}
