package com.sucom.todo.todolist.entity;

import com.sucom.todo.todolist.dto.ToDoListReqDto;
import com.sucom.todo.todolist.dto.ToDoListReqDto.ToDoListSaveDto;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
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
@EntityListeners(AuditingEntityListener.class)
@Table(name = "todolist_tb")
public class ToDoList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    @ColumnDefault("0")
    private int completion;

    @CreatedDate
    @Column(nullable = false)
    private LocalDateTime createAt;

    @LastModifiedDate
    @Column(nullable = false)
    private LocalDateTime updateAt;

    public ToDoList(ToDoListSaveDto toDoListSaveDto) {
        this.title = toDoListSaveDto.getTitle();
    }
}
