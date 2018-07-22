package com.spring;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by eraym on 22.07.2018.
 */
public class JavaManDao {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

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
        jdbcTemplate.update("INSERT INTO javaman(isim, soyisim ) VALUES (?,?)", name, lastName);
    }
}
