package com.sucom.todo.member.entity;

import com.sucom.todo.member.dto.MemberRepDto.CreateMemberDto;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
@EntityListeners(AuditingEntityListener.class)
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private String password;

    @CreatedDate
    @Column(nullable = false)
    private LocalDateTime createAt;

    @LastModifiedDate
    @Column(nullable = false)
    private LocalDateTime updateAt;

    public Member (CreateMemberDto createMemberDto) {

        this.username = createMemberDto.getUsername();
        this.nickname = createMemberDto.getNickname();
        this.password = createMemberDto.getPassword();
    }
}
