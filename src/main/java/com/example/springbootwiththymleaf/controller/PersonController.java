package com.example.springbootwiththymleaf.controller;

import com.example.springbootwiththymleaf.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class PersonController {

    @GetMapping("person")
    public ModelAndView displayForm(Model model){
        Person personObj =  new Person();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("person", personObj);
        modelAndView.setViewName("personView");
        return modelAndView;
    }
    @PostMapping("savePerson")
    public ModelAndView savePerson(@Valid Person person, BindingResult result,Model model){
        System.out.println(person);
        ModelAndView modelAndView = new ModelAndView();
        if(result.hasErrors()) {
            modelAndView.setViewName("personView");
            return modelAndView;
        }
        modelAndView.addObject("msg", person.getName()+"record saved successfully");
        modelAndView.setViewName("personViewData");
        return modelAndView;
    }


}
