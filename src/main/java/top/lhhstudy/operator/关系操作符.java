package top.lhhstudy.operator;

import java.util.Scanner;

/*
* ����Scanner��ȡ����̨����������������֣�Ȼ��ʹ��
> ����
>= ���ڻ����
< С��
<= С�ڻ����
== �Ƿ����
!= �Ƿ񲻵�

�ж�����ֵ֮��Ĺ�ϵ
* */
public class ��ϵ������ {

    //�ж�֮��ù�ϵ
    public void judge(int a,int b,String c){
        if(c == ">="){//�ж�>=
            System.out.println(a>=b);
        }else if(c.equals("<=")){//�ж�<=
            System.out.println(a<=b);
        }else if(c.equals("=")){//�ж�==
            System.out.println(a==b);
        }else if(c.equals("<")){//�ж�<
            System.out.println(a<b);
        }else if(c.equals(">")){//�ж�>
            System.out.println(a>b);
        }else if(c.equals("!=")){//�ж�>=
            System.out.println(a!=b);
        }else{
            System.out.println("�������������");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("�����һ����");
        int a = scanner.nextInt();

        System.out.println("����ȽϷ���");
        String c = scanner.next();

        System.out.println("����ڶ�����");
        int b = scanner.nextInt();

        new ��ϵ������().judge(a,b,c);

    }
}
