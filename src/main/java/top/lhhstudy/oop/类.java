package top.lhhstudy.oop;
/*
* ��Ƴ���Ʒ������
������Item
��Ʒ����������:
���� name �������ַ���String
�۸� price ���������� int

����(ʵ����)3��������Ʒ
���� �۸�
Ѫƿ 50
��Ь 300
���� 350
*/
public class �� {
    String name; //����
    int price; //�۸�

    public static void main(String[] args) {
        �� item1 = new ��();
        item1.name = "Ѫƿ";
        item1.price = 50;

        �� item2 = new ��();
        item2.name = "��Ь";
        item2.price = 300;

        �� item3 = new ��();
        item3.name = "����";
        item3.price = 350;

    }
}
