package com.mev.controller;

import com.mev.bean.BeanConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.logging.Logger;

@Controller
public class BeanController {

    private final BeanConfig beanConfig;

    @Autowired
    public BeanController(BeanConfig beanConfig) {
        this.beanConfig = beanConfig;
    }

    @GetMapping("/bean/beanDto")
    @ResponseBody // Herhangi bir html, xhtml gibi yapılar olmadan direk ekranda göstermek için ekledik.
    public String getBeanDto(){

        return beanConfig.beanDto().toString();
    }
}
