package com.sih.scholarship.Controller;


import com.sih.scholarship.Model.Registration;
import com.sih.scholarship.Services.RegistrationService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Slf4j
@Controller
public class RegistrationController {


    private final RegistrationService registrationService;
    private static Logger log = LoggerFactory.getLogger(RegistrationController.class);

    @Autowired
    public RegistrationController(RegistrationService registrationService) {
        this.registrationService =registrationService;
    }


    @RequestMapping(value = "/registration")
    public String registrationDisplay(Model model){
        model.addAttribute("registration", new Registration());
        return "registration";
    }

    // Second way of getting detail from frontend using pojo object is contact which is in model package
    @RequestMapping(value = "/saveMsg", method = POST)
    public String saveMessage(@Valid @ModelAttribute("registration") Registration registration, Errors errors) {
        if (errors.hasErrors()) {
            log.error("Contact validation failed due to "+errors.getAllErrors().toString());
            return "registration";
        }
        registrationService.saveMessageDetails(registration);
        return "redirect:/login";
    }


}
