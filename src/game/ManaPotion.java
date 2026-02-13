package game;

public class ManaPotion extends Potion{
    public ManaPotion(int count) {
        super(count);
    }
    void toDrink(Player player) {
        player.mana+=4;
        count-=1;
    }
}

