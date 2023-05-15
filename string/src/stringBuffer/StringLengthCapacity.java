package stringBuffer;

public class StringLengthCapacity {
    public static void main(String[] args) {
        // Creating and storing string by creating object of StringBuffer
        StringBuffer s = new StringBuffer("Kishore");

        // Getting the length of the string
        int p = s.length();//7

        // Getting the capacity of the string(Initial Capacity is 16)
        int q = s.capacity();//23

        // ensureCapacity is used to check the minimum capacity
        s.ensureCapacity(20); //If the capacity is not atain the it incremented by (C.C*2)+2

        // Printing the length and capacity
        System.out.println("Length of string Kishore=" + p);
        System.out.println("Capacity of string Kishore=" + q);
    }
}
