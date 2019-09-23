package com.xxx.mangoleben.service;

import org.springframework.stereotype.Service;

/**
 * <p>Description:</p>
 * <p>Copyright: Copyright (c)2019$</p>
 * <p>Company: Tope</p>
 * <P>Created Date :2019$-08$-22$</P>
 * <P>@version 1.0</P>
 */
public interface LikeService {

    void updateLikeState();

    Integer getFavNumByClassicID(Long classicID);
}
