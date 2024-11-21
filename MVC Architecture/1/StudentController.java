public class StudentController{
    private Student student;
    private StudentView studentView;

    public StudentController(Student student, StudentView studentView)
    {
        this.student = student;
        this.studentView = studentView;

    }

    //set name
    public void setStudentName(String name)
    {
        student.setName(name);
    }
    //set Age
    public void setStudentAge(int age)
    {
        student.setAge(age);
    }


    //get name
    public String getStudentName(){
        return student.getName();
    }


    //get age
    public int getStudentAge(){
        return student.getAge();
    }

    public void updateView(){
        studentView.printStudentDetails(student.getName(), student.getAge());
    }

}