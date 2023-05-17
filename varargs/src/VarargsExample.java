public class VarargsExample {
    public static void main(String[] args) {
        System.out.println(add(4,5,6,4,2,7));
    }
    public static int add(int ... n){//arguments goes like array{4,5,6,4,2,7}
        int sum=0;
        for (int i : n) {
            sum=sum+i;
        }
        return sum;
    }
}
//provides flexibility and makes code more readable
//If we don't know the exact number of arguments we use this
//By using this we can avoid a array creation