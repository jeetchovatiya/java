import java.sql.*;
import java.util.Scanner;

class p44 {
    public static void main(String args[]) throws Exception {
        Connection con = DBConnection.getConnection();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int r = sc.nextInt();

        System.out.print("Enter Name: ");
        String n = sc.next();

        System.out.print("Enter Marks: ");
        int m = sc.nextInt();

        Statement st = con.createStatement();

        String q = "INSERT INTO STUDENT VALUES("
                 + r + ", '" + n + "', " + m + ")";

        int i = st.executeUpdate(q);

        if (i > 0)
            System.out.println("Record Inserted Successfully");

        st.close();
        con.close();
        sc.close();
    }
}