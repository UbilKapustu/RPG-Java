package game;

import java.util.List;
import java.util.Scanner;

public class Fight {
    Player player;
    List<Enemy> enemies;
    Scanner sc = new Scanner(System.in);

    public Fight(Player player, List<Enemy> enemies){
        this.player=player;
        this.enemies=enemies;
    }
//Если стамина выше у нас бьем мы, если равна или меньше бьет враг, но подряд каждый может ударить только дважды.
    public void fight(){
        while(hasEnemies()&& player.isAlive) {
            int target = chooseTarget();
            if (target == 0 ||target > enemies.size()) {
                System.out.println("Вы покинули драку");
                break;
            }
            else {
                 target -= 1;
                while (player.isAlive && enemies.get(target).isAlive) {
                    if (player.getStamina() > enemies.get(target).getStamina()) {
                        hitPlayer(target);
                        if (!enemies.get(target).isAlive) {
                            enemies.remove(target);
                            break;
                        }
                        if (player.getStamina() > enemies.get(target).getStamina()) {
                            hitPlayer(target);
                            if (!enemies.get(target).isAlive){
                                enemies.remove(target);
                                break;
                            }
                            hitEnemy(target);
                        } else {
                            hitEnemy(target);
                            if (!player.isAlive) break;
                        }
                    } else {
                        hitEnemy(target);
                        if (!player.isAlive) break;
                    }
                }
                player.StaminaRegen(player.getMax_stamina());
            }
        }
    }

    public void hitPlayer(int target){
        enemies.get(target).DamageTaken(player.getAttack());
        player.StaminaLoss(player.inventory.weapons.getFirst().stamina_loss);
        System.out.println("Герой потерял выносливости:" + player.inventory.weapons.getFirst().stamina_loss);
    }

    public void hitEnemy(int target){
        player.DamageTaken(enemies.get(target).getAttack());
        enemies.get(target).StaminaLoss(enemies.get(target).inventory.weapons.getFirst().stamina_loss);
        System.out.println("Враг потерял выносливости:" + enemies.get(target).inventory.weapons.getFirst().stamina_loss);
    }


    public int chooseTarget(){
        System.out.println("Выберите цель:");
        for (int i=0; i<enemies.size();i++)
            System.out.println("- "+ (i+1) +" "+ enemies.get(i).namep);
        System.out.println("- 0 Выйти из драки");
        int target= sc.nextInt();
        return target;
    }

    public boolean hasEnemies() {
        for (Enemy enemy : enemies) {
            if (enemy.isAlive)
                return true;
        }
        return false;
    }
}
