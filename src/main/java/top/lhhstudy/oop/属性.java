package top.lhhstudy.oop;
/*
* 一个英雄可以有名称，血量，护甲，移动速度，还有 其他你想到的，作为新的属性，加入到英雄上面
    比如
    送了多少次
    杀人次数
    助攻次数
    金钱
    补刀数
    攻击速度
    杀人后说的话
    被杀后说的话
*
* */
public class 属性 {
    String name; //名称
    int hp; //血量
    int armor; //护甲
    int speed; //移动速度
    int pcs; //送了多少个

    public static void main(String[] args) {
        属性 item = new 属性();
        item.name = "盖亚";
        item.hp = 100;
        item.pcs = 1;
        item.armor = 1000;
        item.speed = 10;
    }
}
