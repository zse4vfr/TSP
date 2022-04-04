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
public class Student {

    @Id
    private Integer id;

    private String fio;
    private String adress;
    private String phone;
    private String phone_parent;
    private String mail;
    private String login;
    private String password;
    private Integer classRoomRef;

}