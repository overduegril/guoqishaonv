package com.xxx.mangoleben.common.pojo;

import lombok.Data;

/**
 * <p>Description: 期刊实体类</p>
 * <p>Copyright: Copyright (c)2019$</p>
 * <p>Company: Tope</p>
 * <P>Created Date :2019$-08$-23$</P>
 * <P>@version 1.0</P>
 */
@Data
public class Classic {
    private Long mlID;
    private Long classicIndex;
    private Integer classicType;
    private String classicContent;
    private String classicTag;
    private String classicImageUrl;
    private String classicMusicUrl;
}
