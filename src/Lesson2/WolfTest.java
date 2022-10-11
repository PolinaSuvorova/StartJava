package Lesson2;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf(5,"Вольт",15,"Белый","мальчик");
        System.out.println( "Имя " + wolf.getNickname());
        System.out.println( "Возраст " + wolf.getAge());
        System.out.println( "Вес " + wolf.getWeight());
        System.out.println( "Цвет " + wolf.getColor());
        System.out.println( "Пол " + wolf.getGender());
    }
}
