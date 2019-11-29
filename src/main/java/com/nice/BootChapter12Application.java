package com.nice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@SpringBootApplication(scanBasePackages = "com.nice")
@EnableJpaRepositories(basePackages = "com.nice.dao")
@EntityScan(basePackages = "com.nice.pojo")
@MapperScan(basePackages = "com.nice.mapper",
            sqlSessionFactoryRef = "sqlSessionFactory",
            sqlSessionTemplateRef = "sqlSessionTemplate",
            annotationClass = Repository.class)
public class BootChapter12Application {

    public static void main(String[] args) {
        SpringApplication.run(BootChapter12Application.class, args);
    }

}
