class A{
    int a=20;
    boolean b;
}
class B extends A{
    int m;
    int a=30;
    String s;
}
public class UpCasting {
    public static void main(String[] args) {
        A ref=new B();//UpCasting
        System.out.println(ref.a);
        //System.out.println(ref.m);//CTE we can't access the child member
        B ref1=(B)ref;//DownCasting
        System.out.println(ref1.m);//Child member
        System.out.println(ref1.b);//Parent member
    }
}
