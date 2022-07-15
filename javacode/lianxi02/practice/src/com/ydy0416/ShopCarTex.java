package com.ydy0416;

import java.util.Scanner;

public class ShopCarTex {
    //面向对象思想编程训练，购物车模块模拟

    /**
     * 需求：模拟购物车的功能。
     */
    public static void main(String[] args) {

        //1、定义一个商品类
        //2、定义一个数组容器存储商品对象的，代表购物车对象。
        Goods[] shopCar = new Goods[100];
        //3、搭建操作架构
        while (true) {
            System.out.println("请您选择如下命令进行操作：");
            System.out.println("添加商品：add");
            System.out.println("查看商品：query");
            System.out.println("修改数量：update");
            System.out.println("结算价格：pay");

            Scanner sc = new Scanner(System.in);
            System.out.print("请您选择要操作的功能：");
            String command = sc.next();
            switch (command) {

                case "add"://添加商品到购物车

                    addGoods(shopCar, sc);
                    break;
                case "query"://查看商品

                    queryGoods(shopCar);
                    break;
                case "updata"://修改商品数量

                    updataGoodshop(shopCar, sc);
                    break;
                case "pay"://结算价格

                    payGoods(shopCar);
                    break;
                default:
                    System.out.println("没有该功能！");
            }
            System.out.println();
            System.out.println("===================================================");
            System.out.println();
        }
    }


    /**
     * 完成商品添加到购物车的功能
     */
    public static void addGoods(Goods[] shopCar, Scanner sc) {

        //1.让用户输入信息
        System.out.print("请您输入购买商品的编号（不重复）:");
        int id = sc.nextInt();
        System.out.print("请您输入商品的名称：");
        String name = sc.next();
        System.out.print("请您输入商品的价格：");
        double price = sc.nextDouble();
        System.out.print("请您输入购买商品的数量：");
        int buyNumber = sc.nextInt();

        //2.将购买商品的信息封装成一个商品对象
        Goods g = new Goods();
        g.id = id;
        g.name = name;
        g.price = price;
        g.buyNumber = buyNumber;

        //3.将商品对象添加到购物车数组中
        //找到为有商品的位置
        for (int i = 0; i < shopCar.length; i++) {

            if (shopCar[i] == null) {

                shopCar[i] = g;
                break;
            }
        }
        System.out.println("您的商品" + g.name + "添加到购物车已完成！");
    }

    /**
     * 展示购物车信息
     */
    public static void queryGoods(Goods[] shopCar) {

        System.out.println("==================查询购物车信息如下=================");
        System.out.println("编号\t\t名称\t\t\t单价\t\t\t购买数量");
        for (int i = 0; i < shopCar.length; i++) {

            Goods g = shopCar[i];
            if (g != null) {

                System.out.println(g.id + "\t\t\t" + g.name + "\t\t\t\t" + g.price + "\t\t\t\t" + g.buyNumber);
            } else {

                break;
            }
        }
    }

    /**
     * 修改商品购买数量
     */
    public static void updataGoodshop(Goods[] shopCar, Scanner sc) {

        //1.让用户输入要修改商品的id，查寻出要修改商品对象
        while (true) {
            System.out.print("请您输入要修改的id：");
            int id = sc.nextInt();
            Goods g = getGoodsById(shopCar, id);
            if (g == null) {

                System.out.println("购物车中没有此商品！");
            } else {

                //存在商品
                System.out.print("请您输入" + g.name + "的最新购买数量:");
                g.buyNumber = sc.nextInt();
                System.out.println("修改完成！");
                queryGoods(shopCar);//展示购物车信息
                break;
            }
        }
    }

    //查寻出要修改商品对象
    public static Goods getGoodsById(Goods[] shopCar, int id) {

        for (int i = 0; i < shopCar.length; i++) {

            Goods g = shopCar[i];
            if (g != null) {

                if (g.id == id) {

                    return g;
                }
            }
        }
        //购物车中没有
        return null;
    }

    //结算金额
    public static void payGoods(Goods[] shopCar) {

        System.out.println();
        System.out.println("===================================================");
        queryGoods(shopCar);
        System.out.println("===================================================");
        System.out.println();
        double money = 0;
        //遍历购物车中所有商品  单价*数量
        for (int i = 0; i < shopCar.length; i++) {

            Goods g = shopCar[i];
            if (g != null) {

                money += g.price * g.buyNumber;
            }
            else{

                break;
            }
        }
        System.out.println("最终价格为：" + money);
    }

}
