package main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Comp14 on 22/08/2017.
 */
public class Utils {

    public static Date convertDateFormat(String dateStr) throws ParseException {

        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        Date date = dateFormat.parse("21/08/2017") ;
        return date;
    }

    public static Date convertDateCalendar(String dateStr) throws ParseException {
        String [] strs = dateStr.split("/");
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR,Integer.valueOf(strs[2]));
        calendar.set(Calendar.MONTH,Integer.valueOf(strs[1]));
        calendar.set(Calendar.DATE,Integer.valueOf(strs[0]));
        return calendar.getTime();

    }
}
