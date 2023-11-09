import java.util.*;

public class Encounter {
    private RpgChar character;
    private ArrayList<Monster> monsters;
    private ArrayList<Item> items;
    static Random randomDamageAdd1 = new Random();
    public static int randomDamageHej1 = randomDamageAdd1.nextInt(11) - 5;
    private List<Item> inventory;  // No need to initialize here
    private InventoryClass inventoryObject;

    Scanner scanner = new Scanner(System.in);

    // Constructor
    public Encounter(RpgChar character, ArrayList<Monster> monsters, ArrayList<Item> items) {
        this.character = character;
        this.monsters = monsters;
        this.items = items;
        this.inventoryObject = new InventoryClass(character, (ArrayList<Item>) RpgChar.getInventory()); // Initialize inven toryObject here
    }


    // Constructor 2
    public Encounter(RpgChar character) {  // DELETE
        this.character = character;
        this.inventory = RpgChar.getInventory();
    }


    //_______________________________________________________________________________________________________________________________________________________________


    //________________________________________________________________________________________________________________________________________________________________________________________

    // TEXT COLORS
    static String blackColor = "\u001B[30m";
    static String redColor = "\u001B[31m";
    static String greenColor = "\u001B[32m";
    static String yellowColor = "\u001B[33m";
    static String blueColor = "\u001B[34m";
    static String magentaColor = "\u001B[35m";
    static String cyanColor = "\u001B[36m";
    static String whiteColor = "\u001B[37m";
    static String brightBlackColor = "\u001B[90m";
    static String brightRedColor = "\u001B[91m";
    static String brightGreenColor = "\u001B[92m";
    static String brightYellowColor = "\u001B[93m";
    static String brightBlueColor = "\u001B[94m";
    static String brightMagentaColor = "\u001B[95m";
    static String brightCyanColor = "\u001B[96m";
    static String brightWhiteColor = "\u001B[97m";
    static String resetColor = "\u001B[0m";

    // Player Health Color
    public static String getHealthColor(int healthAmount) {
        if (healthAmount <= 0) {
            return brightRedColor;
        } else {
            return greenColor;
        }
    }

    // Monster Health Color
    public static String getMonsterHealthColor(int monsterHealthAmount) {
        if (monsterHealthAmount <= 0) {
            return brightBlackColor;
        } else {
            return redColor;
        }
    }
    // _________________________________________________________________

    // PRINT COMBAT OPTIONS
    public void printCombatOptions() {
        System.out.println("___________________________________");
        System.out.println("'A' to attack - 'M' to use magic");
        System.out.println("'B' to block  - 'I' to open inventory.");
        System.out.println("___________________________________");
    }

    public void printPlayerAllStats() {
        System.out.println("Name:" + character.charName + "  Strength:" + brightBlackColor + character.charStrength + resetColor + "  Level:" + character.charLevel + "  Attack:" + redColor + character.charAttack + resetColor + "  Defense:" + brightBlueColor + character.charDefense + resetColor + "  Health:" + greenColor + character.charHealth + "/" + character.getCharMaxHealth() + resetColor + "  Magic:" + character.charMagic + "  Lifesteal:" + "[" + character.charLifeSteal + "%]" + "  XP:" + blueColor + character.charExperiencePoints + "/" + character.getCharMaxExperiencePoints() + resetColor);
    }

    // _____________________________________________________________________________________________________________________
    public void itemFind() {
        // END COMBAT  / ITEM FIND
        Random random1 = new Random();
        int randomItemIndex = random1.nextInt(items.size());
        Item useless = items.get(randomItemIndex);
        Item droppedItem = items.get(randomItemIndex);
        if (droppedItem != null) {      // if an item dropped
            System.out.println("Item \"" + yellowColor + droppedItem.getItemName() + resetColor + "\" dropped.");
//            character.addItem(droppedItem);  // item is equipped right away, this should not be used once the inventory system is completed
            character.addItemToInventory(droppedItem); // Item is added to inventory instead of being equipped
            printPlayerAllStats();
            System.out.println();
        } else {  // if no item is dropped
            System.out.println("No items dropped.");
            printPlayerAllStats();
            System.out.println();
        }
    }

