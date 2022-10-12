package Lesson2;

public class Wolf {
    private String nickname;
    private double weight;
    private int age;
    private String color;
    private String gender;

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
