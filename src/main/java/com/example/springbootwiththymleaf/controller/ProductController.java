package com.example.springbootwiththymleaf.controller;

import com.example.springbootwiththymleaf.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

    @GetMapping("product")
    public ModelAndView loadForm(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("product", new Product());
        modelAndView.setViewName("productView");
        return modelAndView;
    }
    @PostMapping("product")
    public ModelAndView handleSubmitBtn(Product product){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("Product:"+product);
        modelAndView.setViewName("successView");
        return modelAndView;
    }


}