    // ________________________________________________________________________________________________________________________
    // MONSTER DEFEATED, END COMBAT + ITEM DROP
    public void monsterDefeated(Monster encounteredMonster, int randomMonsterIndex) {
        System.out.println();
        System.out.println("You defeated the " + encounteredMonster.getMonsterName() + "!");
        System.out.println("You gained " + blueColor + encounteredMonster.monsterExperience + resetColor + " XP");
        character.charGainExperience(encounteredMonster);  // XP gained
        System.out.println();
        // ITEM FIND
        itemFind();

    }
    // _________________________________________________________________________________________________________________________
// RANDOM DMG MODIFIERS MONSTERS


    // RANDOM DMG MODIFIER (WARLORDS)
    public int randomDamageModifierWarlord() {
        Random randomDmgModifierWarlord = new Random();
        return randomDmgModifierWarlord.nextInt(11); // makes a random number between 0 and 4
    }

    // RANDOM DMG MODIFIER (NIGHTMARE) + FROST
    public int randomDamageModifierNightmare() {
        Random randomDmgModifierNightmare = new Random();
        return randomDmgModifierNightmare.nextInt(6); // random number between 0 and 5 (careful might heal)
    }

    // RANDOM DMG MODIFIER (NORMAL)
    public int randomDamageModifierNormal() {
        Random randomDamageModifierNormal = new Random();
        return randomDamageModifierNormal.nextInt(3);
    }

    // RANDOM DMG MODIFIER (ACT2BOSS) + ACT 3 BOSS + ELITE
    public int randomDamageModifierAct2Boss() {
        Random randomDamageModifierAct2Boss = new Random();
        return randomDamageModifierAct2Boss.nextInt(90);
    }

    // RANDOM DMG MODIFIER TERROR + HELLISH
    public int randomDamageModifierTerror() {
        Random randomDamageModifierTerror = new Random();
        return randomDamageModifierTerror.nextInt(150);
    }

    // RANDOM DMG MODIFIER FINAL BOSS
    public int randomDamageModifierFinalBoss() {
        Random randomDamageModifierFinalBoss = new Random();
        return randomDamageModifierFinalBoss.nextInt(699);
    }


    //__________________________________________________________

//    MONSTER DAMAGE MODIFIER BASED ON NAME
    public int calculateMonsterDamage(Monster monster, String monsterNameLowerCase) {
        int baseMonsterDamage = monster.getMonsterAttack();

        int randomDamageModifier = 0;
        if (monsterNameLowerCase.contains("warlord")) {
            randomDamageModifier = randomDamageModifierWarlord();
        } else if (monsterNameLowerCase.contains("nightmare")) {
            randomDamageModifier = randomDamageModifierNightmare();
        } else if (monsterNameLowerCase.contains("normal")) {
            randomDamageModifier = randomDamageModifierNormal();
        } else if (monsterNameLowerCase.contains("abaddon")) {
            randomDamageModifier = randomDamageModifierAct2Boss();
        } else if (monsterNameLowerCase.contains("hidden entity")) {
            randomDamageModifier = randomDamageModifierAct2Boss();
        } else if (monsterNameLowerCase.contains("hero")) {
            randomDamageModifier = randomDamageModifierFinalBoss();
        } else if (monsterNameLowerCase.contains("terror")) {
            randomDamageModifier = randomDamageModifierTerror();
        }

        return baseMonsterDamage + randomDamageModifier;
    }

    //_________________________________________________

