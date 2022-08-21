package com.mev.controller;

import com.mev.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeleafController {

    @GetMapping("/thymeleaf1")
    public String getThymeleaf1() {
        return "thymeleaf1";
    }

    @GetMapping("/")
    public String getThymeleaf() {
        return "thymeleaf1";
    }


    @GetMapping("/thymeleaf1/modelAddAttribute")
    public String getThymeleafModel(Model model) {
        model.addAttribute("key_model", "I came than model");
        return "thymeleaf1";
    }

    @GetMapping("/differentThymeleaf")
    public String getDifferentThymeleafModel(Model model) {
        model.addAttribute("key_model1", "I came than different model");
        return "different_template/template";
    }

    @GetMapping("/thymeleaf4")
    public String getThymeleaf3(Model model) {
        model.addAttribute("key_model2", "I came than thymeleaf4");
        return "thymeleaf4";
    }

    @GetMapping("/thymeleaf2")
    public String getThymeleafModelObject(Model model) {
        ProductDto productDto = ProductDto
                .builder()
                .id(0L)
                .productName("Table")
                .productPrice(50)
                .build();
        model.addAttribute("productDto", productDto);

        List<ProductDto> productDtos = new ArrayList<>();
        productDtos.add(new ProductDto(1L, "Pencil", 20));
        productDtos.add(ProductDto.builder().id(2L).productName("Book").productPrice(100).build());
        productDtos.add(ProductDto.builder().id(3L).productName("Calculator").productPrice(200).build());
        productDtos.add(ProductDto.builder().id(4L).productName("Paper").productPrice(5).build());
        model.addAttribute("productDtos", productDtos);
        return "thymeleaf2";
    }
}
