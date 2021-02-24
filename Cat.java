package ru.geekbrains.prev.CatPlate;

public class Cat {

    private String name;
    private int appetite;
    public boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate plate){
        plate.decreaseEat(appetite);
    }

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }


}
