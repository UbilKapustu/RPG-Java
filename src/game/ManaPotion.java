package game;

public class ManaPotion extends Potion{
    public ManaPotion(int count) {
        super(count);
    }
    void toDrink(Player player) {
        if (count <= 0) {
            System.out.println("Зелье маны закончилось");
            return;
        }
        player.mana += 4;
        count--;
        System.out.println("Вы восстановили 4 MP");
        if(player.mana> player.max_mana)player.mana=player.max_mana;
    }
}

