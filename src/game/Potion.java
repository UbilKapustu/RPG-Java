package game;

public abstract class Potion {
    int count = 0;

    public Potion() {
    }

    public Potion(int count) {
        this.count = count;
    }

    abstract void toDrink(Player player);

    void showPotion() {
        System.out.println(getClass().getSimpleName() + " | осталось: " + count);
    }
}
