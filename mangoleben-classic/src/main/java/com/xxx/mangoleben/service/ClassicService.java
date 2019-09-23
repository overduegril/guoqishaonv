package com.xxx.mangoleben.service;

import com.xxx.mangoleben.pojo.Classic;
import org.springframework.stereotype.Service;

/**
 * <p>Description:</p>
 * <p>Copyright: Copyright (c)2019$</p>
 * <p>Company: Tope</p>
 * <P>Created Date :2019$-08$-20$</P>
 * <P>@version 1.0</P>
 */
@Service
public interface ClassicService {

    Classic getLatestClassic();

    Classic getNewClassic(Long classicIndex, Integer changeIndex);

}
