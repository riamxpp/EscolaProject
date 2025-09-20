class Studant extends Person {
    private String registration;
    private String studant_class;
    private String[] score;

    public Studant(String name) {
        setName(name);
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getStudant_class() {
        return studant_class;
    }

    public void setStudant_class(String studant_class) {
        this.studant_class = studant_class;
    }

    public String[] getScore() {
        return score;
    }

    public void setScore(String[] score) {
        this.score = score;
    }
}