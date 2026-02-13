package game;

public class StaminaPotion extends Potion {
    void toDrink(Player player) {
        player.stamina+=4;
    }
}
