package com.nice.pojo;

import com.nice.converter.SexConverter;
import com.nice.enumeration.SexEnum;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import javax.persistence.*;
import java.io.Serializable;

/**
 * The current class is   ...
 * This ide name is IntelliJ IDEA.
 * The current project name is boot-chapter12.
 * The current package name is com.nice.pojo.
 *
 * @author nice
 * @version jdk1.8
 * @date 2019/11/28 14:40
 */
//    @Entity(name = "user")
//    @Table(name = "t_user")
    @Data
    @Alias(value = "user")
    public class User {
//        @Id
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id = null;

//        @Column(name = "user_name")
        private String userName;

        private String note;

//        @Convert(converter = SexConverter.class)
        private SexEnum sex = null;
    }
