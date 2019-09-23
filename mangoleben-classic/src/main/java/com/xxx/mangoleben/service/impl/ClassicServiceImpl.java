package com.xxx.mangoleben.service.impl;

import com.xxx.mangoleben.mapper.ClassicMapper;
import com.xxx.mangoleben.pojo.Classic;
import com.xxx.mangoleben.service.ClassicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>Description:</p>
 * <p>Copyright: Copyright (c)2019$</p>
 * <p>Company: Tope</p>
 * <P>Created Date :2019$-08$-23$</P>
 * <P>@version 1.0</P>
 */
@Service
public class ClassicServiceImpl implements ClassicService {

    @Autowired
    private ClassicMapper classicMapper;

    @Override
    public Classic getLatestClassic(){
        Classic latestClassic = classicMapper.getLatestClassic();
        return latestClassic;
    }

    @Override
    public Classic getNewClassic(Long classicIndex, Integer changeIndex) {
        Classic nextClassic = classicMapper.getNewClassic(classicIndex, changeIndex);
        return nextClassic;
    }

}
