import java.sql.*;

public class DeleteStudent {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college",
                    "root",
                    "root");

            String query = "DELETE FROM student WHERE id=1";

            Statement st = con.createStatement();

            st.executeUpdate(query);

            System.out.println("Data Deleted");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}