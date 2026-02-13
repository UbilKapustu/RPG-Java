package game;

public class Player {
    String namep;
    String charClass;
    int health;
    int attack;
    int defense;
    int mana;
    int stamina;
    Inventory inventory;
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
                break;
            case "Шаман":
                health = 75;
                attack= 20;
                defense = 5;
                stamina=2;
                mana=12;
                inventory.weapons.add(Weapons.startstaff);
                break;
            case "Сайгакшы":
                health=100;
                attack=17;
                defense=8;
                stamina=8;
                mana=8;
                inventory.weapons.add(Weapons.startbow);
                break;
                default:
        System.out.println("Такого класса нет!");
        }
    
    }

}
