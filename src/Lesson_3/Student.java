package Lesson_3;

public class Student extends Human {

    private int rating;

    public Student(int height, int weight, int age, int rating) {
        super(height, weight, age);
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


    @Override
    public String toSpeak() {
        String reply = "Student - Yes sir, my rating is:" + getRating();
        return reply;
    }

    @Override
    public int toListen(int number) {
        return 0;
    }

    @Override
    public int toDoHomework(int number) {
        int myNumber = (int) (Math.random() * 100);
        System.out.println("Student - My home task result is:" + myNumber);
        return (myNumber);
    }
}
