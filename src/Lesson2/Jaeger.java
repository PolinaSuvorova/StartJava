package Lesson2;

public class Jaeger {
    private String modelName;
    private String mark;
    private double weight;
    private double height;
    private int armor;

    public Jaeger() {
    }

    public Jaeger(String modelName, String mark, int armor, double weight,
                  double height) {
        this.modelName = modelName;
        this.mark = mark;
        this.armor = armor;
        this.height = height;
        this.weight = weight;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void move() {
        System.out.println("\nmove " + modelName);
    }

    public void activateWeapon() {
        System.out.println("\nactivate weapon  " + modelName);
    }

    public void activatePowerMove() {
        System.out.println("\nactivate PowerMove  " + modelName);
    }
}
