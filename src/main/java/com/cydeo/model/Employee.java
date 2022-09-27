package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private String firstName;
    private String lastName;

    //Thymeleaf accepts yyyy-MM-dd, but LocalDate accepts differently!
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDay;

    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;



}
