package top.lhhstudy.variant;
/*
���Ե��������ڷ����У�������������Ҳ�ڷ����У�������ԺͲ���������ͬ�˵Ļ��� ��ô����ȡ�ĸ�ֵ��
* */
public class ������ {
    int i = 1; //��������i


    public void method1(int i){ //����Ҳ��i
        System.out.println(i);
    }

    public static void main(String[] args) {
        new ������().method1(5);
        //�����ӡ������ 1����5?

        /*      ��ӡ�����5    ����method Ȼ���˸�5�������е��β�i ��ʱi��������ֻ�ڱ��������ã����Խ����5   */

    }
}
