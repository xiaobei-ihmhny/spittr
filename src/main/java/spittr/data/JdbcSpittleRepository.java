package spittr.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;
import spittr.Spittle;

import java.util.List;

/**
 * @author: xiaobei
 * @createTime: 2017-11-14 7:21
 * @since: JDK 1.8
 * @description: SpittleRepository的jdbc实现
 */
@Repository
public class JdbcSpittleRepository implements SpittleRepository {

    private JdbcOperations jdbc;

    /**
     * 需要有DataConfig类中的JdbcOperations的bean才行！！！
     * @param jdbc
     */
    @Autowired
    public JdbcSpittleRepository(JdbcOperations jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public List<Spittle> findSpittles(long max, int count) {
        return null;
    }
}
