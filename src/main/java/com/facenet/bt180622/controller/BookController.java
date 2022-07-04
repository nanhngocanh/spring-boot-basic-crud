package com.facenet.bt180622.controller;

import com.facenet.bt180622.dto.BookDTO;
import com.facenet.bt180622.dto.BookSupplierDTO;
import com.facenet.bt180622.model.Book;
import com.facenet.bt180622.service.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private ModelMapper modelMapper;

    @GetMapping(value = "/hello")
    public String helloWorld() {
        return "Hello";
    }



    @GetMapping(value = "/all")
    public List<BookDTO> getAll() {
        List<Book> book = bookService.getAll();
        List<BookDTO> bookDTO = book.stream().map(book1->modelMapper.map(book1,BookDTO.class)).collect(Collectors.toList());
        return bookDTO;
    }


    @GetMapping("/book/{id}")
    public BookDTO getBook(@PathVariable("id") Integer id) {
        Optional<Book> book = bookService.getBook(id);
        BookDTO bookDTO = modelMapper.map(book,BookDTO.class);
        return bookDTO;
    }

    @PostMapping("/addBook")
    public BookDTO addBook(@RequestBody Book item) {
        Book book = bookService.addBook(item);
        BookDTO bookDTO = modelMapper.map(book,BookDTO.class);
        return bookDTO;
    }

    @PutMapping("/update/{id}")
    public BookDTO updateBook(@PathVariable("id") Integer id, @RequestBody Book item) {
        Book book = bookService.updateBook(id,item);
        BookDTO bookDTO = modelMapper.map(book,BookDTO.class);
        return bookDTO;
    }
    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable("id") Integer id){
        bookService.deleteBook(id);
        return "deleted";
    }
    @GetMapping("/allInfo")
    public List<BookSupplierDTO> getAllBookInfo(){
        return bookService.getAllBookInfo();
    }

}
