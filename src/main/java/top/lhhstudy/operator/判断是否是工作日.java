package top.lhhstudy.operator;

import java.util.Scanner;

/*ͨ��Scanner����һ��1-7֮���������ʹ����Ԫ�������ж��ǹ����ջ�����ĩ��*/
public class �ж��Ƿ��ǹ����� {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("�������ڼ���");
        int a = scanner.nextInt();
        if (a<= 0 || a >= 8){
            System.out.println("�������");
        }else{
            System.out.println((a>0 && a<= 6)? "������":"��ĩ");
        }

    }

}
