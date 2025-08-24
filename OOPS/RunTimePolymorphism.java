public class RunTimePolymorphism {
    public static void main(String[] args) {
        Deer deer = new Deer();
        deer.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("eating inside Animal");
    }
}

class Deer extends Animal{
    @Override 
    void eat(){
        System.out.println("Eating inside Deer");
    }
}