package dao;

import dao.Config;

import java.sql.Connection;
import java.sql.SQLException;

public class DaoFactory {
//    private static dao.Ads adsDao;
    private static MySQLAdsDao mysqladsdao;

//    public static dao.Ads getAdsDao() throws SQLException {
//        Config config = new Config();
//        if (adsDao == null) {
//            adsDao = new MySQLAdsDao(config);
//        }
//        return adsDao;
//    }

    public static MySQLAdsDao mysqladsdao() throws SQLException{
        Config config = new Config();
        if (mysqladsdao == null) {
            mysqladsdao = new MySQLAdsDao(config);
        }
        return mysqladsdao;
    }
}
