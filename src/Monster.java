import java.util.Random;

public class Monster {
    public int monsterHealth;
    public int monsterAttack;
    public String monsterName;
    public int monsterExperience;
    private int monsterDamageModifier;


    // MONSTER CONSTRUCTOR
    public Monster(int monsterHealth, int monsterAttack, String monsterName, int monsterExperience) {
        this.monsterHealth = monsterHealth;
        this.monsterAttack = monsterAttack;
        this.monsterName = monsterName;
        this.monsterExperience = monsterExperience;
    }



    // MONSTER GETTERS
    public int getMonsterMaxHealth() {
        return monsterHealth;
    }

    public int getMonsterAttack() {
        return monsterAttack;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public int getMonsterExperience() {
        return monsterExperience;
    }

    public void setMonsterHealth(int monsterHealth) {
        this.monsterHealth = monsterHealth;
    }
}
