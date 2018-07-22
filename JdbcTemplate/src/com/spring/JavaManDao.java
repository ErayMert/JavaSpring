package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by eraym on 22.07.2018.
 */

@Component("javaManDao")
public class JavaManDao {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public JavaMan getJavaMan(int id){
        JavaMan javaMan = jdbcTemplate.queryForObject("select * from javaman where id=?", new Object[]{id}, new JavaManMapper());
        return javaMan;

    }

    public List<JavaMan> javaManList(){
        List<JavaMan> javaManList = jdbcTemplate.query("select * from javaman", new JavaManMapper());
        return javaManList;
    }

    public void createJavaMan(String name, String lastName){
        jdbcTemplate.update("INSERT INTO javaman(firstName, lastName ) VALUES (?,?)", name, lastName);
    }
}
