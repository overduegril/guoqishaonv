package com.xxx.mangoleben.controller;

import com.xxx.mangoleben.pojo.Classic;
import com.xxx.mangoleben.service.ClassicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Description:</p>
 * <p>Copyright: Copyright (c)2019$</p>
 * <p>Company: Tope</p>
 * <P>Created Date :2019$-08$-23$</P>
 * <P>@version 1.0</P>
 */
@RestController
@RequestMapping("/classic")
public class ClassicController {

    @Autowired
    private ClassicService classicService;

    @RequestMapping("/getLatestClassic")
        public Classic getLastestClassic() {
        Classic latestClassic = classicService.getLatestClassic();
        return latestClassic;
    }

    @RequestMapping("/getNextClassic/{classicIndex}")
    public Classic getNextClassic(@PathVariable Long classicIndex) {
        Classic latestClassic = classicService.getNewClassic(classicIndex,-1);
        return latestClassic;
    }

    @RequestMapping("/getPreviousClassic/{classicIndex}")
    public Classic getPreviousClassic(@PathVariable Long classicIndex) {
        Classic latestClassic = classicService.getNewClassic(classicIndex,1);
        return latestClassic;
    }
}
