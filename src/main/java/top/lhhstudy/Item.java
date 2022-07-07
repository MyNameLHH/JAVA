package top.lhhstudy;
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
public class Item {

    String name;
    int price;

    public static void main(String[] args) {
        Item item1 = new Item();
        item1.name = "血瓶";
        item1.price = 50;

        Item item2 = new Item();
        item2.name = "草鞋";
        item2.price = 300;

        Item item3 = new Item();
        item3.name = "长剑";
        item3.price = 350;

    }
}
