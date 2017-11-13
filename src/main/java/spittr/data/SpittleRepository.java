package spittr.data;

import spittr.Spittle;

import java.util.List;

/**
 * @author: xiaobei
 * @createTime: 2017-11-14 7:03
 * @since: JDK 1.8
 * @description: 数据访问仓库
 */
public interface SpittleRepository {

    List<Spittle> findSpittles(long max, int count);

}
