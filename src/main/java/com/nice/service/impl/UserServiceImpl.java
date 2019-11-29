package com.nice.service.impl;

import com.nice.mapper.UserMapper;
import com.nice.pojo.User;
import com.nice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The current class is   ...
 * This ide name is IntelliJ IDEA.
 * The current project name is boot-chapter12.
 * The current package name is com.nice.service.impl.
 *
 * @author nice
 * @version jdk1.8
 * @date 2019/11/29 9:48
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Long id) {
        return userMapper.getUser(id);
    }
}
