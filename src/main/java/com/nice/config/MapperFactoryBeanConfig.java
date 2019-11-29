package com.nice.config;

import com.nice.mapper.UserMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


/**
 * The current class is   ...
 * This ide name is IntelliJ IDEA.
 * The current project name is boot-chapter12.
 * The current package name is com.nice.config.
 *
 * @author nice
 * @version jdk1.8
 * @date 2019/11/29 9:05
 */
@Repository
@Configuration
public class MapperFactoryBeanConfig {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Bean
    public MapperFactoryBean<UserMapper> initUserMapper() {
        MapperFactoryBean<UserMapper> bean = new MapperFactoryBean<>();
        bean.setMapperInterface(UserMapper.class);
        bean.setSqlSessionFactory(sqlSessionFactory);
        return bean;
    }

}
