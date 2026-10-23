import java.sql.*;
import java.util.Scanner;

class p47 {
    public static void main(String args[]) throws Exception {
        Connection con = DBConnection.getConnection();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No to Delete: ");
        int r = sc.nextInt();

        Statement st = con.createStatement();

        String q = "DELETE FROM STUDENT WHERE ROLLNO = " + r;

        int i = st.executeUpdate(q);

        if (i > 0)
            System.out.println("Record Deleted Successfully");
        else
            System.out.println("Record Not Found");

        st.close();
        con.close();
        sc.close();
    }
}