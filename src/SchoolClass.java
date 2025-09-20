public class SchoolClass {
    private String className;
    private String responsibleTeacher;
    private Student[] listOfStudents;

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

    public Student[] getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(Student[] listOfStudents) {
        this.listOfStudents = listOfStudents;
    }
}
