public class ClassLevelScope {
    static int x = 11;//It'll be stored in static area x=11
    private int y = 33;
    public void method1(int x)
    {
        ClassLevelScope t = new ClassLevelScope();//this t is accessible only inside this method
        this.x = x;//static is updated this.x=x, this represents the current class
        this.y = 44;//This y represent the class variable

        System.out.println("ClassLevelScope.x: " + ClassLevelScope.x);//x is static so it returns 22
        System.out.println("t.x: " + t.x);//returns 5
        System.out.println("t.y: " + t.y);//This t.y represents the object which is created with in this block
        System.out.println("y: " + y);//This returns 44
    }

    public static void main(String args[])
    {
        ClassLevelScope t = new ClassLevelScope();//Object created in heap area and it hold y=33, this t visible only inside this main block
        t.method1(5);
    }
}
