import java.util.*;

public class Inheritance {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.eat();
        bird.fly();
    }
}

// single level inheritance example
class Animal {
    public void eat() {
        System.out.println("I am eating");
    }
}

class Bird extends Animal {
    public void fly() {
        System.out.println("I am flying");
    }
}