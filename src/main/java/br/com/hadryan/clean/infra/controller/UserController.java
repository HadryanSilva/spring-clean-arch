package br.com.hadryan.clean.infra.controller;

import br.com.hadryan.clean.application.usecase.CreateUserInteractor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private final CreateUserInteractor createUserInteractor;
    private final UserDTOMapper userDTOMapper;


    @PostMapping
    public ResponseEntity<CreateUserResponse> createUser(@RequestBody CreateUserRequest request) {
        var user = userDTOMapper.toUser(request);
        var savedUser = createUserInteractor.createUser(user);
        var response = userDTOMapper.toResponse(savedUser);
        return ResponseEntity
                .created(URI.create("/api/v1/user/" + response.username()))
                .body(response);
    }

}
