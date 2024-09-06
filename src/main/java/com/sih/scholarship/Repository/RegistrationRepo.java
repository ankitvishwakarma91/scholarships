package com.sih.scholarship.Repository;

import com.sih.scholarship.Model.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RegistrationRepo {

    private JdbcTemplate jdbcTemplate;


    @Autowired
    public RegistrationRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public int saveContactMessage(Registration registration) {
        String sql = "INSERT INTO REGISTRATION_PAGE (FIRSTNAME, MIDDLENAME,LASTNAME, EMAIL, MOBILENO, ADDRESS, CITY, PASSWORD) VALUES (?, ?, ?, ?, ?, ?, ?,?)";
        return this.jdbcTemplate.update(sql, registration.getFirstName(), registration.getMiddleName(), registration.getLastName(), registration.getEmail(), registration.getAddress(), registration.getCity(), registration.getPassword());
    }
}
