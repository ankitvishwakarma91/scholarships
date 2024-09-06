package com.sih.scholarship.Model;


import com.sih.scholarship.ScholarshipApplication;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class Registration {

    @NotBlank(message = "Name must be not blank")
    @Size(min = 3, message = "The size should be greater than 3 character")
    private String firstName;

    @NotBlank(message = "Name must be not blank")
    @Size(min = 3, message = "The size should be greater than 3 character")
    private String middleName;

    @NotBlank(message = "Name must be not blank")
    @Size(min = 3, message = "The size should be greater than 3 character")
    private String lastName;

    @NotBlank(message = "Mobile No  must be not blank")
    @Pattern(regexp = "(^$|[0-9]{10})",message ="Please provide 10 digit no" )
    private String mobileNo;

    @NotBlank(message = "Email must be not blank")
    @Email(message = "Please provide valid email")
    private String email;

    @NotNull(message = "Password can't be null")
    @Size(min = 7, message = "Password should be greater than 7")
    private String password;

    @NotBlank(message = "Please fill the message")
    @Size(min = 10, message = "Message should be greater than 10 words")
    private String Address;

    @NotBlank(message = "Please fill the message")
    @Size(min = 10, message = "City should be greater than 10 words")
    private String city;


}
