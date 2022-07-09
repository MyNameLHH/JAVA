package top.lhhstudy.variant;
/*
*   short a = 1;
    short b = 2;
    那么 a+b 是什么类型？
* */
public class 类型转换 {
    public static void main(String[] args) {
        short a = 1;
        short b = 2;
        short c = (short) (a+b);  //int强转short
        System.out.println(c);
    }
}
