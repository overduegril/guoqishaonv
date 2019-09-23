package com.xxx.mangoleben.feign;

import com.xxx.mangoleben.common.pojo.Book;
import com.xxx.mangoleben.common.pojo.Classic;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * <p>Description:</p>
 * <p>Copyright: Copyright (c)2019$</p>
 * <p>Company: Tope</p>
 * <P>Created Date :2019$-09$-18$</P>
 * <P>@version 1.0</P>
 */
@FeignClient("mangolebenBook")
public interface MangolebenBookFeign {
    @GetMapping("/book/listBook")
    public List<Book> listBook();
}
