package game;
import java.util.List;

public class Location {
    String name;
    String about;
    List<Enemy> enemies;
    boolean cleared;

    public Location(String name, String about, List<Enemy> enemies) {
        this.name = name;
        this.about = about;
        this.enemies =enemies;
        this.cleared = false;
    }

    public static Location aul= new Location("Стартовый аул","Здесь собрались такие же салаги" +
            " как и ты, тебе придется впервые сразиться с мамбичем, и постоять за свою шкуру" +
            " а дальше разберешься!",List.of(new Enemy("Ара","Мамбет")));

    public void enter() {
        System.out.println("Вы вошли в:");
        showLocation();

        if (!cleared && hasEnemies()) {
            System.out.println("Здесь враги:");
            for (Enemy enemy : enemies) {
                System.out.println("- " + enemy.namep);
            }
        } else {
            System.out.println("Локация зачищена.");
        }
    }




    public boolean hasEnemies() {
        for (Enemy enemy : enemies) {
            if (enemy.isAlive)
                return true;
        }
        return false;
    }

    public void showLocation(){
        System.out.println(name + "\nОписание: "+about+"\nЗачищена: "+cleared);
    }
}
