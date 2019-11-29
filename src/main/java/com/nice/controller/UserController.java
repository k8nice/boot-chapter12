package com.nice.controller;

import com.nice.pojo.User;
import com.nice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * The current class is   ...
 * This ide name is IntelliJ IDEA.
 * The current project name is boot-chapter12.
 * The current package name is com.nice.controller.
 *
 * @author nice
 * @version jdk1.8
 * @date 2019/11/29 9:50
 */
@Controller
@RequestMapping
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    @ResponseBody
    public User getUser(Long id) {
        return userService.getUserById(id);
    }

}
