public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Rutansh", 34);
        System.out.println(s1.name);
        System.out.println(s1.roll);
        s1.marks[0] = 90;
        s1.marks[1] = 70;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        System.out.println(s2.name);
        System.out.println(s2.roll);

        s1.marks[0] = 100;
        for(int i = 0; i < s2.marks.length; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    int marks[] = new int[3];

    // parameterized constructor:
    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }

    // copy constructor:
    Student(Student obj){
        this.name = obj.name;
        this.roll = obj.roll;
        // this.marks = obj.marks;//shallow copy (reference)
        for(int i = 0; i < obj.marks.length; i++){ // deep copy (will not affect other object's data)
            this.marks[i] = obj.marks[i];
        }
    }
}