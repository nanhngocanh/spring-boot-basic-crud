package com.facenet.bt180622.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Supplier {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private int id;
    @Basic
    @Column(name = "NAME", nullable = true, length = 255)
    private String name;
    @Basic
    @Column(name = "ADDRESS", nullable = true, length = 255)
    private String address;
    @Basic
    @Column(name = "PHONE_NUMBER", nullable = true, length = 11)
    private String phoneNumber;
    @OneToMany(targetEntity = Book.class, mappedBy = "supplierBySupplierId",fetch = FetchType.LAZY)
    private Collection<Book> booksById;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supplier supplier = (Supplier) o;
        return id == supplier.id && Objects.equals(name, supplier.name) && Objects.equals(address, supplier.address) && Objects.equals(phoneNumber, supplier.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, phoneNumber);
    }

    public Collection<Book> getBooksById() {
        return booksById;
    }

    public void setBooksById(Collection<Book> booksById) {
        this.booksById = booksById;
    }
}
