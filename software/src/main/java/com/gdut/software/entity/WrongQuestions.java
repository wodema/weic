package com.gdut.software.entity;

public class WrongQuestions {
    private int id;
    private int sid;
    private String question;
    private String kind;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "WrongQuestions{" +
                "id=" + id +
                ", sid=" + sid +
                ", question='" + question + '\'' +
                ", kind='" + kind + '\'' +
                '}';
    }
}
