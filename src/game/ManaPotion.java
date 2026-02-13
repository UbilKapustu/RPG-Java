package game;

public class ManaPotion extends Potion{
    void toDrink(Player player) {
        player.mana+=4;
    }
}

