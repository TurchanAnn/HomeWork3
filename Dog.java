package ru.geekbrains.inheritans;

public class Dog extends Animal{
    public Dog(){
        super(500, 10);
    }

    @Override
    public void running(int distance) {
        if (distance <= getRun()) {
            System.out.printf("Собака пробежала %s метров %n", distance);}
        else System.out.printf("Собака устала и не добажала %s метров %n", distance);
    }

    @Override
    public void swimming (int distance){
        if (distance<=getSwim()){
            System.out.printf("Собака проплыла %s метров",distance);
        } else System.out.printf("Собака не смогла проплыть %s метров и утонула (( %n", distance);
    }

}
