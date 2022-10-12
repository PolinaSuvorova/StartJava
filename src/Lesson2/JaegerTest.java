package Lesson2;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger romeoBlue = new Jaeger();
        romeoBlue.setMark("Mark-1");
        romeoBlue.setArmor(6);
        romeoBlue.setHeight(255);
        romeoBlue.setWeight(7.7);
        romeoBlue.setModelName("Romeo Blue");
        Jaeger gipsyDanger = new Jaeger("Gipsy Avenger", "Mark-3", 6,
                2.0, 268);

        System.out.println("\nJaeger1:  " + romeoBlue.getMark());
        System.out.println("\nJaeger2:  " + gipsyDanger.getMark());

        romeoBlue.move();
        gipsyDanger.move();
        romeoBlue.activatePowerMove();
        gipsyDanger.activatePowerMove();
        romeoBlue.activateWeapon();
        gipsyDanger.activateWeapon();
        }
}
