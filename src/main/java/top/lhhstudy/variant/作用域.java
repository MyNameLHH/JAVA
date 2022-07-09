package top.lhhstudy.variant;
/*
属性的作用域在方法中，参数的作用域也在方法中，如果属性和参数命名相同了的话？ 那么到底取哪个值？
* */
public class 作用域 {
    int i = 1; //属性名是i


    public void method1(int i){ //参数也是i
        System.out.println(i);
    }

    public static void main(String[] args) {
        new 作用域().method1(5);
        //结果打印出来是 1还是5?

        /*      打印结果是5    调用method 然后传了个5给方法中得形参i 此时i得作用域只在本方法有用，所以结果是5   */

    }
}
