public class Studant extends Person {
    private String studant_class;
    private Double[] score;

    public Studant(String name) {
        setName(name);
    }

    @Override // sobrescre o método toString() para conseguir exibir o Student no system.out;
    public String toString() {
        return "Nome: " + getName() +
                ", Turma: " + getStudant_class() +
                ", Data de Nascimento: " + getDateOfBirth() +
                ", Ocupação: " + getOccupation();
    }

    public String getStudant_class() {
        return studant_class;
    }

    public void setStudant_class(String studant_class) {
        this.studant_class = studant_class;
    }

    public Double[] getScore() {
        return score;
    }

    public void setScore(Double[] score) {
        this.score = score;
    }
}