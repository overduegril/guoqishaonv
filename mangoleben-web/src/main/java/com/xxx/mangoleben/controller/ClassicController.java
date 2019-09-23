package com.xxx.mangoleben.controller;

import com.xxx.mangoleben.common.BaseController;
import com.xxx.mangoleben.common.pojo.Classic;
import com.xxx.mangoleben.feign.MangolebenClassicFeign;
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
@RequestMapping("/mlclassic")
public class ClassicController extends BaseController {

    @Autowired
    private MangolebenClassicFeign mangolebenClassicFeign;

    @GetMapping("/getLatestClassic")
    public Object getLastestClassic() {
        Classic latestClassic = mangolebenClassicFeign.getLatestClassic();
        return  renderSuccess(latestClassic) ;
    }

    @GetMapping("/getNextClassic/{classicIndex}")
    public Object getNextClassic(@PathVariable Long classicIndex) {
        Classic nextClassic = mangolebenClassicFeign.getNextClassic(classicIndex);
        return  renderSuccess(nextClassic) ;
    }

    @GetMapping("/getPreviousClassic/{classicIndex}")
    public Object getPreviousClassic(@PathVariable Long classicIndex) {
        Classic nextClassic = mangolebenClassicFeign.getPreviousClassic(classicIndex);
        return  renderSuccess(nextClassic) ;
    }

}
