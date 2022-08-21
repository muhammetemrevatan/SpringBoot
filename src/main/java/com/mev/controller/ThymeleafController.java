package com.mev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ThymeleafController {

    @GetMapping("/thymeleaf1")
    public String getThymeleaf1(){
        return "thymeleaf1";
    }
    @GetMapping("/thymeleaf2")
    public String getThymeleafModel(Model model){
        model.addAttribute("key_model","I came than model");
        return "thymeleaf1";
    }
    @GetMapping("/diffrentthymeleaf")
    public String getDifferentThymeleafModel(Model model){
        model.addAttribute("key_model1","I came than different model");
        return "different_template/template";
    }
    @GetMapping("/thymeleaf4")
    public String getThymeleaf3(Model model){
        model.addAttribute("key_model2","I came than thymeleaf3");
        return "thymeleaf4";
    }
}
