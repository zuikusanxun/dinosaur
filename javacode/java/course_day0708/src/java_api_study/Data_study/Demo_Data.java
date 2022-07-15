package java_api_study.Data_study;

import java.text.SimpleDateFormat;
import java.util.Date;



/*
* System.currentTimeMillis();
  currentTimeMillis是一个native的本地方法
* 可以获取从 1970-01-01 08:00:00到现在所经过的毫秒数(ms)
*
*
* */
public class Demo_Data {

    public static void main(String[] args) {

        //创建Date对象,Date对象中如果不传递毫秒数,默认是当前毫秒数

        Date date = new Date(System.currentTimeMillis());

        //现在计算机中的计时方式: 从1970-01-01 08:00:00
        System.out.println(date);

        //获取date对象中封装的毫秒数
        System.out.println(date.getTime());
        //获取一周中的第几天
        System.out.println(date.getDay());
        //获取一个月中的第几天
        System.out.println(date.getDate());
        //获取一天中的第几个小时
        System.out.println(date.getHours());
        //获取一小时中的第几分钟
        System.out.println(date.getMinutes());

        //创建日期格式化对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //使用日期可视化对象可视化date中包含的日期
        String format = simpleDateFormat.format(date);
        System.out.println(format);
    }
}
