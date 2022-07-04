package com.facenet.bt180622.service;

import com.facenet.bt180622.dto.BookSupplierDTO;
import com.facenet.bt180622.model.Book;
import com.facenet.bt180622.repository.BookRepository;
import com.facenet.bt180622.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAll() {
        return bookRepository.findAll();
    }
    public Optional<Book> getBook(Integer id) {
        return bookRepository.findById(id);
    }
    public Book addBook(Book item){
        return bookRepository.save(item);
    }
    public Book updateBook(Integer id, Book item) {
        Book book = bookRepository.findById(id).get();
        book.setName(item.getName());
        book.setAuthor(item.getAuthor());
        book.setPublishedDay(item.getPublishedDay());
        return bookRepository.save(book);
    }
    public void deleteBook(Integer id) {
        Book book = bookRepository.findById(id).get();
        bookRepository.delete(book);
    }
    public List<BookSupplierDTO> getAllBookInfo(){
        return bookRepository.getAllBookInfo();
    }
}
