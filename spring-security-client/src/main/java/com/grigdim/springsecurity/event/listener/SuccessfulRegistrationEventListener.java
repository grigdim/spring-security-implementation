package com.grigdim.springsecurity.event.listener;

import com.grigdim.springsecurity.entity.User;
import com.grigdim.springsecurity.event.SuccessfulRegistrationEvent;
import com.grigdim.springsecurity.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Slf4j
public class SuccessfulRegistrationEventListener implements ApplicationListener<SuccessfulRegistrationEvent> {

    @Autowired
    private UserService userService;

    @Override
    public void onApplicationEvent(SuccessfulRegistrationEvent event) {
        //Create the verification toke for the User with link
        User user = event.getUser();
        String token = UUID.randomUUID().toString();
        userService.saveVerificationTokenForUser(token, user);
        //send email to user
        String url = event.getApplicationUrl() + "/verifyRegistration?token=" + token;

        //sendVerificationEmail()
        log.info("Click the link to verify your account: {}", url);
    }
}
