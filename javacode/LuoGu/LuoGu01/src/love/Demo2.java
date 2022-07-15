package love;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Demo2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d HH:mm:ss");
        while (true) {

            System.out.println("和张小狗在一起的日子：");
            String next = scanner.next();
            LocalDateTime start = null;
            try {

                start = LocalDateTime.parse(next + " 00:00:00", formatter);
            } catch (Exception e) {

                System.out.println("输入的日期格式错误，请输入正确的日期格式如：1970-01-01");
                continue;
            }

            LocalDateTime end = LocalDateTime.now();
            Duration between = Duration.between(start, end);
            long days = between.toDays();
            long hours = between.toHours();
            long minutes = between.toMinutes();
            long seconds = between.getSeconds();
            if (minutes <= 0) {
                System.out.println("不能输入当前时间之后的时间日期");
                continue;
            }
            System.out.println("输入的日期距离现在有：" + days + "天\t" + hours + "小时\t" + minutes + "分钟\t" + seconds + "秒\t");
            break;
        }
    }
}

