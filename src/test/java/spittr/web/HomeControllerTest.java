package spittr.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.assertEquals;

/**
 * @author: xiaobei
 * @createTime: 2017-11-13 21:25
 * @since: JDK 1.8
 * @description: 测试控制器
 */
public class HomeControllerTest {

    @Test
    public void testHomePage() throws Exception {
        //老式的测试controller的方式，只能测试返回值，不能站在springmvc的角度
//        HomeController homeController = new HomeController();
//        assertEquals("home",homeController.home());

        //利用mock Spring MVC并针对控制器执行HTTP请求测试
        HomeController homeController = new HomeController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();
        mockMvc.perform(
                MockMvcRequestBuilders.get("/a"))
                .andExpect(MockMvcResultMatchers.view().name("home"));
    }

}
