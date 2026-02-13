package game;

import java.util.Scanner;

public class Player {
    String namep;
    String charClass;
    int max_health;
    int health;
    int attack;
    int defense;
    int max_mana;
    int mana;
    int max_stamina;
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
                max_health=150;
                health=max_health;
                attack=15;
                defense=10;
                max_stamina = 12;
                stamina=max_stamina;
                max_mana=0;
                mana=max_mana;
                inventory.weapons.add(Weapons.startsaber);
                inventory.armory.add(Armor.startbatyr);
                inventory.potions.add(new HealthPotion(2));
                inventory.potions.add(new StaminaPotion(1));
                break;
            case "Шаман":
                max_health = 75;
                health=max_health;
                attack= 20;
                defense = 5;
                max_stamina =2;
                stamina=max_stamina;
                max_mana=12;
                mana=max_mana;
                inventory.weapons.add(Weapons.startstaff);
                inventory.armory.add(Armor.startshaman);
                inventory.potions.add(new ManaPotion(2));
                inventory.potions.add(new HealthPotion(2));
                break;
            case "Сайгакшы":
                max_health=100;
                health=max_health;
                attack=17;
                defense=8;
                max_stamina =8;
                stamina=max_stamina;
                max_mana=8;
                mana=max_mana;
                inventory.weapons.add(Weapons.startbow);
                inventory.armory.add(Armor.startsaygak);
                inventory.potions.add(new ManaPotion(1));
                inventory.potions.add(new HealthPotion(1));
                inventory.potions.add(new StaminaPotion(1));
                break;
                default:
        System.out.println("Такого класса нет!");
        
        
        }
        
            
    }

}
