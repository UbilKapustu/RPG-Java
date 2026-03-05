package game;

public abstract class Character {
    protected String namep;
    protected String charClass;
    protected int max_health;
    protected int health;
    protected int attack;
    protected int defense;
    protected int max_mana;
    protected int mana;
    protected int max_stamina;
    protected int stamina;
     Inventory inventory;
     boolean isAlive=true;
    public Character(){}
//    public Weapons eqpdWeapons;
//    public Armor eqpdArmor;
//
//    public void eqpItem(){
//        Scanner cs= new Scanner(System.in);
//        if(!inventory.weapons.isEmpty()){
//            System.out.println("Выберите оружие");
//                for(int i=0;i<inventory.weapons.size();i++){
//
//                }
//
//        }
//
//    }

    public void Heal(int HP){
        if (!isAlive) return;

        health += HP;

        if (health > max_health) {
            health = max_health;
            System.out.println("Вы восстановили HP до максимума.");
        } else {
            System.out.println("Вы восстановили " + HP + " HP.");
        }
    }
    public void ManaRegen(int MP){
        if (!isAlive) return;

        mana += MP;

        if (mana > max_mana) {
            mana = max_mana;
            System.out.println("Вы восстановили MP до максимума.");
        } else {
            System.out.println("Вы восстановили " + MP + " MP.");
        }
    }
    public void StaminaRegen(int ST){
        if (!isAlive) return;

        stamina += ST;

        if (stamina > max_stamina) {
            stamina = max_stamina;
            System.out.println("Вы восстановили ST до максимума.");
        } else {
            System.out.println("Вы восстановили " + ST + " ST.");
        }
    }
    public void DamageTaken(int damage) {
        if (!isAlive) return;

        damage-=defense;

        if(damage>0)
            health -= damage;
        else damage=0;

        if(health>0){
            System.out.println("Вы получили "+ damage +"урона. Ваше здоровье:"+health+"/"+max_health+"HP.");
        }
        else{
            Die();
        }
    }
    public void StaminaLoss(int stamina){
        this.stamina-=stamina;
        if(this.stamina<0) this.stamina=0;
    }
    public void Die(){
        isAlive=false;
        System.out.println(namep + "умер урон оказался фатальным!");

    }
    public void setStats(int max_health, int attack, int defense, int max_mana, int max_stamina) {
        this.max_health = max_health;
        this.health = max_health;
        this.attack = attack;
        this.defense = defense;
        this.max_mana = max_mana;
        this.mana = max_mana;
        this.max_stamina = max_stamina;
        this.stamina = max_stamina;
    }
    public void getStatus(){
        System.out.println("Ваш Персонаж: " );
        System.out.println("Имя: "+ namep);
        System.out.println("Класс: "+ charClass);
        System.out.println("Здоровье: "+ max_health);
        System.out.println("Защита: "+ defense);
        System.out.println("Выносливость: "+ max_stamina);
        System.out.println("Мана: "+max_mana);
        System.out.println("\nИнвентарь");
    }

    public int getHealth() {
        return health;
    }

    public int getStamina() {
        return stamina;
    }

    public int getMana() {
        return mana;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }
}
