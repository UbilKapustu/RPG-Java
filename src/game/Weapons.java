package game;

public class Weapons {

    String name;
    int attack_add;
    int mana_loss;
    int stamina_loss;
    String type;

    public Weapons(String name, int attack_add, int mana_loss, int stamina_loss, String type) {
        this.name = name;
        this.attack_add = attack_add;
        this.mana_loss = mana_loss;
        this.stamina_loss = stamina_loss;
        this.type = type;
    }
    public static Weapons startsaber= new Weapons("Старая сабля",15,0,2,"меч");
    public static Weapons startbow= new Weapons("Тренировочный лук",16,0,1,"лук");
    public static Weapons startstaff= new Weapons("Посох прадеда",20,3,0,"жезл");
    public void showWeapon(){
        System.out.print(name + " Тип: "+ type+ " атака: "+ attack_add +" потеря стамины: "+ stamina_loss+" потеря маны: "+ mana_loss );
    }
}
