package com.imc.cqrs.service;


import com.imc.cqrs.dto.UserDTO;
import com.imc.cqrs.model.User;
import com.imc.cqrs.repository.read.UserReadRepository;
import com.imc.cqrs.repository.write.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {


    private final UserRepository userWriteRepository;
    private final UserReadRepository readRepository;

    public Long writeUser(User user) {
        User dbUser = userWriteRepository.save(user);
        return dbUser.getId();
    }

    public UserDTO readUser(Long userId) {
        User user =  readRepository.findById(userId).get();
        return  new UserDTO(user.getId(), user.getName(), user.getCreatedAt());
    }
}
