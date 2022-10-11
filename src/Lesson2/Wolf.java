package Lesson2;

public class Wolf {
    private String nickname;
    private double weight;
    private int age;
    private String color;
    private String gender;

    public Wolf(int age, String nickname, int weight, String color,String gender) {
        this.age = age;
        this.nickname = nickname;
        this.weight = weight;
        this.color = color;
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getGender() {
        return gender;
    }

    public void go() {
        System.out.println("Идёт");
    }

    public void run() {
        System.out.println("Бежит");
    }

    public void sit() {
        System.out.println("Сидит");
    }

    public void hunt() {
        System.out.println("Охотится");
    }

    public void howl() {
        System.out.println("Воет");
    }


}
