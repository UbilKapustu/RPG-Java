package game;

public class ManaPotion extends Potion{
    public ManaPotion(int count) {
        super(count);
    }
    void toDrink(Player player) {
        if (count <= 0) {
            System.out.println("Зелье маны закончилось.");
            return;
        }
        player.ManaRegen(4);
        count--;
    }
}

