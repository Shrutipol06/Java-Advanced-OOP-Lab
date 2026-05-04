import java.sql.*;

public class UpdateStudent {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college",
                    "root",
                    "root");

            String query = "UPDATE student SET age=21 WHERE id=1";

            Statement st = con.createStatement();

            st.executeUpdate(query);

            System.out.println("Data Updated");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}