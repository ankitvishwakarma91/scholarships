package com.sih.scholarship.Services;

import com.sih.scholarship.Model.Registration;
import com.sih.scholarship.Repository.RegistrationRepo;
import com.sih.scholarship.ScholarshipApplication;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RegistrationService {


  @Autowired
    private RegistrationRepo registrationRepo;

    public RegistrationService() {
        System.out.println("Registration Service");
    }

    public boolean saveMessageDetails(Registration registration) {
        boolean isSaved = true;
        log.info(registration.toString());
        return isSaved;
    }

}
