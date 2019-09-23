package com.xxx.mangoleben.service.impl;

import com.xxx.mangoleben.mapper.BookMapper;
import com.xxx.mangoleben.pojo.Book;
import com.xxx.mangoleben.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>Description:</p>
 * <p>Copyright: Copyright (c)2019$</p>
 * <p>Company: Tope</p>
 * <P>Created Date :2019$-09$-18$</P>
 * <P>@version 1.0</P>
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> listBook() {
        List<Book> books = bookMapper.listBook();
        return books;
    }
}
