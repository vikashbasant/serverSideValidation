package com.example.demo.entity;

import lombok.Data;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class LoginData {

    @NotBlank(message = "User Name can not be empty!!!")
    @Size(min=3, max=20, message = "User name must be between 3-20 characters")
    private String userName;

    // Here we can use the regular expression: for checking the validation:
    // @Pattern and @Email both are same!
    @Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")
    private String email;

    @AssertTrue(message = "Must agree terms and condition.")
    private boolean agreed;

}