    // PERFORM ENCOUNTER / SPAWNING MONSTER
    public void performEncounter() {
        // Randomly selects a monster for the encounter
        Random random2 = new Random();
        int randomMonsterIndex = random2.nextInt(monsters.size());
        Monster encounteredMonster = monsters.get(randomMonsterIndex);
//        ____________________________________________________

        int enemyHealth = encounteredMonster.getMonsterMaxHealth();

        System.out.println();
        System.out.println(encounteredMonster.getMonsterName() + getMonsterHealthColor(enemyHealth) + " (" + enemyHealth + ")" + resetColor);
        try {
            Thread.sleep(200);
        } catch (Exception e) {
        }

        // Combat options is shown
        printCombatOptions();


        // COMBAT
        while (character.charHealth > 0 && enemyHealth > 0) {

            String combatOptions = scanner.nextLine().toLowerCase();
            ;
            int playerHealth = character.charHealth;


            switch (combatOptions) {
                case "a":       // PLAYER ATTACKS & DEALS DAMAGE
                    int playerDamage = 1 + (character.getItemAttack() + character.getItemStrength()) * ((character.charLevel + 2) / 4);
                    System.out.println("You attack and deal " + playerDamage + " damage.");
                    System.out.println();
                    enemyHealth -= playerDamage;
                    // updates character's health after each enemy attack
                    //encounteredMonster.setMonsterHealth(enemyHealth);


                    // PLAYER LIFESTEALS
                    if (character.charLifeSteal > 0) {
                        int healthNeededToMax = character.getCharMaxHealth() - character.charHealth;
                        double combatLifeSteal = character.getItemLifeSteal();
                        double lifeStealPercentage = combatLifeSteal;
                        double lifeStealAmount = playerDamage * (lifeStealPercentage / 100);
                        if (lifeStealAmount > healthNeededToMax) {
                            lifeStealAmount = healthNeededToMax;
                        } else {
                            character.charHealth += lifeStealAmount;
                        }
                        System.out.println("You lifesteal: " + greenColor + (int) lifeStealAmount + resetColor + " hp.");
                        playerHealth = playerHealth + (int) lifeStealAmount;
                        if (playerHealth >= character.getCharMaxHealth()) {   // ENSURES PLAYER HEALTH NEVER LIFESTEALS MORE THAN MAXHEALTH
                            character.charHealth = character.getCharMaxHealth();
                        }
                    }

                    System.out.println(encounteredMonster.getMonsterName() + getMonsterHealthColor(enemyHealth) + " (" + enemyHealth + ")" + resetColor);


                    if (enemyHealth <= 0) {  // MONSTER IS DEFEATED, ITEM FIND INSIDE MONSTERDEFEATED METHOD
                        monsterDefeated(encounteredMonster, randomMonsterIndex);

                        break;
                    } else {

                        //_______________________________________________________________________________________

                        // MONSTER DEALS DAMAGE
                        String monsterNameLowerCase = encounteredMonster.getMonsterName().toLowerCase();
                        int enemyDamage = calculateMonsterDamage(encounteredMonster, monsterNameLowerCase) - character.getCharDefense();
                        int enemyDamageRaw = calculateMonsterDamage(encounteredMonster, monsterNameLowerCase); // because enemyDamage can be negative if the player denfense is high



                        if (enemyDamage > 0) {
                            System.out.println("The enemy attacks you and deals " + enemyDamageRaw + " damage.");
                            System.out.println("Your armor blocks " + character.getCharDefense() + " damage.");
                            playerHealth = playerHealth - enemyDamage;
                            character.charHealth = playerHealth;

                            System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);     // the 'if' statement is armor-based
                        } else {  // PLAYER ARMOR IS HIGHER THAN ENEMY'S DAMAGE
                            System.out.println("The enemy can't penetrate your armor, you block all " + enemyDamageRaw + " damage.");
                            System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);
                        }
                    }


                    //_____________________________________________________

                    if (playerHealth <= 0) {   // PLAYER DIES
                        System.out.println();
                        System.out.println("You were defeated. Your ashes will be scattered across the land but your name will be forgotten. Game Over.");
                        System.exit(0);

                    }
                    printCombatOptions();
                    break;

                case "b":        // PLAYER BLOCKS
                    System.out.println("You take a defensive stance and block the enemy's attack.");
                    System.out.println();
                    character.charHealth = playerHealth; // updates character's health after each enemy attack
                    // encounteredMonster.setMonsterHealth(enemyHealth);
                    System.out.println(encounteredMonster.getMonsterName() + getMonsterHealthColor(enemyHealth) + " (" + enemyHealth + ")" + resetColor);

                    if (enemyHealth <= 0) {  // MONSTER IS DEFEATED
                        monsterDefeated(encounteredMonster, randomMonsterIndex);
                        break;

                    } else {  // MONSTER IS BLOCKED
                        System.out.println("You block the enemy's attack!");
                        character.charHealth = playerHealth;
                        System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);
                    }
                    if (playerHealth <= 0) {   // PLAYER DIES
                        System.out.println();
                        System.out.println("You were defeated. Your ashes will be scattered across the land but your name will be forgotten. Game Over.");
                        System.exit(0);
                        break;
                    }
                    printCombatOptions();
                    break;


