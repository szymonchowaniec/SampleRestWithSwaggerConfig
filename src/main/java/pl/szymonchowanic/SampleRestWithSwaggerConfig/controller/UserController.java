package pl.szymonchowanic.SampleRestWithSwaggerConfig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.szymonchowanic.SampleRestWithSwaggerConfig.entity.User;
import pl.szymonchowanic.SampleRestWithSwaggerConfig.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    private User saveUser(User user){
        return userService.saveUser(user);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    private List<User> getUserList(){
        return userService.listOfUsers();
    }

    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE )
    private User getUser (@PathVariable("id") long id){
        return userService.getUser(id);
    }
    @DeleteMapping(value = "{id}")
    private void dropUser(@PathVariable("id") long id){
        userService.dropUser(id);
    }


}
