package game;
import java.util.ArrayList;

public class Inventory {
    ArrayList<Weapons> weapons;
    ArrayList<String> armory;
    ArrayList<String> potions;
    public Inventory(){
        weapons = new ArrayList<>();
        armory = new ArrayList<>();
        potions = new ArrayList<>();
    }
public void showInv(){
    System.out.println("Оружие: ");
    for( Weapons w : weapons){
        w.showWeapon();
    }
    System.out.println("Броня: "+ weapons);
    System.out.println("Зелья: "+ weapons);
}
}
