class Scopecheck {
    int instance = 20;
    public void inst(){
        int local = 10;
        System.out.println( "'local' can be accessed only inside this function");
        System.out.println( "Scope of local: " + local);//10//10
        System.out.println( "'instance' can be accessed throught the class with normal functions");
        System.out.println( "Scope of instance: " + instance);//50//20
    }
}

public class Main {
    public static void main(String[] args) {
        Scopecheck obj = new Scopecheck();
        obj.instance = 50;
        obj.inst();//Calling inst() by using obj so instance=50
        Scopecheck obj2 = new Scopecheck();
        obj2.inst();//Calling inst() by using obj2 so instance=20
    }
}
