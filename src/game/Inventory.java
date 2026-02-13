package game;
import java.util.ArrayList;

public class Inventory {
    ArrayList<Weapons> weapons;
    ArrayList<Armor> armory;
    ArrayList<Potion> potions;
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
    System.out.println("Броня: ");
    for( Armor a : armory){
        a.showArmor();
    }
    System.out.println("Зелья: ");

}
}
