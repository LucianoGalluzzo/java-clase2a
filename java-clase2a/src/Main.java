import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        //GregorianCalendar gregorianCalendar= new GregorianCalendar(32,11,31);
        System.out.println(StringUtil.rpad("2500", 11, 'T'));
        System.out.println(StringUtil.ltrim("    Hola chau   ") + 'X');
        System.out.println(StringUtil.rtrim("    Hola chau   ") + 'X');
        System.out.println(StringUtil.trim("    Hola chau   ") + 'X');
        System.out.println(StringUtil.indexOfN("Buenos dias y buenas tardes", 's', 2));

        //System.out.println(gregorianCalendar.getTimeZone());
    }
}
