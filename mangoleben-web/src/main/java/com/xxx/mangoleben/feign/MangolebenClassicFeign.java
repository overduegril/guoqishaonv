package com.xxx.mangoleben.feign;

import com.xxx.mangoleben.common.pojo.Classic;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * <p>Description:</p>
 * <p>Copyright: Copyright (c)2019$</p>
 * <p>Company: Tope</p>
 * <P>Created Date :2019$-08$-24$</P>
 * <P>@version 1.0</P>
 */
@FeignClient("mangolebenClassic")
public interface MangolebenClassicFeign {

    @GetMapping("/classic/getLatestClassic")
    public Classic getLatestClassic();

    @GetMapping("/classic/getNextClassic/{classIndex}")
    public Classic getNextClassic(@PathVariable("classIndex") Long classIndex);

    @GetMapping("/classic/getPreviousClassic/{classIndex}")
    public Classic getPreviousClassic(@PathVariable("classIndex") Long classIndex);
}
