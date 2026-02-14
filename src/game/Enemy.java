package game;

public class Enemy extends Character {

    public Enemy(String namep, String charClass) {
        this.namep = namep.trim();
        this.charClass = charClass.trim();
        this.inventory = new Inventory();
        switch (this.charClass) {
            case "Мамбет":
                setStats(25, 8, 1, 0, 5);
                inventory.weapons.add(Weapons.mambetsstick);
                inventory.armory.add(Armor.kozhankamambicha);
                break;
            case "Волк":
                setStats(40, 12, 2, 0, 8);
                inventory.weapons.add(Weapons.kogtivolka);
                inventory.armory.add(Armor.shkuravolka);
                break;
            case "Сайгак":
                setStats(15, 10, 2, 0, 15);
                inventory.weapons.add(Weapons.kopitosaygaka);
                inventory.armory.add(Armor.sherstsaygaka);
                break;
            default:
                System.out.println("Такого класса нет!");
        }
    }
}