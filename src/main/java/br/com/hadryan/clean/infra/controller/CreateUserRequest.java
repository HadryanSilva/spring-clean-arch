package br.com.hadryan.clean.infra.controller;

public record CreateUserRequest(String username, String password, String email) {
}
