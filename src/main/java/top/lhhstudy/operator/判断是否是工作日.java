package top.lhhstudy.operator;

import java.util.Scanner;

/*通过Scanner输入一个1-7之间的整数，使用三元操作符判断是工作日还是周末？*/
public class 判断是否是工作日 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("今天星期几？");
        int a = scanner.nextInt();
        if (a<= 0 || a >= 8){
            System.out.println("输入错误");
        }else{
            System.out.println((a>0 && a<= 6)? "工作日":"周末");
        }

    }

}
