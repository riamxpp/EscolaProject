import java.util.ArrayList;

public class School {
    private final ArrayList<Student> listOfStudents = new ArrayList<Student>();
    private final ArrayList<Teacher> listOfTeachers = new ArrayList<Teacher>();
    private final ArrayList<SchoolClass> listOfSchoolClass = new ArrayList<SchoolClass>();
    private Teacher[] listOfTeaches;

    public void registerSchoolClass(SchoolClass schoolClass) {
        this.listOfSchoolClass.add(schoolClass);
    }

    public void getSchoolClass() {
        for (int i=0; i<listOfSchoolClass.size(); i++) {
            System.out.println(listOfSchoolClass.get(i));
        }
    }

    public void registerTeacher(Teacher teacher) {
        this.listOfTeachers.add(teacher);
    }

    public void getTeachers() {
        for (int i=0; i<listOfTeachers.size(); i++) {
            System.out.println(listOfTeachers.get(i));
        }
    }

    public void registerStudent(Student studant) {
        this.listOfStudents.add(studant);
    }

    public void getStudents() {
        for (int i=0; i<listOfStudents.size(); i++) {
            System.out.println(this.listOfStudents.get(i));
        }
    }
}
