package vome.springframework.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//adds into Spring IoC
public class IndexController {

    //method that returns a string call index which is a thymeleaf template
    @RequestMapping({" ", "/", "/index"})//indicates when we go to one of these URL values we want this page
    public String getIndexPage(){
        return "index";
    }
}
