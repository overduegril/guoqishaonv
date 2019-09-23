package com.xxx.mangoleben.pojo;

import lombok.Data;

import java.util.List;

/**
 * <p>Description:</p>
 * <p>Copyright: Copyright (c)2019$</p>
 * <p>Company: Tope</p>
 * <P>Created Date :2019$-09$-18$</P>
 * <P>@version 1.0</P>
 */
@Data
public class Book {
    private String mlID;
    private String author;
    private String title;
    private String category;
    private String image;
    private Integer favNum;
}
