import java.sql.*;
import java.util.Scanner;

class p48 {
    public static void main(String args[]) throws Exception {
        Connection con = DBConnection.getConnection();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int r = sc.nextInt();

        System.out.print("Enter Name: ");
        String n = sc.next();

        System.out.print("Enter Marks: ");
        int m = sc.nextInt();

        String q = "INSERT INTO STUDENT VALUES(?, ?, ?)";

        PreparedStatement ps = con.prepareStatement(q);

        ps.setInt(1, r);
        ps.setString(2, n);
        ps.setInt(3, m);

        int i = ps.executeUpdate();

        if (i > 0)
            System.out.println("Record Inserted Successfully");

        ps.close();
        con.close();
        sc.close();
    }
}