package com.nice.enumeration;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * The current class is   ...
 * This ide name is IntelliJ IDEA.
 * The current project name is boot-chapter12.
 * The current package name is com.nice.enumeration.
 *
 * @author
 * @version jdk1.8
 * @date 2019/11/28 14:48
 */
@Getter
public enum SexEnum {
    MALE(1,"男"),
    FEMALE(2,"女");


    private Integer id;
    private String name;

    SexEnum(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public  static SexEnum getEnumById(Integer id) {
        for (SexEnum sex : SexEnum.values()) {
            if (sex.getId() == id) {
                return sex;
            }
        }
        return null;
    }
}
