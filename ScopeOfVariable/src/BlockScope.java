public class BlockScope {
    int n=10;
    public static void main(String args[])
    {
        int n=30;
        //int x;
        {
            // The variable x has scope within brackets
            int x = 10;
            System.out.println(x);
            System.out.println(n);
        }
        // error since variable x is out of scope.
        //System.out.println(x);// If i want to access x here then it should be declared in before the block
    }
}
