package stringBuffer;

public class Insert {
    public static void main(String[] args) {
        // Creating an object of StringBuffer class
        StringBuffer s = new StringBuffer("FullCreative");

        // Inserting element and position as an arguments
        s.insert(5, "for");
        // Returns FullCforreative
        System.out.println(s);

        s.insert(0, 5);
        // Returns 5FullCforreative
        System.out.println(s);

        s.insert(3, true);
        // Returns 5FutruellCforreative
        System.out.println(s);

        s.insert(5, 41.35d);
        // Returns 5Futr41.35uellCforreative
        System.out.println(s);

        s.insert(8, 41.35f);
        // Returns 5Futr41.41.3535uellCforreative
        System.out.println(s);

        // Declaring and initializing character array
        char full_arr[] = { 'p', 'a', 'w', 'a', 'n' };

        // Inserting character array at offset 9
        s.insert(2, full_arr);
        // Returns 5Fpawanutr41.41.3535uellCforreative
        System.out.println(s);
    }
}
