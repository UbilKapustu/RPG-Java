package game;

public class HealthPotion extends Potion{
    public HealthPotion(int count) {
        super(count);
    }
    void toDrink(Player player) {
        if (count <= 0) {
            System.out.println("Зелье лечения закончилось");
            return;
        }
        player.health += 20;
        count--;
        System.out.println("Вы восстановили 20 HP");
        if(player.health> player.max_health)player.health=player.max_health;
    }
}
