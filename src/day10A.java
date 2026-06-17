import java.util.LinkedList;
public class day10A {

    static class Student {
        String name;
        int regNo;
        int marks;

        Student(String name, int regNo, int marks) {
            this.name = name;
            this.regNo = regNo;
            this.marks = marks;
        }
    }

    static void removeStudent(LinkedList<Student> students) {
        System.out.println("Removed : " + students.removeFirst().name);
    }

    static void updateStudent(LinkedList<Student> students) {
        for (Student s : students) {
            if (s.name.equals("Deepa")) {
                s.marks = 95; // Update marks from 85 to 95
            }
        }
    }

    public static void main(String[] args) {

        LinkedList<Student> students = new LinkedList<>();


        students.add(new Student("Siva", 111, 82));
        students.add(new Student("Deepak", 112, 77));
        students.add(new Student("Vicky", 113, 93));
        students.add(new Student("Kavish", 114, 86));
        students.add(new Student("Naveen", 115, 73));


        removeStudent(students);


        updateStudent(students);


        System.out.println("\nStudent Details");
        for (Student s : students) {
            System.out.println(
                    s.name + " " +
                            s.regNo + " " +
                            s.marks
            );
        }
    }
}