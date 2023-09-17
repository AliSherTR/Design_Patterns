public class Student {
    private String studentName;
    private String studentRegistration;
    private String studentClass;

    public Student(String name , String registration , String grade){
        this.studentName = name;
        this.studentRegistration = registration;
        this.studentClass = grade;
    }
    public String getStudentName(){
        return studentName;
    }
    public String getStudentRegistration(){
        return studentRegistration;
    }

    public String getStudentClass(){
        return studentClass;
    }
}
