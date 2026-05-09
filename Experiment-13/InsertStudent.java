import java.sql.*;

public class InsertStudent {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college",
                    "root",
                    "root");

            String query = "INSERT INTO student VALUES(1,'Shruti',20)";

            Statement st = con.createStatement();

            st.executeUpdate(query);

            System.out.println("Data Inserted");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}