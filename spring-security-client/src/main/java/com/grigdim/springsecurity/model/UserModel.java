package com.grigdim.springsecurity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    private String firstName;
    private String LastName;
    private String email;
    private String password;
    private String matchingPassword;
}
