package game;

public class Player {
    String name;
    String charClass;
    int health;
    int attack;
    int defense;
    int mana;
    int stamina;
    Inventory inventory;
    public Player(String name, String charClass){
        this.name=name;
        this.charClass=charClass;
        this.inventory= new Inventory();
        switch(charClass){
            case "Батыр":
                health=150;
                attack=15;
                defense=10;
                stamina= 12;
                mana=0;
                break;
            case "Шаман":
                health = 75;
                attack= 20;
                defense = 5;
                stamina=2;
                mana=12;
                break;
            case "Сайгакшы":
                health=100;
                attack=17;
                defense=8;
                stamina=8;
                mana=8;
        }
    
    }

}
