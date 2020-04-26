import group.GroupOfStudents;

public class Main {
    public static void main(String[] args) {
        GroupOfStudents groupOfStudents = new GroupOfStudents();
        groupOfStudents.addStudent();
        groupOfStudents.changeFaculty();
        groupOfStudents.changeName();
        groupOfStudents.changeAverageGrade();
        groupOfStudents.removeStudent();
        groupOfStudents.printAllStudents();
    }
}
