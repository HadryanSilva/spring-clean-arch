package br.com.hadryan.clean.application.gateway;

import br.com.hadryan.clean.domain.entity.User;

public interface UserGateway {
    User createUser(User user);
}
