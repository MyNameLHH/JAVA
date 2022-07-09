package top.lhhstudy.operator;

import java.util.Scanner;

/*
* 借助Scanner获取控制台输入的两个任意数字，然后使用
> 大于
>= 大于或等于
< 小于
<= 小于或等于
== 是否相等
!= 是否不等

判断两个值之间的关系
* */
public class 关系操作符 {

    //判断之间得关系
    public void judge(int a,int b,String c){
        if(c == ">="){//判断>=
            System.out.println(a>=b);
        }else if(c.equals("<=")){//判断<=
            System.out.println(a<=b);
        }else if(c.equals("=")){//判断==
            System.out.println(a==b);
        }else if(c.equals("<")){//判断<
            System.out.println(a<b);
        }else if(c.equals(">")){//判断>
            System.out.println(a>b);
        }else if(c.equals("!=")){//判断>=
            System.out.println(a!=b);
        }else{
            System.out.println("操作符输入错误");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第一个数");
        int a = scanner.nextInt();

        System.out.println("输入比较符号");
        String c = scanner.next();

        System.out.println("输入第二个数");
        int b = scanner.nextInt();

        new 关系操作符().judge(a,b,c);

    }
}
