package com.spring;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by eraym on 22.07.2018.
 */
public class JavaManMapper implements RowMapper<JavaMan>{

    @Override
    public JavaMan mapRow(ResultSet resultSet, int i) throws SQLException {
        return new JavaMan(resultSet.getInt("id"), resultSet.getString("isim"), resultSet.getString("soyisim"));
    }
}
