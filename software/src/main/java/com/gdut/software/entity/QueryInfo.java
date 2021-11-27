package com.gdut.software.entity;

public class QueryInfo {
    private String information;
    private String kind;
    private int id;
    private int page;
    private int size;

    public QueryInfo() {
    }

    public QueryInfo(String information, String kind, int id, int page, int size) {
        this.information = information;
        this.kind = kind;
        this.id = id;
        this.page = page;
        this.size = size;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "QueryInfo{" +
                "information='" + information + '\'' +
                ", id=" + id +
                ", page=" + page +
                ", size=" + size +
                '}';
    }
}
