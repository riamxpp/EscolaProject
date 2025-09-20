import java.util.ArrayList;

public class School {
    private final ArrayList<Student> listOfStudents = new ArrayList<Student>();
    private final ArrayList<Teacher> listOfTeachers = new ArrayList<Teacher>();
    private Teacher[] listOfTeaches;
    private SchoolClass[] listOfSchoolClass;

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

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    public Teacher[] getListOfTeaches() {
        return listOfTeaches;
    }

    public SchoolClass[] getListOfSchoolClass() {
        return listOfSchoolClass;
    }
}
