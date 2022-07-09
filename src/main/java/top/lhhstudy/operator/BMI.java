package top.lhhstudy.operator;

import java.util.Scanner;

/*
*
    使用Scanner收集你的身高体重，并计算出你的BMI值是多少

    BMI的计算公式是 体重(kg) / (身高*身高)

    比如邱阳波的体重是72kg, 身高是1.69，那么这位同学的BMI就是
    72 / (1.69*1.69) = ?
 */
public class BMI {
    public void bMI(double a,double b){  //分别是体重和身高
        System.out.println("BIM为："+(a/(b*b)));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入体重");
        double tiZhong = scanner.nextDouble();
        System.out.println("输入身高");
        double shenGao = scanner.nextDouble();
        new BMI().bMI(tiZhong,shenGao);

    }
}
