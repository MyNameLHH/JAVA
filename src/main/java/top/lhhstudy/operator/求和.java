package top.lhhstudy.operator;

import java.util.Scanner;

/*ʹ��Scanner�ӿ���̨��ȡ�������֣�Ȼ��������������ֵĺ�*/
public class ��� {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("�������һ����");
        int a  = scanner.nextInt(); //�û�����õ�һ����
        System.out.println("������ڶ�����");
        int b  = scanner.nextInt(); //�û�����õڶ�����

        System.out.println("�������ǣ�"+(int)(a+b));


    }
}
