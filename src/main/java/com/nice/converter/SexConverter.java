package com.nice.converter;

import com.nice.enumeration.SexEnum;

import javax.persistence.AttributeConverter;

/**
 * The current class is   ...
 * This ide name is IntelliJ IDEA.
 * The current project name is boot-chapter12.
 * The current package name is com.nice.converter.
 *
 * @author
 * @version jdk1.8
 * @date 2019/11/28 14:47
 */
public class SexConverter  implements AttributeConverter<SexEnum,Integer> {
    @Override
    public Integer convertToDatabaseColumn(SexEnum sex) {
        return sex.getId();
    }

    @Override
    public SexEnum convertToEntityAttribute(Integer id) {
        return SexEnum.getEnumById(id);
    }
}
