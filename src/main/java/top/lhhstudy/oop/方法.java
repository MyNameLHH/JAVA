package top.lhhstudy.oop;
/*
ΪӢ����Hero��Ƽ����µķ�����
1. ���� legendary(),�޲������޷�������
2. ��ȡ��ǰ��Ѫ�� getHp(), �޲�������float���͵ķ���ֵ
3. ��Ѫ recovery(float blood)�� �в��� float���Ͳ��� blood��ʾ���λָ���Ѫ�����޷�������
* */
public class ���� {
    String name; //����
    int hp; //Ѫ��
    int armor; //����
    int speed; //�ƶ��ٶ�
    int pcs; //���˶��ٸ�

    //���� legendary����
    void legendary(){
        System.out.println("������");
    }

    //��ȡ��ǰ��Ѫ�� getHp()
    float getHp(){
        return hp;
    }

    //��Ѫ recovery(float blood)
    void recovery(float blood){ //blood��ʾ���λָ���Ѫ��
        System.out.println(this.hp += blood);//��ǰѪ���һָ���Ѫ��
    }

    public static void main(String[] args) {
        ���� ���� = new ����();
        ����.name = "����";
        ����.hp = 10;
        ����.legendary();
        ����.getHp();
        ����.recovery(20);
    }

}
