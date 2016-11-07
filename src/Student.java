//Jialiang Liang
class Student implements Comparable<Student> { // Do not change this line
    private String name;
    private int id;
    private int gradYear;
    private static int numberOfStudents;

    public Student(String name, int id, int gradYear) {
        this.name = name;
        this.id = id;
        this.gradYear = gradYear;
    }
    public int getgradYear() {
        return gradYear;
    }

    public void setgradYear(int GradYear) {
        gradYear = GradYear;
    }

    public int getid() {
        return id; }

    public void setid(int ID) {
        id = ID; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        Student.numberOfStudents = numberOfStudents;
    }

    public static void addStudent(String name, int id, int gradYear) {
        numberOfStudents++;
    }

    public static void dropStudent(String name) {
        numberOfStudents--;
    }

}
