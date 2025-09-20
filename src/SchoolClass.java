public class SchoolClass {
    private String className;
    private String responsibleTeacher;
    private Studant[] listOfStudants;

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

    public Studant[] getListOfStudants() {
        return listOfStudants;
    }

    public void setListOfStudants(Studant[] listOfStudants) {
        this.listOfStudants = listOfStudants;
    }
}
