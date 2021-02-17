package ru.geekbrains.inheritans;

public abstract class Animal {
    private int run;
    private int swim;

    public Animal(int run, int swim) {
        this.run = run;
        this.swim = swim;
    }

    int getRun() {
        return run;
    }

    int getSwim() {
        return swim;
    }

    public abstract void running(int distance);
    public abstract void swimming(int distance);



}
