package br.com.hadryan.clean.domain.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private String username;
    private String password;
    private String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
}
