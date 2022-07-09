package top.lhhstudy.variant;
/*思考如下变量命名是否合法，如果不合法，为什么？
注: 不要一来就在eclipse中进行验证，因为eclipse几乎已经告诉你答案了
1. int a_;
2. int a@;
3. int a3;
4. int 8@;
5. int 9_;
6. int X$_;
7. int y;
8. int _$_;
9. int $_$;
10. int $*$;
11. int $1$;
12. int _1_;
13. int _@_;
14. int a#;
15. int a";
16. int 123a";
17. int 123a_;
18. int $123b_;*/
public class 命名规范 {
    public static void main(String[] args) {
        /* 可以得
        int a_;
        int a3;
        int X$_;
        int y;
        int _$_;
        int $_$;
        int $1$;
        int _1_;
        int $123b_;*/
/*      不可以得
       int a@;
       int 8@;
       int 9_;
       int $*$;
       int _@_;
       int a#;
       int a";
       int 123a";
       int 123a_;*/
    }
}
