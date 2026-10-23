import java.sql.*;
import java.util.Scanner;

class p50{
    public static void main(String args[]) throws Exception {
        Connection con = DBConnection.getConnection();
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Update Marks");
        System.out.println("2. Delete Record");
        System.out.print("Enter Choice: ");
        int ch = sc.nextInt();

        if (ch == 1) {
            System.out.print("Enter Roll No: ");
            int r = sc.nextInt();

            System.out.print("Enter New Marks: ");
            int m = sc.nextInt();

            String q =
                "UPDATE STUDENT SET MARKS = ? WHERE ROLLNO = ?";

            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, m);
            ps.setInt(2, r);

            int i = ps.executeUpdate();

            if (i > 0)
                System.out.println("Record Updated Successfully");
            else
                System.out.println("Record Not Found");

            ps.close();

        } else if (ch == 2) {
            System.out.print("Enter Roll No: ");
            int r = sc.nextInt();

            String q = "DELETE FROM STUDENT WHERE ROLLNO = ?";

            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, r);

            int i = ps.executeUpdate();

            if (i > 0)
                System.out.println("Record Deleted Successfully");
            else
                System.out.println("Record Not Found");

            ps.close();

        } else {
            System.out.println("Invalid Choice");
        }

        con.close();
        sc.close();
    }
}