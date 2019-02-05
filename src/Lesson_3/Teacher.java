package Lesson_3;

public class Teacher extends Human {

    private int experience;

    @Override
    public String toSpeak() {
        return ("I am a teacher!");
    }

    @Override
    public String toListen() {
        return ("Good question, very food!");
    }

    @Override
    public int toDoHomework(int x) {
        if (x%2 > 0) System.out.println("The number is odd");
                else System.out.println("The number is even");
        int rate = (int) (Math.random()* 10) ;
        System.out.println("You rate is" + rate);
                return (rate);
    }

    public Teacher(int height, int weight, int age, int experience) {
        super(height, weight, age);
        this.experience = experience;
    }
}
