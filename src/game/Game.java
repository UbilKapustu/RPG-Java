package game;

import java.util.Scanner;

public class Game {
    boolean running = true;
    Player player;
    Scanner sc = new Scanner(System.in);

    public void start() {
        init();
        //gameLoop();
        shutdown();
    }

    private void init() {
        System.out.println("Введите имя:");
        String namep=sc.nextLine();
        System.out.println("Выберите класс персонажа:");
        System.out.println("1  Батыр");
        System.out.println("2  Шаман");
        System.out.println("3  Сайгакшы");

        int choice = 0;
        while (choice < 1 || choice > 3) {
            System.out.print("Введите номер класса (1-3): ");
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine();
            } else {
                sc.nextLine();
                System.out.println("Ошибка! Введите число от 1 до 3.");
            }
        }

        String charClass = "";
        switch (choice) {
            case 1 -> charClass = "Батыр";
            case 2 -> charClass = "Шаман";
            case 3 -> charClass = "Сайгакшы";
        }
        Player player = new Player(namep, charClass);
        player.getStatus();
    }

    public void shutdown(){
        System.out.println("Игра завершена.");
    }
}
