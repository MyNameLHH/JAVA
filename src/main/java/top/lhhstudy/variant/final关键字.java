package top.lhhstudy.variant;
/*
* public class HelloWorld {

    public void method1(final int j) {
        j = 5; //这个能否执行？
    }
}*/
public class final关键字 {
    /*这里可以用*/
    public void mesed(final int j){
//       j = 5;
    }


    public static void main(String[] args) {


    }

    //不可以，因为在调用方法的时候，就一定会第一次赋值了，后面不能再进行多次赋值
}
