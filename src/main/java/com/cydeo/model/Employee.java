package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

//    @NotNull              --->    field shouldn't be null (also, only for String)
//    @NotEmpty             --->    field shouldn't be ""   (also, only for String)
//    @NotBlank             --->    field shouldn't be "    "   (for String, int, or any)

//    @NotNull              --->    @NotNull
//    @NotEmpty             --->    @NotNull+@NotEmpty
//    @NotBlank             --->    @NotNull+@NotEmpty+@NotBlank

    @NotBlank
    @Size(max=12, min=2)
    private String firstName;

//    @NotBlank
//    @Size(max=12, min=2)
    private String lastName;

    //Thymeleaf accepts yyyy-MM-dd, but LocalDate accepts differently!
//    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDay;

//    @NotBlank
//    @Email
    private String email;

    //@NotBlank
    //@Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,}")
    private String password;

    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;



}
