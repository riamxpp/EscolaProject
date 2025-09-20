public class Student extends Person {
    private String student_class;
    private Double[] score;

    public Student(String name) {
        setName(name);
    }

    @Override // sobrescre o método toString() para conseguir exibir o Student no system.out;
    public String toString() {
        return "Nome: " + getName() +
                ", Turma: " + getStudent_class() +
                ", Data de Nascimento: " + getDateOfBirth() +
                ", Ocupação: " + getOccupation();
    }

    public String getStudent_class() {
        return student_class;
    }

    public void setStudent_class(String student_class) {
        this.student_class = student_class;
    }

    public Double[] getScore() {
        return score;
    }

    public void setScore(Double[] score) {
        this.score = score;
    }
}