package game;

import java.util.Scanner;

public class Player {
    String namep;
    String charClass;
    int health;
    int attack;
    int defense;
    int mana;
    int stamina;
    Inventory inventory;
    public Weapons eqpdWeapons;
    public Armor eqpdArmor;

    public void eqpItem(){
        Scanner cs= new Scanner(System.in);
        if(!inventory.weapons.isEmpty()){
            System.out.println("Выберите оружие");
                for(int i=0;i<inventory.weapons.size();i++){
                    
                }
            
        }
        
    }

    public Player(String namep, String charClass){
        this.namep=namep.trim();
        this.charClass=charClass.trim();
        this.inventory= new Inventory();
        switch(this.charClass){
            case "Батыр":
                health=150;
                attack=15;
                defense=10;
                stamina= 12;
                mana=0;
                inventory.weapons.add(Weapons.startsaber);
                inventory.armory.add(Armor.startbatyr);
                break;
            case "Шаман":
                health = 75;
                attack= 20;
                defense = 5;
                stamina=2;
                mana=12;
                inventory.weapons.add(Weapons.startstaff);
                inventory.armory.add(Armor.startshaman);
                break;
            case "Сайгакшы":
                health=100;
                attack=17;
                defense=8;
                stamina=8;
                mana=8;
                inventory.weapons.add(Weapons.startbow);
                inventory.armory.add(Armor.startsaygak);
                break;
                default:
        System.out.println("Такого класса нет!");
        
        
        }
        
            
    }

}
