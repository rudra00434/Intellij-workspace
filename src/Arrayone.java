import java.util.*;
public class Arrayone {
    public static void main(String[] args) {
        int[] arr = new int[5];
        String[] student = new String[5];
         Student[] students = new Student[5];
        System.out.println(Arrays.toString(students));
        Student Rudra = new Student();
        Rudra.roll_no=30;
        Rudra.name="rudranil";
        Rudra.marks=75.0f;
        System.out.println(Rudra.roll_no);
        System.out.println(Rudra.name);
        System.out.println(Rudra.marks);
    }
}
class Student{
    int roll_no;
    String name;
    float marks;

}


