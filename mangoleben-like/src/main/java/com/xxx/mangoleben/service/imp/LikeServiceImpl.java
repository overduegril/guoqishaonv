package com.xxx.mangoleben.service.imp;

import com.xxx.mangoleben.mapper.LikeMapper;
import com.xxx.mangoleben.service.LikeService;
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
public class LikeServiceImpl implements LikeService{
    @Autowired
    private LikeMapper likeMapper;

    /**
    * @Description: 点赞或者取消点赞(这里需要有用户信息才可以实现)
    * @create: 2019-08-23 9:31
    * @update logs
    * @throws Exception
    */
    @Override
    public void updateLikeState() {

    }

    @Override
    public Integer getFavNumByClassicID(Long classicID) {
        Integer favNum = likeMapper.getFavNumByClassicID(classicID);
        return favNum;
    }
}
