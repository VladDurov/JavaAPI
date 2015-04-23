package basic;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateExample {

    public static void main(String[] args) {
        simpleDateFormate();
        stringFormat();
        calendarEx();
    }


    static void simpleDateFormate(){
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("E d-M-Y HH:mm:ss");
        System.out.println(df.format(date));
    }

    static void stringFormat(){

        System.out.println(String.format("%1$tA %1$te %1$tB %1$tY %1$tT",new Date()));

        long msStart = System.currentTimeMillis();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long msStop = System.currentTimeMillis();
        long diff = msStop-msStart;
        System.out.println(diff+"ms = " + (diff/1000)+"s");

        System.out.println(String.format("%tA %<te %<tB %<tY %<tT", new Date()));//сокращение
        System.out.println(String.format("%tA %<te %<tB %<tY %<tR", new Date()));//сокращение
        System.out.println(String.format("%tA %<te %<tl %<tY %<tR", new Date()));//сокращение
    }

    static void calendarEx(){
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println((gc.get(Calendar.MONTH)+1)); // месяца идут с нуля
        System.out.println(gc.get(Calendar.DAY_OF_MONTH)); //Calendar.DATE
        System.out.println(gc.get(Calendar.DATE));
    }

}

