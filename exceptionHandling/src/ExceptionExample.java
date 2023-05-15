public class ExceptionExample {
    public static void main(String[] args) {
        try {
            // code that generates exception
            int divideByZero = 5 / 0;
            System.out.println("After the exception");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
            System.out.println(e);
            //e.printStackTrace();
        } catch (Exception e){
            System.out.println(e);
        } finally {
            System.out.println("This is the finally block");
        }
    }
}
