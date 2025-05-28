package me.dio.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import me.dio.model.User;
import me.dio.repository.UserRepository;
import me.dio.service.UserService;


@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id)
    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuário não encontrado"));
    }

@Override
public User create(User userToCreate) {
    if (userToCreate.getId() != null && userToCreate.getId() != 0 && userRepository.existsById(userToCreate.getId())) {
        throw new IllegalArgumentException("Esse usuário já existe!");
    }

    userToCreate.setId(null); // Força criação de novo registro
    return userRepository.save(userToCreate);
}

}
