package top.lhhstudy.oop;
/*
* 设计出物品这种类
类名：Item
物品有如下属性:
名字 name 类型是字符串String
价格 price 类型是整型 int

创建(实例化)3件具体物品
名称 价格
血瓶 50
草鞋 300
长剑 350
*/
public class 类 {
    String name; //名字
    int price; //价格

    public static void main(String[] args) {
        类 item1 = new 类();
        item1.name = "血瓶";
        item1.price = 50;

        类 item2 = new 类();
        item2.name = "草鞋";
        item2.price = 300;

        类 item3 = new 类();
        item3.name = "长剑";
        item3.price = 350;

    }
}
