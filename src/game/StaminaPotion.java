package game;

public class StaminaPotion extends Potion {
    public StaminaPotion(int count) {
        super(count);
    }
    void toDrink(Player player) {
        if (count <= 0) {
            System.out.println("Зелье выносливости закончилось.");
            return;
        }
        player.StaminaRegen(4);
        count--;
    }
}
