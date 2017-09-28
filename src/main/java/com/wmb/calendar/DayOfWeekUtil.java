package com.wmb.calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Consumer;


/**
 * Created by rob on 5/18/15.
 */
public class DayOfWeekUtil {

    static final Logger LOG = LoggerFactory.getLogger(DayOfWeekUtil.class);
    static final DateFormat DATE_FORMAT = new SimpleDateFormat("MMM dd yyyy");
    /**
     * returns all the dates for a given day of the week.
     * - start date must be less than or equal to the end date
     * - start date and end date must be in the same year.
     *
     * @param startDate
     * @param endDate
     * @param dayOfWeek
     * @return
     */
    public List<Date> findAllDayOfTheWeek(Date startDate, Date endDate, int dayOfWeek, int hour, int minutes, int amOrPm) {
        List<Date> listofDates = null;

        // validation and init
        if (endDate.getTime() < startDate.getTime()) {
            // invalid date range
            return null;
        }

        if(hour<0 | hour>11 || minutes <0 || minutes>59){
            return null;
        }

        Calendar startCal = GregorianCalendar.getInstance();
        startCal.setTime(startDate);

        Calendar endCal = GregorianCalendar.getInstance();
        endCal.setTime(endDate);

        int startYear = startCal.get(Calendar.YEAR);
        int endYear = endCal.get(Calendar.YEAR);
        int startDayOfYear = startCal.get(Calendar.DAY_OF_YEAR);
        int endDayOfYear = endCal.get(Calendar.DAY_OF_YEAR);
        int yearSpan = endYear - startYear;

        // only accept ranges in the same year
        if(yearSpan>0){
            return null;
        }

        // will do the iteration with this one
        Calendar wrkCal = GregorianCalendar.getInstance();
        wrkCal.setTime(startDate);
        wrkCal.set(Calendar.HOUR, hour);
        wrkCal.set(Calendar.MINUTE,minutes);
        wrkCal.set(Calendar.SECOND,0);
        wrkCal.set(Calendar.MILLISECOND,0);
        wrkCal.set(Calendar.AM_PM,amOrPm);

        listofDates = new ArrayList<Date>();

        for (int dayOfYearIndex = 0; dayOfYearIndex <= endDayOfYear - startDayOfYear; dayOfYearIndex++) {
            if (wrkCal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                listofDates.add(wrkCal.getTime());
                LOG.debug(wrkCal.getTime().toString());

            }
            wrkCal.add(Calendar.DAY_OF_YEAR, 1);
        }

        return listofDates;

    }

    public static void writeToCSVFile(List<Date> dateList, String filename){

        PrintWriter out = null;

        try {
            out = new PrintWriter(filename);
            PrintWriter finalOut = out;
            // create header
            finalOut.write("Instructor");
            finalOut.write(",");
            finalOut.write("Date");
            finalOut.write(System.lineSeparator());
            Consumer<Date> write = d -> {
                String stringDate = DATE_FORMAT.format(d);
                finalOut.write(",");
                finalOut.write(stringDate);
                finalOut.write(System.lineSeparator());
            };
            dateList.stream().forEach(write);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            out.close();
        }
    }

}
