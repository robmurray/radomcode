package com.wmb.calendar;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by robertmurray on 3/23/17.
 */
public class DaysOfWeekTest {

    @Test
    public void testSaturdays(){
        DayOfWeekUtil s = new DayOfWeekUtil();
        Calendar endDate = GregorianCalendar.getInstance();
        endDate.set(2017, Calendar.SEPTEMBER, 30);
        List<Date> dates =s.findAllDayOfTheWeek(new Date(), endDate.getTime(), Calendar.SATURDAY,10,0,Calendar.AM);

        DayOfWeekUtil.writeToCSVFile(dates,"saturdays.txt");
    }
}
