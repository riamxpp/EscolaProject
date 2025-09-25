import java.util.ArrayList;

public class SchoolClass {
    private String className;
    private String responsibleTeacher;
    private Teacher teacher;
    private ArrayList<Student> listOfStudentsOnClass = new ArrayList<Student>();
    private School school;


    public boolean verifyStudentOnClass(Student studentToRegister) {
        for ( Student student : this.listOfStudentsOnClass) {
            if (student.getCpf().equals(studentToRegister.getCpf())) {
                return true;
            }
        }
        return false;
    }

    public boolean verifyTeachOnClass() {
        return this.getTeacher() != null;
    }

    public void addStudentOnClass(String cpf, School school) {
        this.school = school;
        Student student = this.school.findStudent(cpf);
        if (student != null) {
            this.setListOfStudentsOnClass(student);
        }
    }

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

    public ArrayList<Student> getListOfStudentsOnClass() {
        return listOfStudentsOnClass;
    }

    public void setListOfStudentsOnClass(Student student) {
        this.listOfStudentsOnClass.add(student);
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Teacher getTeacher(){
        return this.teacher;
    }
}
