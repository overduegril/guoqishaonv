package com.xxx.mangoleben.controller;

import com.xxx.mangoleben.pojo.Book;
import com.xxx.mangoleben.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>Description:</p>
 * <p>Copyright: Copyright (c)2019$</p>
 * <p>Company: Tope</p>
 * <P>Created Date :2019$-09$-18$</P>
 * <P>@version 1.0</P>
 */
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/listBook")
    public List<Book> listBook() {
        List<Book> books = bookService.listBook();
        books.addAll(books);
        books.addAll(books);
        return books;
    }
}
