package game;

import java.util.Scanner;

public class Game {
    Player player;
    Scanner sc = new Scanner(System.in);

    public void start() {
        init();
        gameLoop();
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
        player = new Player(namep, charClass);
    }

    private void gameLoop(){
        while(player.isAlive){
            System.out.println("\n1 - Статус");
            System.out.println("2 - Инвентарь");
            System.out.println("0 - Выход");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> player.getStatus();
                case 2 -> player.inventory.showInv();
                case 0 -> player.isAlive=false;
            }
        }
    }


    private void shutdown(){
        System.out.println("Игра завершена.");
    }


}
