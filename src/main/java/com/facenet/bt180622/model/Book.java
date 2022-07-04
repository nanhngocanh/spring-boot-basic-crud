package com.facenet.bt180622.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Book {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private int id;
    @Basic
    @Column(name = "NAME", nullable = true, length = 255)
    private String name;
    @Basic
    @Column(name = "SUPPLIER_ID", nullable = true)
    private Integer supplierId;
    @Basic
    @Column(name = "AUTHOR", nullable = true, length = 255)
    private String author;
    @Basic
    @Column(name = "PUBLISHED_DAY", nullable = true)
    private Date publishedDay;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SUPPLIER_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    private Supplier supplierBySupplierId;

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

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublishedDay() {
        return publishedDay;
    }

    public void setPublishedDay(Date publishedDay) {
        this.publishedDay = publishedDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && Objects.equals(name, book.name) && Objects.equals(supplierId, book.supplierId) && Objects.equals(author, book.author) && Objects.equals(publishedDay, book.publishedDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, supplierId, author, publishedDay);
    }

    public Supplier getSupplierBySupplierId() {
        return supplierBySupplierId;
    }

    public void setSupplierBySupplierId(Supplier supplierBySupplierId) {
        this.supplierBySupplierId = supplierBySupplierId;
    }
}
