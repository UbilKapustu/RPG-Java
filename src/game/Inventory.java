package game;
import java.util.ArrayList;

public class Inventory {
    ArrayList<String> weapons;
    ArrayList<String> armory;
    ArrayList<String> potions;
    public Inventory(){
        weapons = new ArrayList<>();
        armory = new ArrayList<>();
        potions = new ArrayList<>();
    }
public void showInv(){
    System.out.println("Оружие: "+ weapons);
    System.out.println("Броня: "+ weapons);
    System.out.println("Зелья: "+ weapons);
}
}
