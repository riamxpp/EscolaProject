import java.util.ArrayList;

public class School {
    private final ArrayList<Student> listOfStudents = new ArrayList<Student>();
    private final ArrayList<Teacher> listOfTeachers = new ArrayList<Teacher>();
    private final ArrayList<SchoolClass> listOfSchoolClass = new ArrayList<SchoolClass>();

    public boolean addStudentOnClass(String studentCPF, String className) {
        Student foundStudent = findStudent(studentCPF);
        SchoolClass schoolClass = findSchoolClass(className);
        if (foundStudent == null) {
            return false;
        }
        if (schoolClass != null) {
            schoolClass.addStudentOnClass(foundStudent);
            return true;
        };
        return false;
    }

    public SchoolClass findSchoolClass(String className) {
        for (SchoolClass schoolClass : this.listOfSchoolClass) {
            if (schoolClass.getClassName().equals(className)) {
                return  schoolClass;
            }
        }

        return null;
    }

    public void addStudentOnSchool(Student student) {
        if (student != null) {
            this.listOfStudents.add(student);
        }
    }

    public void addTeacherOnClass(Teacher teacher, SchoolClass schoolClass) {
        boolean hasTeacherOnClass = false;
        hasTeacherOnClass = schoolClass.verifyTeachOnClass();

        if (!hasTeacherOnClass) {
            schoolClass.setTeacher(teacher);
        }
    }

    public Student findStudent(String cpf) {
        for (int i=0; i<listOfStudents.size(); i++) {
            if (listOfStudents.get(i).getCpf().equals(cpf)) {
                return listOfStudents.get(i);
            }
        }

        return null;
    }

    public void registerSchoolClass(SchoolClass schoolClass) {
        this.listOfSchoolClass.add(schoolClass);
    }

    public void getSchoolClassOnSchool() {
        for (int i=0; i<listOfSchoolClass.size(); i++) {
            System.out.println(listOfSchoolClass.get(i));
        }
    }

    public void registerTeacherOnSchool(Teacher teacher) {
        this.listOfTeachers.add(teacher);
    }

    public void getTeachers() {
        for (int i=0; i<listOfTeachers.size(); i++) {
            System.out.println(listOfTeachers.get(i));
        }
    }

    public void getStudents() {
        for (int i=0; i<listOfStudents.size(); i++) {
            System.out.println(this.listOfStudents.get(i));
        }
    }
}
