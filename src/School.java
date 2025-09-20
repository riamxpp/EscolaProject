import java.util.ArrayList;

public class School {
    private final ArrayList<Student> listOfStudents = new ArrayList<Student>();
    private Teacher[] listOfTeaches;
    private SchoolClass[] listOfSchoolClass;

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
