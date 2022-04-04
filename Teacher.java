package com.tsp.asurso.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Teacher {

    @Id
    private Integer id;

    private String fio;
    private String phone;
    private String mail;
    private String login;
    private String password;

}
