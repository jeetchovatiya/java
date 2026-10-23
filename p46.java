import java.sql.*;
import java.util.Scanner;

class p46 {
    public static void main(String args[]) throws Exception {
        Connection con = DBConnection.getConnection();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int r = sc.nextInt();

        System.out.print("Enter New Marks: ");
        int m = sc.nextInt();

        Statement st = con.createStatement();

        String q = "UPDATE STUDENT SET MARKS = "
                 + m + " WHERE ROLLNO = " + r;

        int i = st.executeUpdate(q);

        if (i > 0)
            System.out.println("Record Updated Successfully");
        else
            System.out.println("Record Not Found");

        st.close();
        con.close();
        sc.close();
    }
}