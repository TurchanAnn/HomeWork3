package ru.geekbrains.prev.CatPlate;


import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Бегемот", 25, false),
                new Cat("Монстр", 20, false),
                new Cat("Фред", 10, false)
        };

        Plate plate = new Plate(20);
        Scanner scanner = new Scanner(System.in);
        int incr;
        plate.info();
        eatingCat(cats, plate);
        plate.info();
        System.out.println("Накормим котиков еще раз? Сколько насыпать еды?");
        incr = scanner.nextInt();
        plate.increaseEat(incr);
        plate.info();
        eatingCat(cats,plate);

    }

    private static void eatingCat(Cat[]cats, Plate plate) {
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].satiety == false && cats[i].getAppetite() < plate.getFood()){
                cats[i].eat(plate);
                cats[i].satiety = true;
                System.out.println("Котик " + cats[i].getName() + " покушал!");
            } else {
                System.out.println("Котик " + cats[i].getName() + " не поел! Ему не хватило еды...");
            }
        }
    }


}