package Lesson_3;

public class Teacher extends Human {

    private int experience;


    public Teacher(int height, int weight, int age, int experience) {
        super(height, weight, age);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toSpeak() {
        return ("Teacher - Don`t move! I am a teacher!");
    }

    @Override
    public int toListen(int number) {
        return number;
    }

    @Override
    public int toDoHomework(int number) {
        int rate = 0;

        if (number % 5 == 0) {
            rate = 5;
        } else if (number % 4 == 0) {
            rate = 4;
        } else if (number % 3 == 0) {
            rate = 3;
        } else if (number % 2 == 0) {
            rate = 2;
        } else {
            rate = 2;
        }
        System.out.println("Teacher - You rate is:" + rate);
        return (rate);
    }

    public int generateHomeTaskNumber() {
        int homeTaskNumber = (int) (Math.random() * 100);
        return homeTaskNumber;
    }
}
