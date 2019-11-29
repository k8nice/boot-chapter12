//package com.nice.controller;
//
//import com.nice.dao.JpaUserRepository;
//import com.nice.pojo.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
///**
// * The current class is   ...
// * This ide name is IntelliJ IDEA.
// * The current project name is boot-chapter12.
// * The current package name is com.nice.controller.
// *
// * @author nice
// * @version jdk1.8
// * @date 2019/11/28 14:55
// */
//@Controller
//@RequestMapping("/jpa")
//public class JpaController {
//
//    @Autowired
//    private JpaUserRepository jpaUserRepository;
//
//    @RequestMapping("/getUser")
//    @ResponseBody
//    public User getUser(Long id) {
//        User user = jpaUserRepository.findById(id).get();
//        return user;
//    }
//
//}
