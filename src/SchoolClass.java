import java.util.ArrayList;

public class SchoolClass {
    private String className;
    private String responsibleTeacher;
    private ArrayList<Student> listOfStudents = new ArrayList<Student>();

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getResponsibleTeacher() {
        return responsibleTeacher;
    }

    public void setResponsibleTeacher(String responsibleTeacher) {
        this.responsibleTeacher = responsibleTeacher;
    }

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(Student listOfStudents) {
        this.listOfStudents.add(listOfStudents);
    }
}
