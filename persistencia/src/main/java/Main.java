import dao.StudentDao;
import models.Student;

public class Main {
    public static void main(String[] args) {
        StudentDao daoStudent = new StudentDao();
        Student student = new Student();
        student.setName("Andrea Cuadra");
        student.setId(123459L);
        student.setMajor("Ingenieria en Sistemas");
        student.setName("Kevin Fittoria");
        student.setId(240008L);
        student.setMajor("Pastelero");

        daoStudent.save(student);
    }
}
