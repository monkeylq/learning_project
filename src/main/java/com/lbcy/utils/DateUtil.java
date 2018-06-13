package com.lbcy.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by wuxiaodong on 2017/3/8.
 */
public class DateUtil {

    public static String today(Date date, String pattern)
    {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }

    public static Date getDate(Long timestamp)
    {
        if(timestamp==null){
            timestamp=0L;
        }
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date temp=null;
        if(timestamp!=null){
            try {
                String str=sdf.format(timestamp);
                temp=sdf.parse(str);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return temp;
    }

    public static int getCurrentYear()
    {
        Calendar a = Calendar.getInstance();
        return a.get(Calendar.YEAR);
    }

    /**
     * 获取本周周一的日期
     */
    public static String getMondayFromWeek(String format) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);

        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.set(Calendar.DAY_OF_WEEK, 2);
        Date monday = calendar.getTime();
        return simpleDateFormat.format(monday);
    }

    /**
     * 获取本周周末的日期
     */
    public static String getSundayFromWeek(String format) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);

        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.set(Calendar.DAY_OF_WEEK, 1);
        Date sunday = calendar.getTime();
        return simpleDateFormat.format(sunday);
    }

    /**
     * 获取选定周周一的日期
     */
    public static String getMondayFromWeek(String format,String day) throws ParseException{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(simpleDateFormat.parse(day));
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.set(Calendar.DAY_OF_WEEK, 2);
        Date monday = calendar.getTime();
        return simpleDateFormat.format(monday);
    }

    /**
     * 获取选定周周末的日期
     */
    public static String getSundayFromWeek(String format,String day) throws ParseException{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(simpleDateFormat.parse(day));
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.set(Calendar.DAY_OF_WEEK, 1);
        Date sunday = calendar.getTime();
        return simpleDateFormat.format(sunday);
    }

    /**
     * 获取选定周周一到周末的所有日期
     */
    public static List<String> getWeekDays(String format,String day) throws ParseException{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);

        List<String> days = new ArrayList<String>();
        Calendar calendar = Calendar.getInstance();
        String monday=getMondayFromWeek(format,day);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.setTime(simpleDateFormat.parse(monday));

        Calendar sundayCalendar = Calendar.getInstance();
        String sunday=getSundayFromWeek(format,day);
        sundayCalendar.set(Calendar.HOUR_OF_DAY, 0);
        sundayCalendar.set(Calendar.MINUTE, 0);
        sundayCalendar.set(Calendar.SECOND, 0);
        sundayCalendar.setTime(simpleDateFormat.parse(sunday));
        days.add(monday);
        while(true){
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            if (!calendar.before(sundayCalendar)) {
                break;
            }
            Date cday = calendar.getTime();
            days.add(simpleDateFormat.format(cday));
        }
        days.add(sunday);
        return days;
    }

    /**
     * 获取指定日期的当月的所有日期
     */
    public static List<String> getMonthDays(String format,String day) throws ParseException{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);

        List<String> days = new ArrayList<String>();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.setTime(simpleDateFormat.parse(day));
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        days.add(simpleDateFormat.format(calendar.getTime()));

        Calendar monthLastDay = Calendar.getInstance();
        monthLastDay.set(Calendar.HOUR_OF_DAY, 0);
        monthLastDay.set(Calendar.MINUTE, 0);
        monthLastDay.set(Calendar.SECOND, 0);
        monthLastDay.setTime(simpleDateFormat.parse(day));
        monthLastDay.set(Calendar.DAY_OF_MONTH, monthLastDay.getActualMaximum(Calendar.DAY_OF_MONTH));
        while (true) {
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            if (!calendar.before(monthLastDay)) {
                break;
            }
            Date cday = calendar.getTime();
            days.add(simpleDateFormat.format(cday));
        }
        days.add(simpleDateFormat.format(monthLastDay.getTime()));
        return days;
    }

    /**
     * 获取本周到现在的所有日期
     */
    public static List<String> getWeekDays(String format) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);

        List<String> days = new ArrayList<String>();
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.set(Calendar.DAY_OF_WEEK, 2);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Date monday = calendar.getTime();
        days.add(simpleDateFormat.format(monday));

        Calendar now = Calendar.getInstance();
        while (true) {
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            if (!calendar.before(now)) {
                break;
            }
            Date day = calendar.getTime();
            days.add(simpleDateFormat.format(day));
        }

        return days;
    }

    /**
     * 获取本月到现在的所有日期
     */
    public static List<String> getMonthDays(String format) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);

        List<String> days = new ArrayList<String>();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Date monthFirstDay = calendar.getTime();
        days.add(simpleDateFormat.format(monthFirstDay));

        Calendar now = Calendar.getInstance();
        while (true) {
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            if (!calendar.before(now)) {
                break;
            }
            Date day = calendar.getTime();
            days.add(simpleDateFormat.format(day));
        }

        return days;
    }

    /**
     * 获取上月的所有日期
     */
    public static List<String> getPreMonthDays(String format) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);

        List<String> days = new ArrayList<String>();
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);
        int year=calendar.get(Calendar.YEAR);
        if(month <= 0){
            year=calendar.get(Calendar.YEAR);
            year=year-1;
            calendar.set(Calendar.YEAR,year);
            calendar.set(Calendar.MONTH,11);
            month=11;
        }else{
            month=month-1;
            calendar.set(Calendar.MONTH,month);
        }
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Date monthFirstDay = calendar.getTime();
        days.add(simpleDateFormat.format(monthFirstDay));

        Calendar currMonth = Calendar.getInstance();
        currMonth.set(Calendar.YEAR,year);
        currMonth.set(Calendar.MONTH,month);
        currMonth.set(Calendar.DAY_OF_MONTH,currMonth.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(currMonth.getActualMaximum(Calendar.DAY_OF_MONTH));
        while (true) {
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            if (!calendar.before(currMonth)) {
                break;
            }
            Date day = calendar.getTime();
            days.add(simpleDateFormat.format(day));
        }

        return days;
    }
    /**
     * 判断为星期几(0-6),0为星期天
     */
    public static int getDayOfWeek(String time, String format) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(sdf.parse(time));
            int week = calendar.get(Calendar.DAY_OF_WEEK);
            return week - 1;
        } catch (Exception e) {
            return -1;
        }
    }

    /**
     * 比较两个时间大小
     */
    public static int compareDateStr(String timeStart, String timeEnd, String format) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            long t1 = sdf.parse(timeStart).getTime();
            long t2 = sdf.parse(timeEnd).getTime();
            if (t1 < t2) {
                return 1;
            }
            else if (t1 == t2) {
                return 0;
            }
            else{
                return -1;
            }
        } catch (Exception e) {
            return -2;
        }
    }
}
