package com.fengxinzi.learning.newfeature.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * java8 新的时间类型
 * @author fengxinzi
 */
public class NewDateApi {

    public static final String DATE_FORMATE_TEMPLATE = "yyyy-MM-dd HH:mm:ss";


    public static void main(String[] args) {

        NewDateApi newDateApi = new NewDateApi();
        System.out.println(newDateApi.getClass().getSimpleName());

        //Current Date
        LocalDate today = LocalDate.now();
        System.out.println("Current Date="+today);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMATE_TEMPLATE);
        String dateTime = LocalDateTime.now().format(formatter);
        System.out.println("Current dateTime:" + dateTime);

        //Creating LocalDate by providing input arguments
        LocalDate firstDay_2014 = LocalDate.of(2014, Month.JANUARY, 1);
        System.out.println("Specific Date="+firstDay_2014);

        //Try creating date by providing invalid inputs
        //LocalDate feb29_2014 = LocalDate.of(2014, Month.FEBRUARY, 29);
        //Exception in thread "main" java.time.DateTimeException:
        //Invalid date 'February 29' as '2014' is not a leap year

        //Current date in "Asia/Kolkata", you can get it from ZoneId javadoc
        LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Date in IST="+todayKolkata);

        //java.time.zone.ZoneRulesException: Unknown time-zone ID: IST
        //LocalDate todayIST = LocalDate.now(ZoneId.of("IST"));

        //Getting date from the base date i.e 01/01/1970
        LocalDate dateFromBase = LocalDate.ofEpochDay(365);
        System.out.println("365th day from base date= "+dateFromBase);

        LocalDate hundredDay2014 = LocalDate.ofYearDay(2014, 100);
        System.out.println("100th day of 2014="+hundredDay2014);
    }
}
