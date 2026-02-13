package game;

public class StaminaPotion extends Potion {
    public StaminaPotion(int count) {
        super(count);
    }
    void toDrink(Player player) {
        player.stamina+=4;
        count-=1;
    }
}
