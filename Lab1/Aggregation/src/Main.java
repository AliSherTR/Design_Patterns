import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       School mySchool = new School("Wapda Senior Model School" , "Sobra City, Tarbela Dam");

       Student student1 = new Student("Ali Sher Khan " , "FA20-BSE-078" , "BSE 7B" );
       Student student2 = new Student("Haris Ehsan " , "FA20-BSE-055" , "BSE 7B" );

       mySchool.addStudent(student1);
       mySchool.addStudent(student2);

       System.out.println("School Information: ");
       System.out.println("School Name: " + mySchool.getSchoolName());
       System.out.println("School Address: " + mySchool.getSchoolAddress());

        List<Student> schoolStudents = mySchool.getStudents();

        for(Student student : schoolStudents ) {
            System.out.println("Name: " + student.getStudentName());
            System.out.println("Class: " + student.getStudentClass());
            System.out.println("Registration Number: " + student.getStudentRegistration());
            System.out.println();
        }

    }
}