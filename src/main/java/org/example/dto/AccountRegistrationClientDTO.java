package org.example.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountRegistrationClientDTO {

    private String name;
    private String surname;
    private String login;
    private String password;
    private String email;

}
