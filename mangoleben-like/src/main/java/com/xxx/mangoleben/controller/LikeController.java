package com.xxx.mangoleben.controller;

import com.xxx.mangoleben.service.LikeService;
import com.xxx.mangoleben.service.imp.LikeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Description:</p>
 * <p>Copyright: Copyright (c)2019$</p>
 * <p>Company: Tope</p>
 * <P>Created Date :2019$-08$-22$</P>
 * <P>@version 1.0</P>
 */
@RestController
@RequestMapping("/like")
public class LikeController {
    @Autowired
    private LikeService likeService;

    @RequestMapping("/getFavNum/{classicID}")
    public Integer getFavNumByClassicID(@PathVariable Long classicID) {
        Integer favNum = likeService.getFavNumByClassicID(classicID);
        return favNum;
    }
}
