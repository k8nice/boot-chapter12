package com.nice.interceptor;

import com.nice.enumeration.SexEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The current class is   ...
 * This ide name is IntelliJ IDEA.
 * The current project name is boot-chapter12.
 * The current package name is com.nice.interceptor.
 *
 * @author nice
 * @version jdk1.8
 * @date 2019/11/28 15:26
 */
@MappedJdbcTypes(JdbcType.INTEGER)
@MappedTypes(value = SexEnum.class)
public class SexTypeHandler  extends BaseTypeHandler<SexEnum> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int idx, SexEnum sex, JdbcType jdbcType) throws SQLException {
        ps.setInt(idx,sex.getId());
    }

    @Override
    public SexEnum getNullableResult(ResultSet rs, String col) throws SQLException {
        int sex = rs.getInt(col);
        if (sex != 1 && sex != 2) {
            return null;
        }
        return SexEnum.getEnumById(sex);
    }

    @Override
    public SexEnum getNullableResult(ResultSet cs, int idx) throws SQLException {
        int sex = cs.getInt(idx);
        if (sex != 1 && sex != 2) {
            return null;
        }
        return SexEnum.getEnumById(sex);
    }

    @Override
    public SexEnum getNullableResult(CallableStatement cs, int idx) throws SQLException {
        int sex = cs.getInt(idx);
        if (sex != 1 && sex != 2) {
            return null;
        }
        return SexEnum.getEnumById(sex);
    }
}
