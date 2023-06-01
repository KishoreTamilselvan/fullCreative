public class AnonClass {
    public static void main(String[] args) {
        //Anonymous class is used to override a method class and interface
        FuncInterface obj=new FuncInterface() {
            @Override
            public void func(String s) {
                System.out.println("This is func");
            }
        };
        obj.func("Java");
    }
}
