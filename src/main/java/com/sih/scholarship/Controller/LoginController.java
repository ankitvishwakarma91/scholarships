package com.sih.scholarship.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {


//    @RequestMapping(value = "/login" ,method = {RequestMethod.GET,RequestMethod.POST})
//    public String loginPage(@RequestParam(required = false) String username,
//                            @RequestParam(required = false) String password){
//        return "login";
//    }

    @RequestMapping("/login")
    public String loginPage(){
        return "login";
    }

//    @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
//    public String displayLoginPage(@RequestParam(value = "error" , required = false) String error,
//                                   @RequestParam(value = "logout", required = false) String logout, Model model) {
//        String errorMessage = null;
//        if (error != null) {
//            errorMessage = "Invalid username or password !! Please try again !";
//        }
//        if(logout != null){
//            errorMessage = "You have been logged out successfully";
//        }
//        model.addAttribute("errorMessage", errorMessage);
//        return "login";
//    }

}
