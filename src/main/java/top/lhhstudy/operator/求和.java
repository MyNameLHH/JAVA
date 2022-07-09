package top.lhhstudy.operator;

import java.util.Scanner;

/*使用Scanner从控制台获取两个数字，然后计算这两个数字的和*/
public class 求和 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a  = scanner.nextInt(); //用户输入得第一个数
        System.out.println("请输入第二个数");
        int b  = scanner.nextInt(); //用户输入得第二个数

        System.out.println("计算结果是："+(int)(a+b));


    }
}
