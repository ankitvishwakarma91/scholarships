package com.sih.scholarship.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationController {


    @RequestMapping(value = "/reg")
    public String registrationDisplay(){
        return "registration";
    }
}
