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
            
        }
    
    }

}
