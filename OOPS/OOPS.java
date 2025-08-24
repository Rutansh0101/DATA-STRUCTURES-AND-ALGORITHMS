public class OOPS{
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        // p1.setColor("Yellow");
        p1.color = "Yellow";
        System.out.println(p1.color);
        BankAccount b1 = new BankAccount();
        b1.username = "Rutansh";
        b1.setPassword("Rutansh@3112");
    }
}

class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pass){
        this.password = pass;
    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calculatePercentage(int phy, int chem, int maths) {
        percentage = (phy + chem + maths) / 3;
    }
}