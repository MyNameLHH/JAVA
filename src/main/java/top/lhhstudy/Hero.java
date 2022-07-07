package top.lhhstudy;
/*
为英雄类Hero设计几个新的方法：
1. 超神 legendary(),无参数，无返回类型
2. 获取当前的血量 getHp(), 无参数，有float类型的返回值
3. 回血 recovery(float blood)， 有参数 float类型参数 blood表示本次恢复的血量，无返回类型
* */
public class Hero {
    String name; //名称
    int hp; //血量
    int armor; //护甲
    int speed; //移动速度
    int pcs; //送了多少个

    //超神 legendary方法
    void legendary(){
        System.out.println("超神了");
    }

    //获取当前的血量 getHp()
    float getHp(){
        return hp;
    }

    //回血 recovery(float blood)
    void recovery(float blood){ //blood表示本次恢复的血量
        System.out.println(this.hp += blood);//当前血量家恢复的血量
    }

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.name = "盖亚";
        hero.hp = 10;
        hero.legendary();
        hero.getHp();
        hero.recovery(20);
    }

}
