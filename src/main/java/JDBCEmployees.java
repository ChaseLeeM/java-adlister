import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCEmployees {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employees?allowPublicKeyRetrieval=true&useSSL=false";
        String username = "root";
        String password = "codeup";
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM employees LIMIT 10");
            System.out.println(connection);
                        while (rs.next()) {
                System.out.println(rs.getString("first_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
