public class Course {
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new String[10]; // Initial default capacity
        this.numberOfStudents = 0;
    }

    // Getter for course name
    public String getCourseName() {
        return courseName;
    }

    // Add student with dynamic array resizing
    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    // Drop student and shift remaining elements
    public void dropStudent(String student) {
        int index = -1;
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equalsIgnoreCase(student)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < numberOfStudents - 1; i++) {
                students[i] = students[i + 1];
            }
            students[numberOfStudents - 1] = null;
            numberOfStudents--;
        }
    }

    // Get array containing active students
    public String[] getStudents() {
        String[] activeStudents = new String[numberOfStudents];
        System.arraycopy(students, 0, activeStudents, 0, numberOfStudents);
        return activeStudents;
    }

    // Getter for number of students
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}