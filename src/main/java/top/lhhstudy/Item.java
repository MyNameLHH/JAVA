package top.lhhstudy;
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
public class Item {

    String name;
    int price;

    public static void main(String[] args) {
        Item item1 = new Item();
        item1.name = "Ѫƿ";
        item1.price = 50;

        Item item2 = new Item();
        item2.name = "��Ь";
        item2.price = 300;

        Item item3 = new Item();
        item3.name = "����";
        item3.price = 350;

    }
}
