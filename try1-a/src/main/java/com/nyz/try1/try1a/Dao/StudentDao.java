package com.nyz.try1.try1a.Dao;

import com.nyz.try1.try1a.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentDao extends JpaRepository<Student,Integer> {

    List<Student> findByName(String name);

}
