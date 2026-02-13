package game;

public class HealthPotion extends Potion{
    public HealthPotion(int count) {
        super(count);
    }
    void toDrink(Player player) {
        player.health+=20;
        count-=1;
    }
}
