public class Student extends Person {
    private String className;
    private Double[] score;

    public Student(String name) {
        setName(name);
    }

    @Override // sobrescre o método toString() para conseguir exibir o Student no system.out;
    public String toString() {
        return "Nome: " + getName() +
                ", Turma: " + getClassName() +
                ", Data de Nascimento: " + getDateOfBirth() +
                ", Ocupação: " + getOccupation();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String student_class) {
        this.className = student_class;
    }

    public Double[] getScore() {
        return score;
    }

    public void setScore(Double[] score) {
        this.score = score;
    }
}