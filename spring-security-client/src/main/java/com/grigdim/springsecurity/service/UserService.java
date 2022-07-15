package com.grigdim.springsecurity.service;

import com.grigdim.springsecurity.entity.User;
import com.grigdim.springsecurity.entity.VerificationToken;
import com.grigdim.springsecurity.model.PasswordModel;
import com.grigdim.springsecurity.model.UserModel;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService{

    User registerUser(UserModel userModel);

    void saveVerificationTokenForUser(String token, User user);

    String validateVerificationToken(String token);

    VerificationToken generateNewVerificationToken(String oldToken);

    User findByUserEmail(String email);

    void createPasswordResetTokenForUser(User user, String token);

    String validatePasswordResetToken(String token);


    Optional<User> getUserByResetToken(String token);

    void changePassword(User user, String newPassword);

    boolean checkIfValidOldPassword(User user, String oldPassword);
}
