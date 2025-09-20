import java.util.ArrayList;

public class Teacher extends Person {
    private final  ArrayList<String> subjectsTeaching = new ArrayList<>();
    private double wage;

    public Teacher(String name) {
        setName(name);
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public ArrayList<String> getSubjectsTeaching() {
        return subjectsTeaching;
    }

    public void setSubjectsTeaching(String subjectsTeaching) {
        this.subjectsTeaching.add(subjectsTeaching);
    }
}
