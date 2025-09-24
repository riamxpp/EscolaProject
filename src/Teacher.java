import java.util.ArrayList;

public class Teacher extends Person {
    private final  ArrayList<String> subjectsTeaching = new ArrayList<>();
    private double wage;
    private ArrayList<String> subjects = new ArrayList<>();

    public Teacher(String name) {
        setName(name);
    }

    @Override // sobrescre o método toString() para conseguir exibir o Student no system.out;
    public String toString() {
        return "Nome: " + getName() +
                ", Data de Nascimento: " + getDateOfBirth() +
                ", Ocupação: " + getOccupation() +
                ", Salário: " + getWage();
    }
    
    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(String subject) {
        this.subjects.add(subject);
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
