package com.xxx.mangoleben.controller;

import com.xxx.mangoleben.common.BaseController;
import com.xxx.mangoleben.common.pojo.Classic;
import com.xxx.mangoleben.feign.MangolebenClassicFeign;
import com.xxx.mangoleben.feign.MangolebenLikeFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Description:</p>
 * <p>Copyright: Copyright (c)2019$</p>
 * <p>Company: Tope</p>
 * <P>Created Date :2019$-08$-24$</P>
 * <P>@version 1.0</P>
 */
@RestController
@RequestMapping("/mllike")
public class LikeController extends BaseController{

    @Autowired
    private MangolebenLikeFeign mangolebenLikeFeign;

    @GetMapping("/getFavNum/{classicID}")
    public Object getLastestClassic(@PathVariable Long classicID) {
        Integer favNum = mangolebenLikeFeign.getFavNum(classicID);
        return  renderSuccess(favNum) ;
    }

}
