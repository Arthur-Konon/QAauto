package Lesson_3;

public abstract class Human implements Actable{
    private int height;
    private int weight;
    private int age;


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human(int height, int weight, int age) {
        this.height = height;
        this.weight = weight;
        this.age = age;
    }
}
