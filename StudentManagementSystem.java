import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Grade {
    private int score;

    public Grade(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

class Course {
    private String name;
    private Map<Student, Grade> grades;

    public Course(String name) {
        this.name = name;
        this.grades = new HashMap<>();
    }

    public void addGrade(Student student, Grade grade) {
        grades.put(student, grade);
    }

    public void updateGrade(Student student, Grade grade) {
        grades.put(student, grade);
    }

    public void removeGrade(Student student) {
        grades.remove(student);
    }

    public double calculateGPA() {
        double totalScore = 0;
        int numStudents = grades.size();
        if (numStudents == 0) return 0.0;
        for (Grade grade : grades.values()) {
            totalScore += grade.getScore();
        }
        return totalScore / numStudents;
    }
}

class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public void updateName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Create courses
        Course mathCourse = new Course("Mathematics");
        Course physicsCourse = new Course("Physics");

        // Assign grades to students
        Grade mathGradeForStudent1 = new Grade(85);
        Grade mathGradeForStudent2 = new Grade(90);
        Grade physicsGradeForStudent1 = new Grade(75);
        Grade physicsGradeForStudent2 = new Grade(80);

        mathCourse.addGrade(student1, mathGradeForStudent1);
        mathCourse.addGrade(student2, mathGradeForStudent2);
        physicsCourse.addGrade(student1, physicsGradeForStudent1);
        physicsCourse.addGrade(student2, physicsGradeForStudent2);

        // Calculate GPA
        double mathGPA = mathCourse.calculateGPA();
        double physicsGPA = physicsCourse.calculateGPA();

        // Print GPA
        System.out.println("Math GPA: " + mathGPA);
        System.out.println("Physics GPA: " + physicsGPA);
    }
}

