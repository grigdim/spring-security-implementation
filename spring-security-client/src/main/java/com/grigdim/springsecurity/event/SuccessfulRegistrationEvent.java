package com.grigdim.springsecurity.event;

import com.grigdim.springsecurity.entity.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
public class SuccessfulRegistrationEvent extends ApplicationEvent {

    private final User user;
    private final String applicationUrl;

    public SuccessfulRegistrationEvent(User user, String applicationUrl) {
        super(user);
        this.user = user;
        this.applicationUrl = applicationUrl;
    }
}
