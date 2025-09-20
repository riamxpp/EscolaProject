public class SchoolClass {
    private String className;
    private String responsibleTeacher;
    private Student[] listOfStudants;

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

    public Student[] getListOfStudants() {
        return listOfStudants;
    }

    public void setListOfStudants(Student[] listOfStudants) {
        this.listOfStudants = listOfStudants;
    }
}
