import java.sql.*;

class p49 {
    public static void main(String args[]) throws Exception {
        Connection con = DBConnection.getConnection();

        String q = "SELECT * FROM STUDENT WHERE MARKS >= ?";

        PreparedStatement ps = con.prepareStatement(q);
        ps.setInt(1, 0);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println(
                rs.getInt("ROLLNO") + " " +
                rs.getString("NAME") + " " +
                rs.getInt("MARKS")
            );
        }

        rs.close();
        ps.close();
        con.close();
    }
}