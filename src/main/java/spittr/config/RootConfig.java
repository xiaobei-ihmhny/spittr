package spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author: xiaobei
 * @createTime: 2017-11-13 20:47
 * @since: JDK 1.8
 * @description: ContextLoaderListener相关配置
 */
@Configuration
@ComponentScan(basePackages = {"spittr"},
        excludeFilters =
                {@Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)})
public class RootConfig {

}
