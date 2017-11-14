package spittr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

/**
 * @author: xiaobei
 * @createTime: 2017-11-15 7:25
 * @since: JDK 1.8
 * @description: 数据库相关操作
 */
@Configuration
public class DataConfig {

    /**
     * TODO 具体含义待查询
     * @return
     */
    @Bean
    public DataSource dataSource(){
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .addScript("schema.sql").build();
    }

    /**
     * 组装jdbcTemplate
     * @param dataSource
     * @return
     */
    @Bean
    public JdbcOperations jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
