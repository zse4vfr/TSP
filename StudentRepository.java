package com.tsp.asurso.repos;

import com.tsp.asurso.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
