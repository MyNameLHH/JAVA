package top.lhhstudy.operator;
/*
    int i = 1;
    int j = ++i + i++ + ++i + ++i + i++;  2  4   9  18
    问 j的结果是多少?
*
* */
public class 自增 {
    public static void main(String[] args) {
        int i = 1;
        int j = ++i + i++ + ++i + ++i + i++;
        System.out.println(j);
    }
}
