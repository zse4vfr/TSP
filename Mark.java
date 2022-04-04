package com.tsp.asurso.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Mark {

    @Id
    private Integer id;

    private Integer studentRef;
    private Integer subjectRef;
    private LocalDateTime date;

    private Integer mark;

}
