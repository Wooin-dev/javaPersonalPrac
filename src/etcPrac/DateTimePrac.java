package etcPrac;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateTimePrac {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        //// cal 의 출력결과  ////

        //System.out.println(cal);
        //java.util.GregorianCalendar[
        // time=1686290052588,
        // areFieldsSet=true,
        // areAllFieldsSet=true,
        // lenient=true,
        // zone=sun.util.calendar.ZoneInfo[
        //      id="Asia/Seoul",
        //      offset=32400000,
        //      dstSavings=0,
        //      useDaylight=false,
        //      transitions=30,
        //      lastRule=null],
    //      firstDayOfWeek=1,
    //      minimalDaysInFirstWeek=1,
    //      ERA=1,
    //      YEAR=2023,
    //      MONTH=5,
    //      WEEK_OF_YEAR=23,
    //      WEEK_OF_MONTH=2,
    //      DAY_OF_MONTH=9,
    //      DAY_OF_YEAR=160,
    //      DAY_OF_WEEK=6,
    //      DAY_OF_WEEK_IN_MONTH=2,
    //      AM_PM=1,HOUR=2,
    //      HOUR_OF_DAY=14,MINUTE=54,SECOND=12,MILLISECOND=588,
    //      ZONE_OFFSET=32400000,DST_OFFSET=0]
        ////Cal get 메소드//
        System.out.println(cal.get(1)); // 2023
        System.out.println(cal.get(2)); // 5 -> 6월을 의미. 0 -> 1월

        ////Date <-> Cal 변환

        Calendar cal2 = Calendar.getInstance();
        Date date2 = new Date(cal2.getTimeInMillis()); //Cal을 Date로 변환
        System.out.println(date2);

        Date date3 = new Date();
        Calendar cal3 = Calendar.getInstance();
        cal3.setTime(date3);                                  //Date를 Cal로 변환
        System.out.println(cal3);


        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String strLdt = LocalDateTime.now().withNano(0).format(formatter);
        System.out.println(strLdt);

        String strOdt = OffsetDateTime.now().withNano(0).format(formatter);
        System.out.println(strOdt);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-dd-MM F째주 E요일 a XXX",Locale.KOREAN);
        System.out.println(sdf.format(new Date()));
    }
}
