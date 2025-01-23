package br.com.hadryan.clean.application.usecase;

import br.com.hadryan.clean.application.gateway.UserGateway;
import br.com.hadryan.clean.domain.entity.User;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateUserInteractor {

    private final UserGateway userGateway;

    public User createUser(User user) {
        return userGateway.createUser(user);
    }

}
