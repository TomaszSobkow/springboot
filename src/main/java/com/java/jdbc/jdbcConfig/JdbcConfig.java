package com.java.jdbc.jdbcConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConfig {


//    public DataSource getDataSource() {
//        return DataSourceBuilder.create()
//                .driverClassName("com.mysql.cj.jdbc.Driver")
//                .url("jdbc:mysql://192.168.178.100:3306/student?useUnicode=true&characterEncoding=UTF-8&useSSL=false&allowPublicKeyRetrieval=true")
//                .username("student")
//                .password("student")
//                .build();
//    }

    public static Connection connection()  {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://192.168.178.100:3306/student?useSSL=false";
            Connection connection = DriverManager.getConnection(url,"student","student");
            return connection;

        }catch (SQLException e){
            System.out.println("DUPA!!!!!!!!!!!!!!!!!");
            e.printStackTrace();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        return null;
    }
}
