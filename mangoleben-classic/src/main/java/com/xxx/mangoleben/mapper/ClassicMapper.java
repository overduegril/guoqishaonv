package com.xxx.mangoleben.mapper;

import com.xxx.mangoleben.pojo.Classic;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * <p>Description:</p>
 * <p>Copyright: Copyright (c)2019$</p>
 * <p>Company: Tope</p>
 * <P>Created Date :2019$-08$-20$</P>
 * <P>@version 1.0</P>
 */
@Repository
public interface ClassicMapper {

     Classic getLatestClassic();

     Classic getNewClassic(@Param("classicIndex") Long classicIndex, @Param("changeIndex") Integer changeIndex);
}
