package com.techno.technoglitch;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {

    @GetMapping("/default")
      public ModelAndView defaultPage(){
        ModelAndView modelAndView= new ModelAndView();
        modelAndView.addObject("IT'S DEFAULT");
        return modelAndView;
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
