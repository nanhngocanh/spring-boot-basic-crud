package com.facenet.bt180622.repository;

import com.facenet.bt180622.dto.BookSupplierDTO;
import com.facenet.bt180622.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
