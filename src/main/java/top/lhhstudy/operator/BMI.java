package top.lhhstudy.operator;

import java.util.Scanner;

/*
*
    ʹ��Scanner�ռ����������أ�����������BMIֵ�Ƕ���

    BMI�ļ��㹫ʽ�� ����(kg) / (���*���)

    ������������������72kg, �����1.69����ô��λͬѧ��BMI����
    72 / (1.69*1.69) = ?
 */
public class BMI {
    public void bMI(double a,double b){  //�ֱ������غ����
        System.out.println("BIMΪ��"+(a/(b*b)));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("��������");
        double tiZhong = scanner.nextDouble();
        System.out.println("�������");
        double shenGao = scanner.nextDouble();
        new BMI().bMI(tiZhong,shenGao);

    }
}
