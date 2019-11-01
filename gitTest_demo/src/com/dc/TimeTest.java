package com.dc;

import java.time.Clock;
import java.util.Calendar;

/**
 * @author 段成
 * @date 2019/11/1 - 8:29
 */
public class TimeTest {
    /**
     * 获取从1970到现在的毫秒值
     * @param args
     */
    public static void main(String[] args) {
        long millis = Calendar.getInstance().getTimeInMillis();
        long timeMillis = System.currentTimeMillis();

        long millis1 = Clock.systemDefaultZone().millis();
        System.out.println(millis1);
    }
}
