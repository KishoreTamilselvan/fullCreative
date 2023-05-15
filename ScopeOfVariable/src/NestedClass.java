public class NestedClass {
    public static void main(String[] args) {
        int a=12;
        Demo ref=new Demo();
        System.out.println(ref.id);
        ref.running();
    }
    static class Demo{
        private int id=10;
        public void running(){
            int speed=40;
            System.out.println("Person running at the speed of "+40+" kmph");
        }

    }
}
