package java_api_study.Data_study;

import java.util.Calendar;
import java.util.Date;


/*
*
* java.util.Calendar:这个类似专门操作日期和事件的工具类
*
* */
public class Demo_Calendar {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        //获取当前毫秒数
        System.out.println(calendar.getTimeInMillis());

        Date time =calendar.getTime();
        System.out.println(time);

        //获取年份
        System.out.println(calendar.get(Calendar.YEAR));

        //获取月份(从0月开始计算)
        System.out.println(calendar.get(Calendar.MONTH) + 1);

        //获取日
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        //获取时
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
    }
}
