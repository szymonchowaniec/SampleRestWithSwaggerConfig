package pl.szymonchowanic.SampleRestWithSwaggerConfig.service.impl;

import org.springframework.stereotype.Service;
import pl.szymonchowanic.SampleRestWithSwaggerConfig.entity.User;
import pl.szymonchowanic.SampleRestWithSwaggerConfig.repository.UserRepository;
import pl.szymonchowanic.SampleRestWithSwaggerConfig.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> listOfUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(long id) {
        return userRepository.findOne(id);
    }

    @Override
    public void dropUser(long id) {
        userRepository.delete(id);
    }
}
