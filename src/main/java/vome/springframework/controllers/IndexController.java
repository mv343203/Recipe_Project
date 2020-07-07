package vome.springframework.controllers;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import vome.springframework.domain.Category;
import vome.springframework.domain.UnitOfMeasure;
import vome.springframework.repositories.CategoryRepository;
import vome.springframework.repositories.UnitOfMeasureRepository;
import vome.springframework.services.RecipeService;

import java.util.Optional;
@Slf4j
@Controller//adds into Spring IoC
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        log.debug("Getting index page");
        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
