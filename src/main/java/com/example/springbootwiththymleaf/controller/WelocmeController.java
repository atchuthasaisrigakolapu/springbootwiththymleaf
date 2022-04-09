package com.example.springbootwiththymleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelocmeController {

    @GetMapping("welcome")
    public ModelAndView welcomeMessage(@RequestParam("name") String name , Model model){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "welcome amma nanna");
        modelAndView.setViewName("index");
        return modelAndView;
    }

}
