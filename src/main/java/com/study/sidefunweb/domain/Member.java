package com.study.sidefunweb.domain;

import com.study.sidefunweb.util.Grade;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class Member {

    @Id @GeneratedValue
    private Long id;

    private String name;
    private int age;
    @Enumerated(EnumType.STRING)
    private Grade grade;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
