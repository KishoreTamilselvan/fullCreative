public class VarargsMethods {
    // A method that takes varargs(here integers).
    static void fun(int ... a)
    {
        System.out.print("fun(int ...): " +
                "Number of args: " + a.length +
                " Contents: ");

        // using for each loop to display contents of a
        for(int x : a)
            System.out.print(x + " ");

        System.out.println();
    }

    // A method that takes varargs(here booleans).
    static void fun(boolean ... a)
    {
        System.out.print("fun(boolean ...) " +
                "Number of args: " + a.length +
                " Contents: ");

        // using for each loop to display contents of a
        for(boolean x : a)
            System.out.print(x + " ");

        System.out.println();
    }

    public static void main(String args[])
    {
        // Calling overloaded fun() with different  parameter
        fun(1, 2, 3); //OK
        fun(true, false, false); //OK
        //fun(); // Error: Ambiguous!
    }
}
