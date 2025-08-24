public class Inheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();

        Dog dobby = new Dog();
        dobby.legs = 4;
        dobby.eat();
        System.out.println(dobby.legs);
    }
}

// Base class
class Animal {
    String color;
    void eat(){
        System.out.println("Eating");
    }
    void breathe(){
        System.out.println("Breathing");
    }
}

class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String breed;
}


// // derived class
// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("Swims in water");
//     }
// }