package com.bjpowernode.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("teacher1")
public class Teacher {
    @Value("刘老师")
    private  String name;
    /*@Autowired
    @Qualifier("student1")*/
/*    @Autowired
    @Qualifier("student2")*/
    @Resource(name="student2")
    private Student student;

    public Teacher(String name, Student student) {
        this.name = name;
        this.student = student;
    }

    public Teacher() {
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", student=" + student +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
