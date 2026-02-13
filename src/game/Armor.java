package game;

public class Armor {
    String name;
    int defense_add;
    int stamina_loss;
    String type;

    public Armor(String name, int defense_add, int stamina_loss, String type) {
        this.name = name;
        this.defense_add = defense_add;
        this.stamina_loss = stamina_loss;
        this.type = type;
    }
    public static Armor startbatyr= new Armor("Кожанные латты",3,0,"тяжелая броня");
    public static Armor startsaygak= new Armor("Жилетка",2,0,"легкая броня");
    public static Armor startshaman= new Armor("Балахон",1,0,"плащ");
    public void showArmor(){
        System.out.print(name + " Тип: "+ type+ " защита: "+ defense_add +" потеря стамины: "+ stamina_loss);
    }
}
