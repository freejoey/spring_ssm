package com.mx.controller;

import com.mx.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;


@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @PostConstruct
    public void init() {
        System.out.println("init UserController --- ");
    }

    @RequestMapping("/get")
    public String get(ModelMap model, long id) {
        model.addAttribute("name", "my name:" + userService.getName(id));
        return "user_info";
    }

//    @Override
//    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
//        System.out.println("handle...");
//        ModelAndView mav = new ModelAndView("index.jsp");
//        mav.addObject("message", "Hello Spring MVC");
//        return mav;
//    }
}
