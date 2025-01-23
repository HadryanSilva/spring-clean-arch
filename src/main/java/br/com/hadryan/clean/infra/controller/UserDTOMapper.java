package br.com.hadryan.clean.infra.controller;

import br.com.hadryan.clean.domain.entity.User;
import org.springframework.stereotype.Component;

public class UserDTOMapper {

    CreateUserResponse toResponse(User user) {
        return new CreateUserResponse(user.getUsername(), user.getEmail());
    }

    User toUser(CreateUserRequest request) {
        return new User(request.username(), request.password(), request.email());
    }

}
