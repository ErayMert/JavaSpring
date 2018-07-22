package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by eraym on 22.07.2018.
 */

@Component("javaManDao2")
public class DaoNameParameter {

    private DataSource dataSource;
    private NamedParameterJdbcTemplate parameterJdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        parameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public void create(JavaMan javaMan){
        String sql;
        sql = "INSERT INTO javaman(id, firstName, lastName) values (:id, :firstName, :lastName)";
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("id", javaMan.getId());
        parameters.put("firstName", javaMan.getFirstName());
        parameters.put("lastName",javaMan.getLastName());

        parameterJdbcTemplate.update(sql, parameters);
    }

    public List<JavaMan> manList(){
        List<JavaMan> list;
        list = parameterJdbcTemplate.query("select * from javaman", new JavaManMapper());

        return list;
    }
}
