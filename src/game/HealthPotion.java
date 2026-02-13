package game;

public class HealthPotion extends Potion{
    void toDrink(Player player) {
        player.health+=20;
    }
}
