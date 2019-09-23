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
@FeignClient("mangolebenLike")
public interface MangolebenLikeFeign {
    @GetMapping("/like/getFavNum/{classicID}")
    public Integer getFavNum(@PathVariable("classicID") Long classicID);
}
