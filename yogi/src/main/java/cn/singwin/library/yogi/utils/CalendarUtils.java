package cn.singwin.library.yogi.utils;

import java.util.Calendar;

/**
 * Calendar Util kit.
 * Created by wisekingokok on 2015/11/23.
 */
public class CalendarUtils {

    /**
     * set calendar hour, minute, second and millisecond to zero.
     * @param c calendar
     */
    public static void zeroCalendar(Calendar c){
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
    }
}
