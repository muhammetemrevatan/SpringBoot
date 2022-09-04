package com.mev.controller;

import com.mev.core.PageKey;
import com.mev.dto.TeacherDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@Log4j2
public class FormController {

    @GetMapping("/form")
    public String getForm(Model model){
        model.addAttribute("cv",new TeacherDto());
        return PageKey.VALIDATE_FORM;
    }

    @PostMapping("/form")
    public String postForm(@Valid @ModelAttribute("cv") TeacherDto teacherDto, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            //log.error("Hata var.....");
            return PageKey.VALIDATE_FORM;
        }
        //log.info("Success ! " + teacherDto);

        // Database save area

        return PageKey.SUCCESS;
    }
}
