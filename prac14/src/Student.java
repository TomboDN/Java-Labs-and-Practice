import java.util.Objects;

public class Student {
    private String name;
    private String surname;
    private String speciality;
    private int course;
    private int group;
    private int score;

    Student(String name, String surname, String speciality, int course, int group, int score){
        setName(name);
        setSurname(surname);
        setSpeciality(speciality);
        setCourse(course);
        setGroup(group);
        setScore(score);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && group == student.group && score == student.score &&
                Objects.equals(name, student.name) && Objects.equals(surname, student.surname)
                && Objects.equals(speciality, student.speciality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, speciality, course, group, score);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSpeciality() {
        return speciality;
    }

    public int getCourse() {
        return course;
    }

    public int getGroup() {
        return group;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", speciality='" + speciality + '\'' +
                ", course=" + course +
                ", group=" + group +
                ", score=" + score +
                '}';
    }
}
