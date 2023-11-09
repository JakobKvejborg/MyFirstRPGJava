//import java.util.*;
//
//public class Encounter {
//    private RpgChar character;
//    private ArrayList<Monster> monsters;
//    private ArrayList<Item> items;
//    static Random randomDamageAdd1 = new Random();
//    public static int randomDamageHej1 = randomDamageAdd1.nextInt(11) - 5; // den vælger et tal mellem 0 og 5
//
//
//    Scanner scanner = new Scanner(System.in);
//
//    // Constructor
//    public Encounter(RpgChar character, ArrayList<Monster> monsters, ArrayList<Item> items) {
//        this.character = character;
//        this.monsters = monsters;
//        this.items = items;
//    }
//
//    //_______________________________________________________________________________________________________________________________________________________________
//
//    // RANDOM DMG MODIFIERS MONSTERS
//
//
//    // RANDOM DMG MODIFIER (WARLORDS)
//    public int randomDamageModifierWarlord() {
//        Random randomDmgModifierWarlord = new Random();
//        return randomDmgModifierWarlord.nextInt(11); // makes a random number between 0 and 4
//    }
//
//    // RANDOM DMG MODIFIER (NIGHTMARE) + FROST
//    public int randomDamageModifierNightmare() {
//        Random randomDmgModifierNightmare = new Random();
//        return randomDmgModifierNightmare.nextInt(6) - 3; // random number between -3 and 5 (careful might heal)
//    }
//
//    // RANDOM DMG MODIFIER (NORMAL)
//    public int randomDamageModifierNormal() {
//        Random randomDamageModifierNormal = new Random();
//        return randomDamageModifierNormal.nextInt(3);
//    }
//
//    // RANDOM DMG MODIFIER (ACT2BOSS) + ACT 3 BOSS
//    public int randomDamageModifierAct2Boss() {
//        Random randomDamageModifierAct2Boss = new Random();
//        return randomDamageModifierAct2Boss.nextInt(80) - 40;
//    }
//
//    // RANDOM DMG MODIFIER FINAL BOSS
//    public int randomDamageModifierFinalBoss() {
//        Random randomDamageModifierFinalBoss = new Random();
//        return randomDamageModifierFinalBoss.nextInt(666) - 111;
//    }
//
//
//
//    //__________________________________________________________
//
//
//    // INVENTORY SYSTEM
////_______________________________________________________________________________________________________________________________________________________________________________________
//    // OPEN INVENTORY
//    public void openCharInventory() {
//        List<Item> inventory = character.getInventory();
//
//        if (inventory.isEmpty()) {
//            System.out.println("You have no items here.");
//        } else {
//            for (Item item : inventory) {
//
//                System.out.print(item.getItemName() + " ");
//
//                if (item.getItemLevelRequirement() > character.getCharLevel()) {
//                    System.out.print("lvlReq:" + item.getItemLevelRequirement() + " ");
//                }
//
//                if (item.getItemAttack() > 0) {
//                    System.out.print(redColor + "[" + item.getItemAttack() + "] " + resetColor);
//                }
//
//                if (item.getItemStrength() > 0) {
//                    System.out.print(brightBlackColor + "[" + item.getItemStrength() + "] " + resetColor);
//                }
//
//                if (item.getItemDefense() > 0) {
//                    System.out.print(brightBlueColor + "[" + item.getItemDefense() + "] " + resetColor);
//                }
//
//                if (item.getItemMaxHealth() > 0) {
//                    System.out.print(greenColor + "[" + item.getItemMaxHealth() + "] " + resetColor);
//                }
//
//                if (item.getItemLifeSteal() > 0) {
//                    System.out.print("[" + item.getItemLifeSteal() + "%] ");
//                }
//                System.out.println();
//            }
//        }
//    }
//    //________________________________________________________________________________________
//
//    // SHOW WHAT ITEMS THE PLAYER HAS EQUIPPED
//    public void openCharEquippedInventory() {
//        List<Item> equipInventory = character.getCharEquippedItems();
//
//        if (equipInventory.isEmpty()) {
//            System.out.println("You don't have any items equipped.");
//
//        } else {
//            System.out.println(brightCyanColor + "Equipped:" + resetColor);
//            for (Item item : equipInventory) {
//
//                System.out.print(item.getItemName() + " ");
//
//                if (item.getItemLevelRequirement() > character.getCharLevel()) {
//                    System.out.print("lvlRequirement: " + "[" + item.getItemLevelRequirement() + "] ");
//                }
//
//                if (item.getItemAttack() > 0) {
//                    System.out.print(redColor + "[" + item.getItemAttack() + "] " + resetColor);
//                }
//
//                if (item.getItemStrength() > 0) {
//                    System.out.print(brightBlackColor + "[" + item.getItemStrength() + "] " + resetColor);
//                }
//
//                if (item.getItemDefense() > 0) {
//                    System.out.print(brightBlueColor + "[" + item.getItemDefense() + "] " + resetColor);
//                }
//
//                if (item.getItemMaxHealth() > 0) {
//                    System.out.print(greenColor + "[" + item.getItemMaxHealth() + "] " + resetColor);
//                }
//
//                if (item.getItemLifeSteal() > 0) {
//                    System.out.print("[" + item.getItemLifeSteal() + "%] ");
//                }
//                System.out.println();
//            }
//        }
//        System.out.println();
//    }
//
////________________________________________________________________________________________
//
//    // Remove item from inventory
//    public void removeItemFromInventory() {
//        if (character.getInventory().isEmpty()) {
//            System.out.println("You don't have any items in your inventory.");
//            System.out.println();
//        } else {
//            System.out.println("Enter the name of the item to remove:");
//            String itemNameToRemove = scanner.nextLine(); // Read the name of the item to remove
//
//            // Find the Item object with the matching name in the player's inventory
//            Item itemToRemove = null;
//            for (Item item : character.getInventory()) {
//                if (item.getItemName().equalsIgnoreCase(itemNameToRemove)) {
//                    itemToRemove = item;
//                    break; // notice these breaks are because the method is called inside a switch
//                }
//            }
//            // Check if the item was found in the player's inventory
//            if (itemToRemove != null) {
//                // Remove the item from the player's inventory
//                character.getInventory().remove(itemToRemove);
////                                items.remove(itemToRemove); removes the item from the item list maybe?
//                System.out.println("You threw the item '" + itemNameToRemove + "' away.");
//                System.out.println();
//            } else {
//                System.out.println("Item not found in your inventory.");
//                System.out.println();
//            }
//        }
//    }
//
//    // ___________________________________________________________________________________________
//
//    // REMOVE ALL ITEMS FROM INVENTORY
//    public void thrashAllItemsInventory() {
//        List<Item> inventory = character.getInventory();
//
//        if (character.getInventory().isEmpty()) {
//            System.out.println("You don't have any items in your inventory.");
//            System.out.println();
//        } else {
//            inventory.clear();
//            System.out.println("You throw away all the items in your inventory.");
//            System.out.println();
//        }
//    }
//
//
//    //_____________________________________________________________________________________________
//
//    // Equip item from inventory to the character with item types
//    public void equipItemToCharFromInventory() {
//        System.out.println("Enter the name of the item to equip:");
//        String itemNameToEquip = scanner.nextLine(); // Read the name of the item to equip
//
//// Find the Item object with the matching name in the player's inventory
//        Item itemToEquip = null;
//        Item itemToUnequip = null;
//
//        for (Item item : character.getInventory()) {
//            if (item.getItemName().equalsIgnoreCase(itemNameToEquip)) {
//                itemToEquip = item;
//                break;
//            }
//        }
//
//        if (itemToEquip != null && character.getCharLevel() >= itemToEquip.getItemLevelRequirement()) {
//            String itemType = itemToEquip.getItemType().toLowerCase();
//
//
//            // Getting info itemType on the already equipped item
//            for (Item equippedItem : character.getCharEquippedItems()) {
//                if (equippedItem.getItemType().equalsIgnoreCase(itemType)) {
//                    itemToUnequip = equippedItem;
//                    break;
//                }
//            }
//
//            switch (itemType) {
//                case "boots":
//                case "leggings":
//                case "belt":
//                case "armor":
//                case "amulet":
//                case "helm":
//                case "shoulders":
//                case "bracers":
//                case "gloves":
//                case "ring1":
//                case "ring2":
//                case "weaponl1":
//                case "weaponr1":
//                    if (itemToUnequip != null) {
//                        // Unequip the existing boots and add them back to the inventory
//                        character.removeItemFromCharEquipped(itemToUnequip);
//                        character.addItemToInventory(itemToUnequip);
//                        System.out.println("Itemtype duplicate, '" + itemToUnequip.getItemName() + "' unequipped.");
//                    }
//
//
//                    character.getInventory().remove(itemToEquip);
//                    unequipItemAndAddToInventory(itemType);
//                    character.addItem(itemToEquip);
//                    character.addItemToCharEquipped(itemToEquip);
//                    System.out.println("Item '" + itemNameToEquip + "' equipped.");
//                    System.out.println();
//                    break;
//            }
//
//        } else {
//            System.out.println("Item not found in your inventory or you don't meet the level requirement.");
//            System.out.println();
//        }
//
//    }
//
//    // _______________________________________
//    public void unequipItemFromCharManually() {
//        if (character.getCharEquippedItems().isEmpty()) {
//            System.out.println("You don't have any items to unequip.");
//            System.out.println();
//        } else {
//            System.out.println("Enter the name of the item to unequip:");
//            String itemNameToUnequip = scanner.nextLine(); // read the name of the item to unequip
//
//            Item itemToUnequip = null;
//            for (Item item : character.getCharEquippedItems()) {
//                if (item.getItemName().equalsIgnoreCase(itemNameToUnequip)) {
//                    itemToUnequip = item;
//                    break;
//                }
//            }
//
//            if (itemToUnequip != null) {
//                // Unequip the item and add it back to the inventory
//                character.removeItemFromCharEquipped(itemToUnequip);
//                character.addItemToInventory(itemToUnequip);
//                System.out.println("Item '" + itemNameToUnequip + "' unequipped.");
//                System.out.println();
//            } else {
//                System.out.println("You don't have that item equipped.");
//                System.out.println();
//            }
//        }
//    }
//
//
//    //______________________________________________________________
//
//    // UNEQUIP ITEM ^ USED WHEN EQUIPPING ITEM
//
//    public void unequipItemAndAddToInventory(String itemType) {
//        if (character.getCharEquippedItems().isEmpty()) {
//        } else {
//            Item itemToUnequip = null;
//            for (Item item : character.getCharEquippedItems()) {
//            }
//        }
//
//    }
//
//    //________________________________________________________________________________________________________________________________________________________________________________________
//
//    // TEXT COLORS
//    String blackColor = "\u001B[30m";
//    static String redColor = "\u001B[31m";
//    static String greenColor = "\u001B[32m";
//    String yellowColor = "\u001B[33m";
//    String blueColor = "\u001B[34m";
//    static String magentaColor = "\u001B[35m";
//    String cyanColor = "\u001B[36m";
//    static String whiteColor = "\u001B[37m";
//    static String brightBlackColor = "\u001B[90m";
//    static String brightRedColor = "\u001B[91m";
//    String brightGreenColor = "\u001B[92m";
//    String brightYellowColor = "\u001B[93m";
//    static String brightBlueColor = "\u001B[94m";
//    static String brightMagentaColor = "\u001B[95m";
//    static String brightCyanColor = "\u001B[96m";
//    String brightWhiteColor = "\u001B[97m";
//    String resetColor = "\u001B[0m";
//
//    // Player Health Color
//    public static String getHealthColor(int healthAmount) {
//        if (healthAmount <= 0) {
//            return brightRedColor;
//        } else {
//            return greenColor;
//        }
//    }
//
//    // Monster Health Color
//    public static String getMonsterHealthColor(int monsterHealthAmount) {
//        if (monsterHealthAmount <= 0) {
//            return brightBlackColor;
//        } else {
//            return redColor;
//        }
//    }
//    // _________________________________________________________________
//
//    // PRINT COMBAT OPTIONS
//    public void printCombatOptions() {
//        System.out.println("___________________________________");
//        System.out.println("'A' to attack - 'M' to use magic");
//        System.out.println("'B' to block  - 'I' to open inventory.");
//        System.out.println("___________________________________");
//    }
//
//    public void printPlayerAllStats() {
//        System.out.println("Name:" + character.charName + "  Strength:" + brightBlackColor + character.charStrength + resetColor + "  Level:" + character.charLevel + "  Attack:" + redColor + character.charAttack + resetColor + "  Defense:" + brightBlueColor + character.charDefense + resetColor + "  Health:" + greenColor + character.charHealth + "/" + character.getCharMaxHealth() + resetColor + "  Magic:" + character.charMagic + "  Lifesteal:" + "[" + character.charLifeSteal + "%]" + "  XP:" + blueColor + character.charExperiencePoints + "/" + character.getCharMaxExperiencePoints() + resetColor);
//    }
//
//    // _____________________________________________________________________________________________________________________
//    public void itemFind() {
//        // END COMBAT  / ITEM FIND
//        Random random1 = new Random();
//        int randomItemIndex = random1.nextInt(items.size());
//        Item useless = items.get(randomItemIndex);
//        Item droppedItem = items.get(randomItemIndex);
//        if (droppedItem != null) {      // if an item dropped
//            System.out.println("Item \"" + yellowColor + droppedItem.getItemName() + resetColor + "\" dropped.");
////            character.addItem(droppedItem);  // item is equipped right away, this should not be used once the inventory system is completed
//            character.addItemToInventory(droppedItem); // Item is added to inventory instead of being equipped
//            printPlayerAllStats();
//            System.out.println();
//        } else {  // if no item is dropped
//            System.out.println("No items dropped.");
//            printPlayerAllStats();
//            System.out.println();
//        }
//    }
//
//    // ________________________________________________________________________________________________________________________
//    // MONSTER DEFEATED, END COMBAT + ITEM DROP
//    public void monsterDefeated(Monster encounteredMonster, int randomMonsterIndex) {
//        System.out.println();
//        System.out.println("You defeated the " + encounteredMonster.getMonsterName() + "!");
//        System.out.println("You gained " + blueColor + encounteredMonster.monsterExperience + resetColor + " XP");
//        character.charGainExperience(encounteredMonster);  // XP gained
//        System.out.println();
//        // ITEM FIND
//        itemFind();
//
//    }
//
//    // _________________________________________________________________________________________________________________________
//
//    //_________________________________________________
//
//    // PERFORM ENCOUNTER / SPAWNING MONSTER
//    public void performEncounter() {  // Randomly selects a monster for the encounter
//        Random random2 = new Random();
//        int randomMonsterIndex = random2.nextInt(monsters.size());
//        Monster encounteredMonster = monsters.get(randomMonsterIndex);
////        ____________________________________________________
//
//        int enemyHealth = encounteredMonster.getMonsterMaxHealth();
//
//        System.out.println();
//        System.out.println(encounteredMonster.getMonsterName() + getMonsterHealthColor(enemyHealth) + " (" + enemyHealth + ")" + resetColor);
//        try {
//            Thread.sleep(300);
//        } catch (Exception e) {
//        }
//
//        // Combat options is shown
//        printCombatOptions();
//
//
//        // COMBAT
//        while (character.charHealth > 0 && enemyHealth > 0) {
//
//            String combatOptions = scanner.nextLine();
//            int playerHealth = character.charHealth;
//            int enemyDamage = encounteredMonster.getMonsterAttack() - character.getCharDefense();
//
//
//            switch (combatOptions) {
//                case "a":       // PLAYER ATTACKS & DEALS DAMAGE
//                    int playerDamage = 1 + (character.getItemAttack() + character.getItemStrength()) * (character.charLevel / 2);
//                    System.out.println("You attack and deal " + playerDamage + " damage.");
//                    System.out.println();
//                    enemyHealth -= playerDamage;
//                    // updates character's health after each enemy attack
//                    //encounteredMonster.setMonsterHealth(enemyHealth);
//
//
//                    // PLAYER LIFESTEALS
//                    if (character.charLifeSteal > 0) {
//
//                        double combatLifeSteal = character.getItemLifeSteal();
//                        double lifeStealPercentage = combatLifeSteal;
//                        double lifeStealAmount = playerDamage * (lifeStealPercentage / 100);
//                        character.charHealth += lifeStealAmount;
//                        System.out.println("You lifesteal: " + greenColor + (int) lifeStealAmount + resetColor + " hp.");
//                        playerHealth = playerHealth + (int) lifeStealAmount;
//                        if (playerHealth >= character.getCharMaxHealth()) {   // ENSURES PLAYER HEALTH NEVER LIFESTEALS MORE THAN MAXHEALTH
//                            character.charHealth = character.getCharMaxHealth();
//                        }
//                    }
//
//                    System.out.println(encounteredMonster.getMonsterName() + getMonsterHealthColor(enemyHealth) + " (" + enemyHealth + ")" + resetColor);
//
//
//                    if (enemyHealth <= 0) {  // MONSTER IS DEFEATED, ITEM FIND INSIDE MONSTERDEFEATED METHOD
//                        monsterDefeated(encounteredMonster, randomMonsterIndex);
//
//                        break;
//                    } else {
//
//                        //_______________________________________________________________________________________
//
//                        // MONSTER DEALS DAMAGE
//                        String monsterNameLowerCase = encounteredMonster.getMonsterName().toLowerCase();
//
//                        if (monsterNameLowerCase.contains("warlord")) {
//                            if (enemyDamage > 0) {
//                                System.out.println("The enemy attacks you and deals " + (encounteredMonster.getMonsterAttack() + randomDamageModifierWarlord()) + " damage.");
//                                System.out.println("Your armor blocks " + character.getCharDefense() + " damage.");
//                                playerHealth = playerHealth - (enemyDamage + randomDamageModifierWarlord());
//                                character.charHealth = playerHealth;
//                                System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);     // the 'if' statement is armor-based
//                            } else {  // PLAYER ARMOR IS HIGHER THAN ENEMY'S DAMAGE
//                                System.out.println("The enemy can't penetrate your armor, you block all " + (encounteredMonster.getMonsterAttack() + randomDamageModifierWarlord()) + " damage.");
//                                System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);
//                            }
//                        } else {
//                            if (monsterNameLowerCase.contains("weak")) {
//                                if (enemyDamage > 0) {
//                                    System.out.println("The enemy attacks you and deals " + encounteredMonster.getMonsterAttack() + " damage.");
//                                    System.out.println("Your armor blocks " + character.getCharDefense() + " damage.");
//                                    playerHealth = playerHealth - enemyDamage;
//                                    character.charHealth = playerHealth;
//                                    System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);     // the 'if' statement is armor-based
//                                } else {  // PLAYER ARMOR IS HIGHER THAN ENEMY'S DAMAGE
//                                    System.out.println("The enemy can't penetrate your armor, you block all " + encounteredMonster.getMonsterAttack() + " damage.");
//                                    System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);
//                                }
//                            } else {
//                                if (monsterNameLowerCase.contains("common")) {
//                                    if (enemyDamage > 0) {
//                                        System.out.println("The enemy attacks you and deals " + encounteredMonster.getMonsterAttack() + " damage.");
//                                        System.out.println("Your armor blocks " + character.getCharDefense() + " damage.");
//                                        playerHealth = playerHealth - enemyDamage;
//                                        character.charHealth = playerHealth;
//                                        System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);     // the 'if' statement is armor-based
//                                    } else {  // PLAYER ARMOR IS HIGHER THAN ENEMY'S DAMAGE
//                                        System.out.println("The enemy can't penetrate your armor, you block all " + encounteredMonster.getMonsterAttack() + " damage.");
//                                        System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);
//                                    }
//                                } else {
//                                    if (monsterNameLowerCase.contains("nightmare")) {
//                                        if (enemyDamage > 0) {
//                                            System.out.println("The enemy attacks you and deals " + (encounteredMonster.getMonsterAttack() + randomDamageModifierNightmare()) + " damage.");
//                                            System.out.println("Your armor blocks " + character.getCharDefense() + " damage.");
//                                            playerHealth = playerHealth - (enemyDamage + randomDamageModifierNightmare());
//                                            character.charHealth = playerHealth;
//                                            System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);     // the 'if' statement is armor-based
//                                        } else {  // PLAYER ARMOR IS HIGHER THAN ENEMY'S DAMAGE
//                                            System.out.println("The enemy can't penetrate your armor, you block all " + (encounteredMonster.getMonsterAttack() + randomDamageModifierNightmare()) + " damage.");
//                                            System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);
//                                        }
//                                    } else {
//                                        if (monsterNameLowerCase.contains("normal")) {
//                                            if (enemyDamage > 0) {
//                                                System.out.println("The enemy attacks you and deals " + (encounteredMonster.getMonsterAttack() + randomDamageModifierNormal()) + " damage.");
//                                                System.out.println("Your armor blocks " + character.getCharDefense() + " damage.");
//                                                playerHealth = playerHealth - (enemyDamage + randomDamageModifierNormal());
//                                                character.charHealth = playerHealth;
//                                                System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);     // the 'if' statement is armor-based
//                                            } else {  // PLAYER ARMOR IS HIGHER THAN ENEMY'S DAMAGE
//                                                System.out.println("The enemy can't penetrate your armor, you block all " + (encounteredMonster.getMonsterAttack() + randomDamageModifierNormal()) + " damage.");
//                                                System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);
//                                            }
//                                        } else {
//                                            if (monsterNameLowerCase.contains("abaddon")) {
//                                                if (enemyDamage > 0) {
//                                                    System.out.println("The enemy attacks you and deals " + (encounteredMonster.getMonsterAttack() + randomDamageModifierAct2Boss()) + " damage.");
//                                                    System.out.println("Your armor blocks " + character.getCharDefense() + " damage.");
//                                                    playerHealth = playerHealth - (enemyDamage + randomDamageModifierAct2Boss());
//                                                    character.charHealth = playerHealth;
//                                                    System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);     // the 'if' statement is armor-based
//                                                } else {  // PLAYER ARMOR IS HIGHER THAN ENEMY'S DAMAGE
//                                                    System.out.println("The enemy can't penetrate your armor, you block all " + (encounteredMonster.getMonsterAttack() + randomDamageModifierAct2Boss()) + " damage.");
//                                                    System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);
//                                                }
//                                            } else {
//                                                if (monsterNameLowerCase.contains("hidden entity")) {
//                                                    if (enemyDamage > 0) {
//                                                        System.out.println("The enemy attacks you and deals " + (encounteredMonster.getMonsterAttack() + randomDamageModifierAct2Boss()) + " damage.");
//                                                        System.out.println("Your armor blocks " + character.getCharDefense() + " damage.");
//                                                        playerHealth = playerHealth - (enemyDamage + randomDamageModifierAct2Boss());
//                                                        character.charHealth = playerHealth;
//                                                        System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);     // the 'if' statement is armor-based
//                                                    } else {  // PLAYER ARMOR IS HIGHER THAN ENEMY'S DAMAGE
//                                                        System.out.println("The enemy can't penetrate your armor, you block all " + (encounteredMonster.getMonsterAttack() + randomDamageModifierAct2Boss()) + " damage.");
//                                                        System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);
//                                                    }
//                                                } else {
//                                                    if (monsterNameLowerCase.contains("frost")) {
//                                                        if (enemyDamage > 0) {
//                                                            System.out.println("The enemy attacks you and deals " + (encounteredMonster.getMonsterAttack() + randomDamageModifierNightmare()) + " damage.");
//                                                            System.out.println("Your armor blocks " + character.getCharDefense() + " damage.");
//                                                            playerHealth = playerHealth - (enemyDamage + randomDamageModifierNightmare());
//                                                            character.charHealth = playerHealth;
//                                                            System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);     // the 'if' statement is armor-based
//                                                        } else {  // PLAYER ARMOR IS HIGHER THAN ENEMY'S DAMAGE
//                                                            System.out.println("The enemy can't penetrate your armor, you block all " + (encounteredMonster.getMonsterAttack() + randomDamageModifierNightmare()) + " damage.");
//                                                            System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);
//                                                        }
//                                                    } else {
//                                                        if (monsterNameLowerCase.contains("elite")) {
//                                                            if (enemyDamage > 0) {
//                                                                System.out.println("The enemy attacks you and deals " + (encounteredMonster.getMonsterAttack() + randomDamageModifierAct2Boss()) + " damage.");
//                                                                System.out.println("Your armor blocks " + character.getCharDefense() + " damage.");
//                                                                playerHealth = playerHealth - (enemyDamage + randomDamageModifierAct2Boss());
//                                                                character.charHealth = playerHealth;
//                                                                System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);     // the 'if' statement is armor-based
//                                                            } else {  // PLAYER ARMOR IS HIGHER THAN ENEMY'S DAMAGE
//                                                                System.out.println("The enemy can't penetrate your armor, you block all " + (encounteredMonster.getMonsterAttack() + randomDamageModifierAct2Boss()) + " damage.");
//                                                                System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);
//                                                            }
//                                                        } else {
//                                                            if (monsterNameLowerCase.contains("hero")) {
//                                                                if (enemyDamage > 0) {
//                                                                    System.out.println("The enemy attacks you and deals " + (encounteredMonster.getMonsterAttack() + randomDamageModifierFinalBoss()) + " damage.");
//                                                                    System.out.println("Your armor blocks " + character.getCharDefense() + " damage.");
//                                                                    playerHealth = playerHealth - (enemyDamage + randomDamageModifierFinalBoss());
//                                                                    character.charHealth = playerHealth;
//                                                                    System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);     // the 'if' statement is armor-based
//                                                                } else {  // PLAYER ARMOR IS HIGHER THAN ENEMY'S DAMAGE
//                                                                    System.out.println("The enemy can't penetrate your armor, you block all " + (encounteredMonster.getMonsterAttack() + randomDamageModifierFinalBoss()) + " damage.");
//                                                                    System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);
//                                                                }
//                                                            }
//                                                        }
//                                                    }
//                                                }
//                                            }
//                                        }
//                                    }
//                                }
//                            }
//                        }
//                    }
//
//                    //_____________________________________________________
//
//                    if (playerHealth <= 0) {   // PLAYER DIES
//                        System.out.println();
//                        System.out.println("You were defeated. Your ashes will be scattered across the land but your name will be forgotten. Game Over.");
//                        System.exit(0);
//
//                    }
//                    printCombatOptions();
//                    break;
//
//                case "b":        // PLAYER BLOCKS
//                    System.out.println("You take a defensive stance and block the enemy's attack.");
//                    System.out.println();
//                    character.charHealth = playerHealth; // updates character's health after each enemy attack
//                    // encounteredMonster.setMonsterHealth(enemyHealth);
//                    System.out.println(encounteredMonster.getMonsterName() + getMonsterHealthColor(enemyHealth) + " (" + enemyHealth + ")" + resetColor);
//
//                    if (enemyHealth <= 0) {  // MONSTER IS DEFEATED
//                        monsterDefeated(encounteredMonster, randomMonsterIndex);
//                        break;
//
//                    } else {  // MONSTER IS BLOCKED
//                        System.out.println("You block the enemy's attack!");
//                        character.charHealth = playerHealth;
//                        System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);
//                    }
//                    if (playerHealth <= 0) {   // PLAYER DIES
//                        System.out.println();
//                        System.out.println("You were defeated. Your ashes will be scattered across the land but your name will be forgotten. Game Over.");
//                        System.exit(0);
//                        break;
//                    }
//                    printCombatOptions();
//                    break;
//
//                case "m":        // PLAYER USES MAGIC
//                    System.out.println("You wave your hands - muttering forbidden words - and cast your magic spell!");
//                    playerHealth = playerHealth + character.charMagic;
//                    System.out.println("You heal yourself " + greenColor + character.charMagic + resetColor + " hp.");
//                    System.out.println();
//                    character.charHealth = playerHealth; // updates character's health after healing
//                    if (playerHealth >= character.getCharMaxHealth()) {   // ENSURES PLAYER HEALTH NEVER HEALS MORE THAN MAXHEALTH
//                        character.charHealth = character.getCharMaxHealth();
//                    }
//                    System.out.println(encounteredMonster.getMonsterName() + getMonsterHealthColor(enemyHealth) + " (" + enemyHealth + ")" + resetColor);
//
//                    if (enemyHealth <= 0) {  // MONSTER IS DEFEATED
//                        monsterDefeated(encounteredMonster, randomMonsterIndex);
//                        break;
//
//                    } else {  // MONSTER ATTACKS (only basedmg of the monster here)
//                        if (enemyDamage > 0) {
//                            System.out.println("The enemy attacks you and deals " + encounteredMonster.getMonsterAttack() + " damage.");
//                            System.out.println("Your armor blocks " + character.getCharDefense() + " damage.");
//                            playerHealth = playerHealth - enemyDamage;
//                            character.charHealth = playerHealth;
//                            System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);
//                        } else {
//                            System.out.println("Your armor is a fortress, it blocks all " + encounteredMonster.getMonsterAttack() + " damage!");
//                            System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);
//                        }
//
//                    }
//
//                    if (playerHealth <= 0) {   // PLAYER DIES
//                        System.out.println();
//                        System.out.println("You were defeated. Your ashes will be scattered across the land but your name will be forgotten. Game Over.");
//                        System.exit(0);
//                        break;
//                    }
//                    printCombatOptions();
//                    break;
//
//
//                case "i":        // PLAYER OPENS INVENTORY
//                    System.out.println(magentaColor + "Inventory:" + resetColor);
//                    openCharInventory();
//                    openCharEquippedInventory();
//                    System.out.println("Press 'E' to equip items, 'U' to unequip items, 'R' to throw away items, 'T' to thrash entire inventory, or 'ENTER' to continue.");
//                    String interactInventory = scanner.nextLine(); // Read player's interaction choice
//
//                    switch (interactInventory) {
//                        case "r": // REMOVES THE ITEM FROM THE INVENTORY
//                            removeItemFromInventory(); // Method called
//                            break;
//                        case "e": // EQUIP ITEMS FROM INVENTORY TO CHAR
//                            equipItemToCharFromInventory();
//                            break;
////                        case "s": // SHOW EQUIPPED ITEMS
////                            openCharEquippedInventory();
////                            break;
//                        case "u":
//                            unequipItemFromCharManually();
//                            break;
//                        case "t":
//                            thrashAllItemsInventory();
//                            break;
//                    }
////                    // PRESS ENTER TO CONTINUE working
////                    String x = scanner.nextLine();
////                    switch (x) {
////                        case "x":
////                            break;
////                        default:
////                            System.out.println();
////                            break;
////                    }
//                    System.out.println(encounteredMonster.getMonsterName() + getMonsterHealthColor(enemyHealth) + " (" + enemyHealth + ")" + resetColor);
//                    System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);
//                    printCombatOptions();
//                    break;
//
//                default:
//                    break;
//            }
//        }
//    }
//
//}
//
//
//
//
