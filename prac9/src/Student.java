public class Student implements Comparable<Student> {
    private static int nextId = 1;

    private int id;
    private final String name;
    private double gpa;

    Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
        id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public int getId() {
        return id;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setId() {
        nextId++;
        this.id = nextId;
    }

    public static int getNextId() {
        return nextId;
    }

    @Override
    public int compareTo(Student o) {
        double result = this.gpa - o.getGpa();
        if (result != 0) {
            return (int) (result / Math.abs(result));
        }
        return 0;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
