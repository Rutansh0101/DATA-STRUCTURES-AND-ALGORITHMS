// super keyword is used to access parent properties or methods or constructors:

public class Super {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        System.out.println(h1.color);
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        super();
        System.out.println("Horse constructor is called");
        super.color = "brown";
    }
}