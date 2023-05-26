import java.io.FileOutputStream;
public class TryWithResourceExample {
    public static void main(String args[]){

        // Using try-with-resources
        try(FileOutputStream fs =new FileOutputStream("test.txt")){
            String msg = "Welcome to Full Creative";
            byte byteArray[] = msg.getBytes(); //converting string into byte array
            fs.write(byteArray);
            System.out.println("Message written to file successfuly!");
            //It will automatically close the resources
        }catch(Exception exception){
            System.out.println(exception);
        }finally {
            System.out.println("This is finally block");
        }
    }
}