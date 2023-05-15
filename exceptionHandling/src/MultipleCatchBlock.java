public class MultipleCatchBlock {
    public static void main(String[] args) {
        try {
            //One try block throw only one exception at a time
            int array[] = new int[10];
//            array[10] = 30 / 0; //This statement throw arithmeticException
            System.out.println(array[10]); // This throw IndexOutOfBoundException
        } catch (ArithmeticException e) {
            //This catch block catch the exception so the remaining catch block will not execute
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
//        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        }
        finally {
            System.out.println("This is finally block");
        }
    }
}
