package game;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите имя");
        String name=sc.nextLine();
        System.out.println("Выберите класс: Батыр,Сайгакшы,Шаман");
        String charClass=sc.nextLine();
        Player player = new Player(name, charClass);
        System.out.println("Ваш Персонаж: " );
        System.out.println("Имя: "+ player.name);
        System.out.println("Класс: "+ player.charClass);
        System.out.println("Здоровье: "+player.health);
        System.out.println("Защита: "+player.defense);
        System.out.println("Выносливость: "+ player.stamina);
        System.out.println("Мана: "+player.mana);
        System.out.println("\nИнвентарь");
        player.inventory.showInv();
    }
}
