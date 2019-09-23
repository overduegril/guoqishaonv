package com.xxx.mangoleben.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>Description:</p>
 * <p>Copyright: Copyright (c)2019$</p>
 * <p>Company: Tope</p>
 * <P>Created Date :2019$-08$-22$</P>
 * <P>@version 1.0</P>
 */
@Repository
public interface LikeMapper {
    /**
    * @Description: 修改用户某期刊的喜欢状态
    * @create: 2019-08-23 9:41
    * @update logs
    * @throws Exception
    */
    void updateLikeState();

    /**
    * @Description: 获取不同期刊的喜欢数量
    * @create: 2019-08-23 9:47
    * @update logs
    * @throws Exception
    */
    Integer getFavNumByClassicID(Long classicID);

}
