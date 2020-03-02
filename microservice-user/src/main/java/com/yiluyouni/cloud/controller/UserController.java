package com.yiluyouni.cloud.controller;

import com.yiluyouni.cloud.entity.User;
import com.yiluyouni.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUserById", method = RequestMethod.GET)
    public User getUserById(@RequestParam("id") Long id) {
        return userService.getUserById(id);
    }
}
