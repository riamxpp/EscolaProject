public class Teacher extends Person {
    private String[] subjectsTeaching;
    private double wage;

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public String[] getSubjectsTeaching() {
        return subjectsTeaching;
    }

    public void setSubjectsTeaching(String[] subjectsTeaching) {
        this.subjectsTeaching = subjectsTeaching;
    }
}
