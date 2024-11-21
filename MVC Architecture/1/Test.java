public class Test{
    public static void main(String[] args) {
        //student model
        Student student = new Student();

        //sview
        StudentView studentView = new StudentView();
        

        //controller
        StudentController studentController = new StudentController(student, studentView);
        
        studentController.setStudentAge(22);
        studentController.setStudentName("John");

        studentController.updateView();
        



    }
}