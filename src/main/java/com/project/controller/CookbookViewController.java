package com.project.controller;

import com.project.service.CookbookSerivce;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@AllArgsConstructor
@Controller
public class CookbookViewController {
    private CookbookSerivce service;

    @GetMapping("/recipes")
    public String cookbookList(Model model) {
        log.info("/recipes ");
        model.addAttribute("recipes", service.getList());

        return "thymeleaf/recipes";
    }

    @GetMapping("/new-recipe")
    public String newRecipe() {
        return "thymeleaf/newRecipe";
    }
}
