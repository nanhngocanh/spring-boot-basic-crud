package com.facenet.bt180622.dto;


import java.util.Date;

public class BookSupplierDTO {
    private int id;
    private String bookName;
    private String bookAuthor;
    private Date bookPublishedDay;
    private String supplierName;

    public BookSupplierDTO() {
    }


    public BookSupplierDTO(int id, String bookName, String bookAuthor,String supplierName, Date bookPublishedDay) {
        this.id = id;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPublishedDay = bookPublishedDay;
        this.supplierName = supplierName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public Date getBookPublishedDay() {
        return bookPublishedDay;
    }

    public void setBookPublishedDay(Date bookPublishedDay) {
        this.bookPublishedDay = bookPublishedDay;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }



    @Override
    public String toString() {
        return "BookSupplierDTO{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPublishedDay=" + bookPublishedDay +
                ", supplierName='" + supplierName + '\'' +
                '}';
    }
}