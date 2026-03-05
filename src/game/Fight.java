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
            while (player.isAlive && enemies.get(target).isAlive) {
                if (player.getStamina() > enemies.get(target).getStamina() && player.isAlive && enemies.get(target).isAlive) {
                    enemies.get(target).DamageTaken(player.getAttack());
                    player.StaminaLoss(player.inventory.weapons.getFirst().stamina_loss);
                    System.out.println("Герой потерял выносливости:" + player.inventory.weapons.getFirst().stamina_loss);
                    if(!enemies.get(target).isAlive) break;
                    if (player.getStamina() > enemies.get(target).getStamina() && player.isAlive && enemies.get(target).isAlive) {
                        enemies.get(target).DamageTaken(player.getAttack());
                        player.StaminaLoss(player.inventory.weapons.getFirst().stamina_loss);
                        System.out.println("Герой потерял выносливости:" + player.inventory.weapons.getFirst().stamina_loss);
                        if(!enemies.get(target).isAlive) break;
                        if (player.isAlive && enemies.get(target).isAlive) {
                            player.DamageTaken(enemies.get(target).getAttack());
                            if(!player.isAlive) break;
                        }
                    } else{
                        player.DamageTaken(enemies.get(target).getAttack());
                        enemies.get(target).StaminaLoss(enemies.get(target).inventory.weapons.getFirst().stamina_loss);
                        System.out.println("Враг потерял выносливости:" + enemies.get(target).inventory.weapons.getFirst().stamina_loss);
                        if(!player.isAlive) break;}
                } else{
                    player.DamageTaken(enemies.get(target).getAttack());
                    enemies.get(target).StaminaLoss(enemies.get(target).inventory.weapons.getFirst().stamina_loss);
                    System.out.println("Враг потерял выносливости:" + enemies.get(target).inventory.weapons.getFirst().stamina_loss);
                    if(!player.isAlive) break;}
            }
        }
    }

    public int chooseTarget(){
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
