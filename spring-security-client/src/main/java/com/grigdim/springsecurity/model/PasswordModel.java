package com.grigdim.springsecurity.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@Entity
public class PasswordModel {
    private String email;
    private String oldPassword;
    private String newPassword;
}
