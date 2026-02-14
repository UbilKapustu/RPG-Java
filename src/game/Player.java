package game;

public class Player extends Character {

    public Player(String namep, String charClass) {
        this.namep = namep.trim();
        this.charClass = charClass.trim();
        this.inventory = new Inventory();
        switch (this.charClass) {
            case "Батыр":
                setStats(150,15,3,0,12);
                inventory.weapons.add(Weapons.startsaber);
                inventory.armory.add(Armor.startbatyr);
                inventory.potions.add(new HealthPotion(2));
                inventory.potions.add(new StaminaPotion(1));
                break;
            case "Шаман":
                setStats(75,24,1,12,2);
                inventory.weapons.add(Weapons.startstaff);
                inventory.armory.add(Armor.startshaman);
                inventory.potions.add(new ManaPotion(2));
                inventory.potions.add(new HealthPotion(2));
                break;
            case "Сайгакшы":
                setStats(100,18,2,8,8);
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
