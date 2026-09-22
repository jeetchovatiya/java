import java.util.Calendar;

public class program37 {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        System.out.println("Current Date and Time : " + cal.getTime());

        cal.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println("After Adding 10 Days : " + cal.getTime());

        cal.add(Calendar.DAY_OF_MONTH, -5);
        System.out.println("After Subtracting 5 Days : " + cal.getTime());

        cal.add(Calendar.MONTH, 2);
        System.out.println("After Adding 2 Months : " + cal.getTime());

        cal.add(Calendar.MONTH, -1);
        System.out.println("After Subtracting 1 Month : " + cal.getTime());
    }
}
