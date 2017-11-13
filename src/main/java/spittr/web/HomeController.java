package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: xiaobei
 * @createTime: 2017-11-13 20:59
 * @since: JDK 1.8
 * @description: 基本的控制器
 */
@Controller
@RequestMapping({"/a","/homepage"})//value值可以接受一个数组
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String home(){
        return "home";
    }
}
