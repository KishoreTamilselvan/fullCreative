class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}
class Dog extends Animal {
    public void makeSound() {//Overriden
        System.out.println("Dog is barking");
    }
    public void fetch() {
        System.out.println("Dog is fetching");
    }
}
class Cat extends Animal {
    public void makeSound() {//Overriden
        System.out.println("Cat is meowing");
    }
    public void scratch() {
        System.out.println("Cat is scratching");
    }
}

public class Example {
    public static void main(String[] args) {
        Animal ref1=new Dog();//Upcasting
        ref1.makeSound();//We can access it because it is overriden method
        Dog ref2=(Dog)ref1;//Downcasting
        ref2.fetch();//We should downcaste the dog object then only we can able to access the child member

        Animal ref3=new Cat();//Upcasting
        ref3.makeSound();//We can access it because it is overriden method
        Cat ref4=(Cat)ref3;//Downcasting
        ref4.scratch();//We should downcaste the cat object then only we can able to access the child member
    }
}

