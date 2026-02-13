package game;

public class StaminaPotion extends Potion {
    public StaminaPotion(int count) {
        super(count);
    }
    void toDrink(Player player) {
        if (count <= 0) {
            System.out.println("Зелье выносливости закончилось");
            return;
        }
        player.max_stamina += 4;
        count--;
        System.out.println("Вы восстановили 4 ST");
        if(player.stamina> player.max_stamina)player.stamina=player.max_stamina;
    }
}
