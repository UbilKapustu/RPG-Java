package game;

public class HealthPotion extends Potion{
    public HealthPotion(int count) {
        super(count);
    }
    void toDrink(Player player) {
        if (count <= 0) {
            System.out.println("Зелье лечения закончилось.");
            return;
        }
        player.Heal(20);
        count--;
    }
}
