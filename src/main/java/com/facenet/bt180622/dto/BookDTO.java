package com.facenet.bt180622.dto;

public class BookDTO {
    private Integer id;
    private String name;
    private Integer supplierId;
    private String author;
    private java.sql.Date publishedDay;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSupplierId() {
        return this.supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public java.sql.Date getPublishedDay() {
        return this.publishedDay;
    }

    public void setPublishedDay(java.sql.Date publishedDay) {
        this.publishedDay = publishedDay;
    }
}
