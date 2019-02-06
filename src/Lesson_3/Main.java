package Lesson_3;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(185, 73, 38, 0);
        Teacher teacher1 = new Teacher(180, 80, 27, 7);

        System.out.println(teacher1.toSpeak());
        int numberFromStudent = student1.toDoHomework(teacher1.generateHomeTaskNumber());
        int newRating = teacher1.toDoHomework(teacher1.toListen(numberFromStudent));

        student1.setRating(newRating);
        System.out.println(student1.toSpeak());

    }
}
