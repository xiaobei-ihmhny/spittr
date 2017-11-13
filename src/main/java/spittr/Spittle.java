package spittr;


import lombok.Data;

import java.util.Date;

/**
 * @author: xiaobei
 * @createTime: 2017-11-14 6:44
 * @since: JDK 1.8
 * @description: Spittle类，包含消息内容、时间戳和位置信息
 */
@Data
public class Spittle {

    private final Long id;
    private final String message;
    private final Date time;
    private final Double latitude;
    private final Double longitude;


}
