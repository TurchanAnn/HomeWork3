package ru.geekbrains.inheritans;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Animal[] animals = {new Cat(), new Dog()};
        int distance;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте дистанцию в метрах, которую пробежит и проплывет животное");
        distance = scanner.nextInt();

        for (Animal animal : animals) {
            animal.running(distance);
            animal.swimming(distance);
            System.out.println();

        }


    }
}
