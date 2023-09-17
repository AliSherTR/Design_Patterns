import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private String schoolAddress;
    private List<Student> students;

    public School(String name , String address) {
        this.schoolAddress = address;
        this.schoolName = name;
        this.students = new ArrayList<>();
    }

    public String getSchoolName(){
        return  schoolName;

    }
    public String getSchoolAddress(){
        return schoolAddress;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List getStudents() {
        return  students;
    }
}
