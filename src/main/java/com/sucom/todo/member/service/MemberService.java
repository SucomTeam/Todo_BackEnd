package com.sucom.todo.member.service;

import com.sucom.todo.member.dto.MemberRepDto.CreateMemberDto;
import com.sucom.todo.member.entity.Member;
import com.sucom.todo.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    @Transactional
    public Member createMember(CreateMemberDto saveDto) {

        Member toDoSave = new Member(saveDto);
        return memberRepository.save(toDoSave);
    }

    @Transactional
    public Member loginMember(CreateMemberDto saveDto) {

        Member toDoSave = new Member(saveDto);
        Member findMember = memberRepository.findByUsername(saveDto.getUsername()).orElseThrow(() -> new RuntimeException("존재하지 않는 리뷰입니다."));

        if (!findMember.getPassword().equals(saveDto.getPassword())) {
            throw new RuntimeException("비밀번호가 다름");
        }

        return findMember;
    }
}
