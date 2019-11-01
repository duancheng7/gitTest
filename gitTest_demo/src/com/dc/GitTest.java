package com.dc;

import java.time.LocalDateTime;
import java.util.Calendar;

/**
 * @author 段成
 * @date 2019/10/31 - 20:58
 */
public class GitTest {
    public void test(){
        System.out.println("1111111111111");
        System.out.println("1111111111111----------");
        System.out.println("11111111111112222222222");
        System.out.println("111111111111122222222223333333333");

        //123456
        //456789
    }

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH)+1);
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
        System.out.println("------------------------------");
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime.getYear());
        System.out.println(dateTime.getMonth());
        System.out.println(dateTime.getMonthValue());
        System.out.println(dateTime.getDayOfMonth());
        System.out.println(dateTime.getHour());
        System.out.println(dateTime.getMinute());
        System.out.println(dateTime.getSecond());
    }
}
