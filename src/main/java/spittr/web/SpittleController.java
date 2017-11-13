package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import spittr.data.SpittleRepository;

/**
 * @author: xiaobei
 * @createTime: 2017-11-14 7:16
 * @since: JDK 1.8
 * @description: 在模型中放入最新的spittle列表
 */
@Controller
@RequestMapping("/spittles")
public class SpittleController {

    private SpittleRepository spittleRepository;

    @Autowired
    public SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }
}
