package pers.caijx.chapter2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.caijx.chapter2.properties.MyProperties1;

/**
 * Created by caijx on 2018/9/26/026.
 */
@RequestMapping("/properties")
@RestController
public class PropertiesController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PropertiesController.class);

    private final MyProperties1 myProperties1;

    /**
     * Spring4.x 以后，推荐使用构造函数的形式注入属性
     * @param myProperties1
     */
    public PropertiesController(MyProperties1 myProperties1) {
        this.myProperties1 = myProperties1;
    }

    @GetMapping("/1")
    public MyProperties1 getMyProperties1() {
        LOGGER.info("=============================");
        LOGGER.info(myProperties1.toString());
        LOGGER.info("=============================");
        return myProperties1;
    }
}
