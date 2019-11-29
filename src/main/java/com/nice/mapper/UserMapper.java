package com.nice.mapper;

import com.nice.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * The current class is   ...
 * This ide name is IntelliJ IDEA.
 * The current project name is boot-chapter12.
 * The current package name is com.nice.mapper.
 *
 * @author nice
 * @version jdk1.8
 * @date 2019/11/28 15:39
 */
@Repository
public interface UserMapper {
    public User getUser(Long id);
}
