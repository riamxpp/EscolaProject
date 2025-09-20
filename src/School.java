import java.util.ArrayList;

public class School {
    private final ArrayList<Studant> listOfStudants = new ArrayList<Studant>();
    private Teacher[] listOfTeaches;
    private SchoolClass[] listOfSchoolClass;

    public void registerStudant(Studant studant) {
        this.listOfStudants.add(studant);
    }

    public void getStudents() {
        for (int i=0; i<listOfStudants.size(); i++) {
            System.out.println(this.listOfStudants.get(i));
        }
    }

    public ArrayList<Studant> getListOfStudants() {
        return listOfStudants;
    }

    public Teacher[] getListOfTeaches() {
        return listOfTeaches;
    }

    public SchoolClass[] getListOfSchoolClass() {
        return listOfSchoolClass;
    }
}
