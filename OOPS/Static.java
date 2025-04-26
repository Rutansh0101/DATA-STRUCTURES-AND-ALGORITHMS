public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "Dav";
        Student s2 = new Student();
        System.out.println(s2.schoolName);
        Student s3 = new Student();
        s3.schoolName = "HS";
        System.out.println(s1.schoolName);
    }
}

class Student{
    String name;
    int roll;

    static String schoolName;
    
    void setName(String newName){
        this.name = newName;
    }

    String getName(){
        return this.name;
    }
    // as the logic for this function will be same for every student, we can mark it as static and it saves memory:
    static int returnPercentage(int math, int phy, int chem){
        return (math + phy + chem) / 3;
    }
}