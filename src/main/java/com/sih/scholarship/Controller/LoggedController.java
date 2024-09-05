package com.sih.scholarship.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoggedController {

    @RequestMapping(value = "/logged")
    public String logged(Model model) {
        return "logged";
    }
}
