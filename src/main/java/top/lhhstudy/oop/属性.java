package top.lhhstudy.oop;
/*
* һ��Ӣ�ۿ��������ƣ�Ѫ�������ף��ƶ��ٶȣ����� �������뵽�ģ���Ϊ�µ����ԣ����뵽Ӣ������
    ����
    ���˶��ٴ�
    ɱ�˴���
    ��������
    ��Ǯ
    ������
    �����ٶ�
    ɱ�˺�˵�Ļ�
    ��ɱ��˵�Ļ�
*
* */
public class ���� {
    String name; //����
    int hp; //Ѫ��
    int armor; //����
    int speed; //�ƶ��ٶ�
    int pcs; //���˶��ٸ�

    public static void main(String[] args) {
        ���� item = new ����();
        item.name = "����";
        item.hp = 100;
        item.pcs = 1;
        item.armor = 1000;
        item.speed = 10;
    }
}
