package basic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

    public static void main(String[] args) {
        simpleDateFormate();
        stringFormat();
    }


    static void simpleDateFormate(){
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("E d-M-Y HH:mm:ss");
        System.out.println(df.format(date));
    }

    static void stringFormat(){

        System.out.println(String.format("%1$tA %1$te %1$tB %1$tY %1$tT",new Date()));

        System.out.println(String.format("%tA %<te %<tB %<tY %<tT", new Date()));//сокращение
        System.out.println(String.format("%tA %<te %<tB %<tY %<tR", new Date()));//сокращение
        System.out.println(String.format("%tA %<te %<tl %<tY %<tR", new Date()));//сокращение
    }


}

