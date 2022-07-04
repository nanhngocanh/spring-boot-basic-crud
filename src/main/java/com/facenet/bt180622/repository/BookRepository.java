package com.facenet.bt180622.repository;

import com.facenet.bt180622.dto.BookSupplierDTO;
import com.facenet.bt180622.model.Book;
import org.apache.catalina.LifecycleState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    @Query("select new com.facenet.bt180622.dto.BookSupplierDTO(b.id, b.name, b.author, s.name, b.publishedDay) from Book b join b.supplierBySupplierId s order by b.id")
    List<BookSupplierDTO> getAllBookInfo();
}
