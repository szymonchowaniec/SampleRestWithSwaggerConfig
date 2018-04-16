package pl.szymonchowanic.SampleRestWithSwaggerConfig.service;

import pl.szymonchowanic.SampleRestWithSwaggerConfig.entity.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public interface UserService {

    public User saveUser(User user);

    public List<User> listOfUsers();

    public User getUser(long id);

    public void dropUser(long id);


}
