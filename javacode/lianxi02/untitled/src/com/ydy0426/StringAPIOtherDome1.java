package com.ydy0426;

public class StringAPIOtherDome1 {
    public static void main(String[] args) {

//        public int length() 返回此字符串的长度
        String s1 = "我爱你中国！";
        System.out.println(s1.length());
        System.out.println("------------------------------------");

//        public char charAt(int index) 获取某个索引位置处的字符
        char ss1=s1.charAt(0);
        System.out.println(ss1);
        System.out.println("------------------------------------");

        //遍历字符串每个字符
        for (int i = 0; i < s1.length(); i++) {

            char c = s1.charAt(i);
            System.out.print(c+",");
        }
        System.out.println();
//        public char[] toCharArray()： 将当前字符串转换成字符数组返回

        char[] chars=s1.toCharArray();
        for (int i = 0; i < chars.length; i++) {

            char ch=chars[i];
            System.out.print(ch+",");
        }
        System.out.println();
        System.out.println("------------------------------------");

//        public String substring(int beginIndex, int endIndex) 根据开始和结束索引进行截取，得到新的字符串（包前不包后）

        String s2="java是最厉害的编程语言！";
        String substring = s2.substring(0, 9);
        System.out.println(substring);
        System.out.println("------------------------------------");

//        public String substring(int beginIndex) 从传入的索引处截取，截取到末尾，得到新的字符串

        String ss2=s2.substring(0);
        System.out.println(s2);
        System.out.println("------------------------------------");

//        public String replace(CharSequence target,CharSequence replacement)使用新值，将字符串中的旧值替换，得到新的字符串

        String name1="金三胖是最厉害的80后，金三胖棒棒的！";
        String name11 = name1.replace("金三胖", "***");
        System.out.println(name11);
        System.out.println("------------------------------------");
//        public boolean contains(CharSequence s)//判断是否有s

        System.out.println(name1.contains("金三胖"));
        System.out.println("------------------------------------");

//        public boolean startsWith(String prefix)//判断开头是否是prefix

        System.out.println(name1.startsWith("金三胖"));
        System.out.println("------------------------------------");

//        public String[] split(String regex) 根据传入的规则切割字符串，得到字符串数组返回

        String name22="1,22,33,44";
        String[] n2 = name22.split(",");
        for (int i = 0; i < n2.length; i++) {

            System.out.println("具体是："+n2[i]);
        }
        System.out.println("------------------------------------");

    }
}