                //__________________________________________________
                case "m": // PLAYER USES MAGIC TO HEAL
                    int itemMagic = character.getItemMagic(); // Get the amount of healing magic

                    // Calculate the amount needed to reach the character's maximum health
                    int healthNeededToMax = character.getCharMaxHealth() - character.charHealth;

                    // Check if the healing magic amount is greater than what's needed
                    if (itemMagic > healthNeededToMax) {
                        itemMagic = healthNeededToMax;
                    }

                    // Add the healing magic amount to the player's health
                    character.charHealth += itemMagic;

                    System.out.println("You wave your hands, muttering forbidden words - and cast your spell!");
                    System.out.println("Your magic heals you " + greenColor + itemMagic + resetColor + " hp.");
                    playerHealth = character.charHealth; // ???????????

                    if (playerHealth > character.getCharMaxHealth()) {
                        playerHealth = character.getCharMaxHealth(); // Ensure player health doesn't exceed maximum
                    }

                    printCombatOptions();


//
//
//___________________________________________

                    System.out.println(encounteredMonster.getMonsterName() + getMonsterHealthColor(enemyHealth) + " (" + enemyHealth + ")" + resetColor);

                    String monsterNameLowerCase = encounteredMonster.getMonsterName().toLowerCase();
                    int enemyDamageM = calculateMonsterDamage(encounteredMonster, monsterNameLowerCase) - character.getCharDefense();
                    int enemyDamageRawM = calculateMonsterDamage(encounteredMonster, monsterNameLowerCase); // because enemyDamage can be negative if the player denfense is high

                    if (enemyHealth <= 0) {  // MONSTER IS DEFEATED
                        monsterDefeated(encounteredMonster, randomMonsterIndex);
                        break;

                    } else {  // MONSTER ATTACKS (when magic is used)
                        if (enemyDamageM > 0) {
                            System.out.println("The enemy attacks you and deals " + enemyDamageRawM + " damage.");
                            System.out.println("Your armor blocks " + character.getCharDefense() + " damage.");
                            playerHealth = playerHealth - enemyDamageM;
                            character.charHealth = playerHealth;
                            System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);
                        } else {
                            System.out.println("Your armor is a fortress, it blocks all " + enemyDamageRawM + " damage!");
                            System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);
                        }

                    }

                    if (playerHealth <= 0) {   // PLAYER DIES
                        System.out.println();
                        System.out.println("You were defeated. Your ashes will be scattered across the land but your name will be forgotten. Game Over.");
                        System.exit(0);
                        break;
                    }
                    printCombatOptions();
                    break;

                case "i":        // PLAYER OPENS INVENTORY
                    inventoryObject.InventoryOverall();
//                System.out.println(encounteredMonster.getMonsterName() + getMonsterHealthColor(enemyHealth) + " (" + enemyHealth + ")" + resetColor);
                    System.out.println(encounteredMonster.getMonsterName() + getMonsterHealthColor(enemyHealth) + " (" + enemyHealth + ")" + resetColor);
                    System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);
                    printCombatOptions();
                    break;

                default:
                    break;
            }
        }
    }
}






