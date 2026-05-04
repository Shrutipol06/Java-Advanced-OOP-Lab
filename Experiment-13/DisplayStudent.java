import java.sql.*;

public class DisplayStudent {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "root";

        try {
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(url, user, password);

            // SQL Query
            String query = "SELECT * FROM student";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            // Display Data
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name") + " " +
                        rs.getInt("age")
                );
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}