package com.gdut.software.entity;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private int age;
    private List<WrongQuestions> wrongQuestions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<WrongQuestions> getWrongQuestions() {
        return wrongQuestions;
    }

    public void setWrongQuestions(List<WrongQuestions> wrongQuestions) {
        this.wrongQuestions = wrongQuestions;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", wrongQuestions=" + wrongQuestions +
                '}';
    }
}
