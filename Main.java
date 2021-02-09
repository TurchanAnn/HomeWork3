package ru.geekbrains.Test;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        playGame();

    }
        static void playGame () {

            int rand = random.nextInt(9) + 1;
            int summ = 0;
            System.out.println("Угадайте число от 0 до 9 с 3х попыток!");

                for (int i=0; i<3; i++) {
                    System.out.println("Попытка " + (i+1) + ": ");
                    int numb = scanner.nextInt();
                if (rand == numb) {
                    summ++;
                    System.out.println("Вы угадали c " +summ+ " раза!");
                    break;
                } if (rand < numb)
                    System.out.println("Ваше число больше загаданного");
               if (rand > numb) System.out.println("Ваше число меньше загаданного");
                summ++;
            }

            System.out.println();
                System.out.println("Повторить игру еще раз?");
                System.out.println("1 - да");
                System.out.println("2 - нет");
                int numb2 = scanner.nextInt();
                if (numb2 == 1) {
                    playGame();
                } else System.out.println("Всего хорошего! Надеюсь наша игра Вам понравилась.");
                break;



        }}







