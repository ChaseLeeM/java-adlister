package dao;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection;

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e){
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    public List<Ad> all() {
        String selectQuery = "SELECT * FROM ads";
        List<Ad> ads = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(selectQuery);
            while (rs.next()) {
                Ad ad = new Ad(
                        rs.getInt("id"),
                        rs.getInt("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                );
                ads.add(ad);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving all ads.", e);
        }
        return ads;
    }

    public Long insert(Ad ad) {
        try {
            Statement stmt = connection.createStatement();
            String query = String.format("INSERT INTO ads (user_id, title, description) VALUES (%d, '%s', '%s')",
                    ad.getUserId(),
                    ad.getTitle(),
                    ad.getDescription()
            );
            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()){
                return rs.getLong(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new ad.", e);
        }
        return 0L;
    }

    public static void main(String[] args) throws SQLException {
        MySQLAdsDao adsDao = new MySQLAdsDao(new Config());
        Ad ad = new Ad(
                1,
                "Test dao.Ad",
                "This is a test ad."
        );

        adsDao.insert(ad);
        System.out.println(adsDao.all());
    }

}

