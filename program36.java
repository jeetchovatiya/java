import java.util.Calendar;

public class program36 {
public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        System.out.println("Different Calendar Information:");

        System.out.println("Year          : " +
                cal.get(Calendar.YEAR));

        System.out.println("Month         : " +
                (cal.get(Calendar.MONTH) + 1));

        System.out.println("Day           : " +
                cal.get(Calendar.DAY_OF_MONTH));

        System.out.println("Day of Week   : " +
                cal.get(Calendar.DAY_OF_WEEK));

        System.out.println("Day of Year   : " +
                cal.get(Calendar.DAY_OF_YEAR));

        System.out.println("Week of Year  : " +
                cal.get(Calendar.WEEK_OF_YEAR));

        System.out.println("Hour          : " +
                cal.get(Calendar.HOUR));

        System.out.println("Minute        : " +
                cal.get(Calendar.MINUTE));

        System.out.println("Second        : " +
                cal.get(Calendar.SECOND));
    }
}
