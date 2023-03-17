package com.codeup.adlister.dao;
import java.sql.Connection;
import java.sql.SQLException;

public class DaoFactory {
    private static Ads adsDao;
    private static Users usersDao;


    public static Ads getAdsDao(){
        if (adsDao == null) {
            adsDao = new MySQLAdsDao( new Config());
        }
        return adsDao;
    }

    public static Users getUsersDao() throws SQLException {
        if (usersDao == null) {
            usersDao = new MySQLUsersDao(new Config());
        }
        return usersDao;
    }
}
