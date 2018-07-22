package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by eraym on 22.07.2018.
 */

@Component("javacilar")
public class JavaDao {

    @Autowired
    private DataSource dataSource;

    public List<Javaci> javaciList(){

        String query = "select * from kodcu.java";
        Connection connection=null;
        List<Javaci> list = new ArrayList<>();

        try {
            connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                list.add(new Javaci(resultSet.getInt("no"), resultSet.getString("isim"), resultSet.getString("soyisim")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        finally {
            try {
                connection.close();
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
        return list;
    }
}
