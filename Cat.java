package ru.geekbrains.inheritans;



public class Cat extends Animal{
public Cat () {
    super(200, 0);
}
    @Override
    public void running(int distance) {
        if (distance <= getRun()) {
            System.out.printf("Кошка пробежала %s метров %n", distance);}
        else {System.out.printf("Кошка устала и не добажала %s метров", distance);}
    }

    @Override
    public void swimming (int distance) {
        if (distance <= getSwim()) {
            System.out.printf("Кошка проплыла %s метров %n", distance);
        } else {System.out.printf("Кошка не умеет плавать %n", distance);}
    }

 }


