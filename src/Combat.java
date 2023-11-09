public class Combat {
    public int playerCombatHealth;
    public int enemyCombatHealth;
    public int playerCombatDamage;


    public Combat(int playerCombatHealth, int enemyCombatHealth, int playerCombatDamage){
        this.enemyCombatHealth = enemyCombatHealth;
        this.playerCombatHealth = playerCombatHealth;
        this.playerCombatDamage = playerCombatDamage;
    }


    public int getPlayerCombatHealth() {
        return playerCombatHealth;
    }

    public int getEnemyCombatHealth() {
        return enemyCombatHealth;
    }

    public int getPlayerCombatDamage() {
        return playerCombatDamage;
    }
}

