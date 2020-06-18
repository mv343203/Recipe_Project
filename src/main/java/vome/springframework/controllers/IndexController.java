package vome.springframework.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import vome.springframework.domain.Category;
import vome.springframework.domain.UnitOfMeasure;
import vome.springframework.repositories.CategoryRepository;
import vome.springframework.repositories.UnitOfMeasureRepository;
import vome.springframework.services.RecipeService;

import java.util.Optional;

@Controller//adds into Spring IoC
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
