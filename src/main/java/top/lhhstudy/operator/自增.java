package top.lhhstudy.operator;
/*
    int i = 1;
    int j = ++i + i++ + ++i + ++i + i++;  2  4   9  18
    �� j�Ľ���Ƕ���?
*
* */
public class ���� {
    public static void main(String[] args) {
        int i = 1;
        int j = ++i + i++ + ++i + ++i + i++;
        System.out.println(j);
    }
}
