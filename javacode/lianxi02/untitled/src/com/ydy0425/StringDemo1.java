package com.ydy0425;

public class StringDemo1 {

    public static void main(String[] args) {

        //方式一：
        String name="我爱你中国！";
        System.out.println(name);

        //方式二：
        //public String() 创建一个空白字符串对象，不含有任何内容(几乎不用）

        String s1=new String();//s1="";
        //public String(String original) 根据传入的字符串内容，来创建字符串对象(几乎不用）

        String s2=new String("我是中国人！");
        //public String(char[] chs) 根据字符数组的内容，来创建字符串对象

        char[] chars={'1','2','3','4','5'};
        String s3=new String(chars);
        //public String(byte[] chs) 根据字节数组的内容，来创建字符串对象

        byte[] bytes={97,98,99,100};
        String s4=new String(bytes);

        //区别
        String ss1="abc";
        String ss2="abc";
        System.out.println(ss1==ss2);

        String sss1=new String("abcd");
        String sss2=new String("abcd");
        System.out.println(sss1==sss2);
    }
}
