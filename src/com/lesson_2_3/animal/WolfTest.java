package com.lesson_2_3.animal;

import com.lesson_2_3.animal.Wolf;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.setAge(9);
        wolf.setColor("Белый");
        wolf.setGender("Мальчик");
        wolf.setNickname("Вольт");
        wolf.setWeight(15.2);

        System.out.println("Имя " + wolf.getNickname());
        System.out.println("Возраст " + wolf.getAge());
        System.out.println("Вес " + wolf.getWeight());
        System.out.println("Цвет " + wolf.getColor());
        System.out.println("Пол " + wolf.getGender());

        wolf.go();
        wolf.howl();
        wolf.run();
        wolf.sit();
        wolf.hunt();
    }
}
