package com.xxx.mangoleben.controller;

import com.xxx.mangoleben.common.BaseController;
import com.xxx.mangoleben.common.pojo.Book;
import com.xxx.mangoleben.common.pojo.Classic;
import com.xxx.mangoleben.feign.MangolebenBookFeign;
import com.xxx.mangoleben.feign.MangolebenClassicFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/mlbook")
public class BookController extends BaseController {
    @Autowired
    private MangolebenBookFeign mangolebenBookFeign;

    @GetMapping("/listBook")
    public Object getLastestClassic() {
        List<Book> books = mangolebenBookFeign.listBook();
        return  renderSuccess(books) ;
    }
}
