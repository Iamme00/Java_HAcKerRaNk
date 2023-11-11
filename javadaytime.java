import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.io.*;
import java.util.Calendar;
import java.text.ParseException;

class Result {

   public static String findDay(int month, int day, int year) {
        String f1= Integer.toString(month);
        String f2= Integer.toString(day);
        String f3= Integer.toString(year);
        String date= f1+" "+f2+" "+f3;
        SimpleDateFormat frm= new SimpleDateFormat("MM dd yyyy");
        try {
            Date frm1 = frm.parse(date);
            Calendar c = Calendar.getInstance();
            c.setTime(frm1);
            int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
            String[] days = new String[] {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
            return days[dayOfWeek - 1];
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
        
    }

}

public class javadaytime {
    public static void main(String[] args) throws IOException {
        int month= 3;
        int day =9;
        int year = 2022;
        String res = Result.findDay(month, day, year);
        System.out.println(res);
    }
}
