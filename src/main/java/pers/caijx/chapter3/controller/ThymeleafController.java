package pers.caijx.chapter3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pers.caijx.chapter3.dto.Author;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by caijx on 2018/10/6/006.
 */
@Controller
@RequestMapping
public class ThymeleafController {

    @GetMapping("/index")
    public ModelAndView index() {
        ModelAndView view = new ModelAndView();
        // 设置跳转的视图 默认映射到 src/main/resources/templates/{viewName}.html
        view.setViewName("index");
        //设置属性
        view.addObject("title","我的第一个web页面");
        view.addObject("desc","欢迎进入swiftdev系统");
        Author author = new Author();
        author.setAge(22);
        author.setName("Kobe");
        author.setEmail("109292@qq.com");
        view.addObject(author);
        return view;
    }

    @GetMapping("/index1")
    public String index1(HttpServletRequest request) {
        //设置属性
        request.setAttribute("title","我的第一个web页面");
        request.setAttribute("desc","欢迎进入swift系统");
        Author author = new Author();
        author.setAge(22);
        author.setName("kobe");
        author.setEmail("109292@qq.com");
        request.setAttribute("author",author);
        // 返回的 index 默认映射到 src/main/resources/templates/xxxx.html
        return "index";
    }

}
