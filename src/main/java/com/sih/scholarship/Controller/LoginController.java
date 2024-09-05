package com.sih.scholarship.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {


    @RequestMapping(value = "/login" ,method = {RequestMethod.GET,RequestMethod.POST})
    public String loginPage(@RequestParam(required = false) String username,
                            @RequestParam(required = false) String password){
        return "login";
    }

}
