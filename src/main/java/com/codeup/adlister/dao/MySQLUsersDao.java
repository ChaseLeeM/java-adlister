package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLUsersDao

        public MySQLUsersDao() {
            try {
                DriverManager.registerDriver(new Driver());
                connection = DriverManager.getConnection(
                        Config.getUrl(),
                        Config.getUser(),
                        Config.getPassword()
                );
            } catch (SQLException e) {
                throw new RuntimeException("Error connecting to the database!", e);
            }
        }

interface Users {
    User findByUsername(String username);
    Long insert(User user);


}

