package ru.geekbrains.prev.CatPlate;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseEat (int n) {
        food -= n;
    }

    public void increaseEat (int n) {
        food += n;
    }

    public void info(){
        System.out.println("В тарелке: " + food);
    }

    public int getFood() {
        return food;
    }
}
