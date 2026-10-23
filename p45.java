import java.sql.*;

class p45 {
    public static void main(String args[]) throws Exception {
        Connection con = DBConnection.getConnection();

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(
            "SELECT * FROM STUDENT"
        );

        while (rs.next()) {
            System.out.println("Roll No: " + rs.getInt(1));
            System.out.println("Name: " + rs.getString(2));
            System.out.println("Marks: " + rs.getInt(3));
            System.out.println("----------------");
        }

        rs.close();
        st.close();
        con.close();
    }
}