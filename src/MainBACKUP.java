//import java.util.*;
//import java.util.ArrayList;
//import java.awt.Color;
//import java.awt.Font;
//import javax.swing.BorderFactory;
//import javax.swing.ImageIcon;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.border.Border;
//import javax.sound.sampled.*;
//import java.io.File;
//import java.io.IOException;
//
//
//public class Main {
//    public static void main(String[] args) {
//
////_____________________________________________________________________________________________________________________________________________________________
//
//        // MONSTER LISTS
//
//        // RANDOM MONSTER LIST (WEAK)     // weak - common  - Warlords - normal - nightmare - Act2Boss - Frost - Act3Boss - elite - terror - hellish - corrupted
//        ArrayList<Monster> monsters1 = new ArrayList<>();  // power level of monsters1 = monsters1-99
//        monsters1.add(new Monster(3, 2, "Weak Goblin", 2));
//        monsters1.add(new Monster(3, 1, "Weak Imp", 1));
//        monsters1.add(new Monster(3, 3, "Weak Knight", 3));
//        monsters1.add(new Monster(6, 1, "Weak Stone Imp", 3));
//        monsters1.add(new Monster(4, 2, "Weak Soldier", 4));
//        monsters1.add(new Monster(3, 3, "Weak Clayer", 5));
//        monsters1.add(new Monster(7, 1, "XP Worm", 6));
//        monsters1.add(new Monster(5, 1, "Weak Undead", 3));
//        monsters1.add(new Monster(4, 2, "Weak Lancer", 3));
//        monsters1.add(new Monster(7, 1, "Weak Bat", 3));
//        monsters1.add(new Monster(3, 1, "Weak Leech", 4));
//        monsters1.add(new Monster(5, 2, "Weak Stinger", 3));
//        monsters1.add(new Monster(8, 1, "Weak Flesheater", 4));
//        monsters1.add(new Monster(5, 1, "Weak Thief", 4));
//        monsters1.add(new Monster(6, 1, "Weak Orc", 4));
//        monsters1.add(new Monster(4, 2, "Weak Drake", 3));
//        monsters1.add(new Monster(5, 2, "Weak Demon", 4));
//        monsters1.add(new Monster(4, 1, "Weak Warlock", 3));
//        monsters1.add(new Monster(4, 2, "Weak Cultist", 3));
//
//
//        // RANDOM MONSTER LIST (COMMON)
//        ArrayList<Monster> monsters2 = new ArrayList<>();
//        monsters2.add(new Monster(5, 4, "Common Flayer", 7));
//        monsters2.add(new Monster(8, 3, "Common Thief", 6));
//        monsters2.add(new Monster(6, 3, "Common Goblin", 6));
//        monsters2.add(new Monster(7, 2, "Common Knight", 6));
//        monsters2.add(new Monster(8, 6, "Common Clayer", 7));
//        monsters2.add(new Monster(10, 3, "Common Golem", 5));
//        monsters2.add(new Monster(11, 3, "Common Stone Golem", 4));
//        monsters2.add(new Monster(9, 4, "Common Undead", 8));
//        monsters2.add(new Monster(7, 5, "Common Skeleton", 9));
//        monsters2.add(new Monster(9, 4, "Common Demon", 10));
//
//
//        // FIXED MONSTER LIST 3 BOSSES
//        Monster warlordManda = new Monster(45, 12, "Warlord Manda", 20);
//        Monster warlordKoold = new Monster(54, 14, "Warlord Koold", 24);
//        Monster warlordYdris = new Monster(58, 18, "Warlord Ydris", 33);
//        Monster act2Boss = new Monster(650, 90, "Abaddon, Fallen Angel", 60);
//        Monster act3Boss = new Monster(2000, 300, "Hidden Entity", 110);
//        ArrayList<Monster> warlordMandaList = new ArrayList<>();
//        warlordMandaList.add(warlordManda);
//        ArrayList<Monster> warlordKooldList = new ArrayList<>();
//        warlordKooldList.add(warlordKoold);
//        ArrayList<Monster> warlordYdrisList = new ArrayList<>();
//        warlordYdrisList.add(warlordYdris);
//        ArrayList<Monster> act2BossList = new ArrayList<>();
//        act2BossList.add(act2Boss);
//        ArrayList<Monster> act3BossList = new ArrayList<>();
//        act3BossList.add(act3Boss);
//
//        // RANDOM MONSTER LIST (NORMAL)    // weak - common  - Warlords - normal - nightmare - Act2Boss - Frost - Act3Boss - elite - terror - hellish - corrupted
//        ArrayList<Monster> monsters3 = new ArrayList<>();  // power level of monsters1 = monsters1-99
//        monsters3.add(new Monster(44, 22, "Normal Goblin", 24));
//        monsters3.add(new Monster(66, 23, "Normal Imp", 15));
//        monsters3.add(new Monster(55, 24, "Normal Knight", 22));
//        monsters3.add(new Monster(32, 27, "Normal Stone Imp", 22));
//        monsters3.add(new Monster(41, 20, "Normal Soldier", 41));
//        monsters3.add(new Monster(63, 21, "Normal Clayer", 23));
//        monsters3.add(new Monster(41, 20, "Normal Undead", 36));
//        monsters3.add(new Monster(52, 27, "Normal Lancer", 31));
//        monsters3.add(new Monster(43, 23, "Normal Bat", 31));
//        monsters3.add(new Monster(49, 22, "Normal Leech", 25));
//        monsters3.add(new Monster(48, 21, "Normal Stinger", 25));
//        monsters3.add(new Monster(41, 21, "Normal Flesheater", 21));
//        monsters3.add(new Monster(76, 21, "Normal Thief", 26));
//        monsters3.add(new Monster(65, 21, "Normal Orc", 28));
//        monsters3.add(new Monster(41, 21, "Normal Drake", 29));
//        monsters3.add(new Monster(53, 21, "Normal Demon", 39));
//        monsters3.add(new Monster(64, 21, "Normal Warlock", 44));
//        monsters3.add(new Monster(37, 21, "Normal Cultist", 30));
//        monsters3.add(new Monster(56, 22, "Normal Spawn", 22));
//        monsters3.add(new Monster(33, 33, "Normal Illusion", 33));
//        monsters3.add(new Monster(45, 18, "Normal Cultist", 24));
//
//        // RANDOM MONSTER LIST (NIGHTMARE)
//        ArrayList<Monster> monsters4 = new ArrayList<>();
//        monsters4.add(new Monster(57, 94, "Nightmare Flayer", 71));
//        monsters4.add(new Monster(86, 83, "Nightmare Thief", 61));
//        monsters4.add(new Monster(68, 73, "Nightmare Goblin", 61));
//        monsters4.add(new Monster(79, 82, "Nightmare Knight", 62));
//        monsters4.add(new Monster(80, 96, "Nightmare Clayer", 73));
//        monsters4.add(new Monster(110, 83, "Nightmare Golem", 54));
//        monsters4.add(new Monster(191, 73, "Nightmare Stone Golem", 45));
//        monsters4.add(new Monster(99, 64, "Nightmare Undead", 86));
//        monsters4.add(new Monster(79, 75, "Nightmare Skeleton", 97));
//        monsters4.add(new Monster(99, 64, "Nightmare Demon", 70));
//        monsters4.add(new Monster(78, 100, "Nightmare Shadow", 60));
//        monsters4.add(new Monster(91, 79, "Nightmare Lancer", 77));
//
//        // RANDOM MONSTER LIST (FROST)   // weak - common  - Warlords - normal - nightmare - Act2Boss - Frost - Act3Boss - elite - terror - hellish - corrupted
//        ArrayList<Monster> monsters5 = new ArrayList<>();
//        monsters5.add(new Monster(131, 30, "Frost Yeti", 70));
//        monsters5.add(new Monster(202, 35, "Frost Giant", 60));
//        monsters5.add(new Monster(123, 40, "Frost Elemental", 50));
//        monsters5.add(new Monster(154, 44, "Frost Horror", 88));
//
//        // FINAL BOSS MONSTER LIST
//        ArrayList<Monster> finalBoss = new ArrayList<>();
//        finalBoss.add(new Monster(9999, 500, "Corrupted Hero", 999));
//
//        //__________________________________________________________________________________________________________________________________________________________________________________
//
//        // ITEMS LISTS
//
//        // FIXED ITEM LIST
//        Item item1 = new Item(0, 1, 1, "Old Boots", "Boots", 0, 0, 0, 0, 0);
//        Item item2 = new Item(5, 2, 5, "Armor of Strength1", "Armor", 0, 0, 0, 0, 0);
//        Item item3 = new Item(1, 1, 6, "bracers", "Bracers", 0, 1, 0, 0, 0);
//        Item item4 = new Item(1, 1, 1, "brace2", "Bracers", 0, 1, 1, 0, 0);
//        Item item5 = new Item(0, 0, 4, "Test boots", "Boots", 0, 0, 0, 0, 0);
//
//        // RANDOM ITEM LIST 1
//        ArrayList<Item> items1 = new ArrayList<>();    // power level of items = items1-99
//        items1.add(new Item(1, 2, 1, "Leggings of Defense", "Leggings", 0, 0, 0, 0, 0));
//        items1.add(new Item(2, 1, 1, "Helm of Strength", "Helm", 0, 0, 0, 0, 0));
//        items1.add(new Item(1, 1, 2, "Armor of Health", "Armor", 0, 2, 0, 0, 0));
//        items1.add(new Item(1, 3, 1, "Ring of Attributes R1", "Ring1", 0, 1, 1, 0, 0));
//        items1.add(new Item(0, 2, 3, "Armor of Survival", "Armor", 0, 5, 0, 0, 0));
//        items1.add(new Item(1, 1, 2, "Leather Boots", "Boots", 0, 0, 0, 0, 0));
//        items1.add(new Item(1, 1, 1, "Leather Gloves", "Gloves", 0, 1, 0, 0, 0));
//        items1.add(new Item(0, 2, 2, "Leather Armor", "Armor", 0, 5, 0, 0, 0));
//        items1.add(new Item(1, 2, 1, "Bracers of Health", "Bracers", 0, 2, 0, 0, 0));
//        items1.add(new Item(0, 3, 0, "Amulet of Magic", "Amulet", 0, 0, 2, 0, 0));
//        items1.add(new Item(0, 1, 0, "Small Dagger of Lifesteal RH", "WeaponR1", 0, 0, 0, 2, 3));
//        items1.add(new Item(0, 2, 1, "Longsword of Rust LH", "WeaponL1", 0, 0, 0, 3, 0));
//        items1.add(new Item(0, 4, 0, "Ring of Lifesteal R2", "Ring2", 0, 0, 0, 0, 4));
//        items1.add(new Item(0, 1, 0, "Small Knife LH", "WeaponL1", 0, 0, 0, 2, 0));
//        items1.add(new Item(0, 1, 1, "Belt of Defense", "Belt", 0, 0, 0, 0, 0));
//        items1.add(new Item(0, 2, 0, "Bracers of Lifesteal", "Bracers", 0, 0, 0, 0, 3));
//        items1.add(new Item(2, 2, 1, "Shoulders of Defense", "Shoulders", 0, 0, 0, 0, 0));
//        items1.add(new Item(0, 1, 0, "Leggings of Health", "Leggings", 0, 5, 0, 0, 0));
//        items1.add(new Item(0, 0, 0, "Shoulders of Lifesteal", "Shoulders", 0, 0, 0, 0, 2));
//        items1.add(new Item(0, 0, 0, "Belt of Lifesteal", "Belt", 0, 0, 0, 0, 3));
//        items1.add(new Item(3, 0, 0, "Shoulders of Strength", "Shoulders", 0, 0, 0, 0, 0));
//        items1.add(new Item(0, 0, 0, "Small Axe RH", "WeaponR1", 0, 0, 0, 3, 0));
//        items1.add(new Item(0, 0, 0, "Small Scythe R1", "WeaponR1", 0, 0, 0, 2, 0));
//        items1.add(null);
//        items1.add(null);
//        items1.add(null);
//        items1.add(null);
//        items1.add(null);
//        items1.add(null);
//        items1.add(null);
//        items1.add(null);
//        items1.add(null);
//        items1.add(null);
//        items1.add(null);
//        items1.add(null);
//        items1.add(null);
//        items1.add(null);
//        items1.add(null);
//        items1.add(null);
//        items1.add(null);
//        items1.add(null);
//        items1.add(null);
//        items1.add(null);
//        items1.add(null);
//        items1.add(null);
//        items1.add(null);
//        items1.add(null);
//        items1.add(null);
//        items1.add(null);
//        items1.add(null);
//        items1.add(null);
//        items1.add(null);
//        items1.add(null);
////        items1.add(new Item(10,0, 1, "TEST ITEM", "Boots", 0, 0, 0, 0, 10)); // op test item
////                items1.add(new Item(888, 2, 1, "OP ARMOR", "Leggings", 0, 0, 0, 0, 0)); OP TEST ARMOR
//
//
//        // RANDOM ITEM LIST 2
//        ArrayList<Item> items2 = new ArrayList<>();    // power level of items = items1-99
//        items2.add(new Item(1, 2, 6, "Helm of Defense", "Helm", 0, 2, 0, 0, 0));
//        items2.add(new Item(2, 3, 7, "Armor of Level & Health", "Armor", 0, 4, 0, 0, 0));
//        items2.add(new Item(1, 3, 0, "Ring of Health R1", "Ring1", 0, 10, 0, 0, 0));
//        items2.add(new Item(0, 4, 10, "Armor of Iron", "Armor", 0, 0, 0, 0, 0));
//        items2.add(new Item(0, 0, 0, "Giant Axe of Life RH", "WeaponR1", 0, 0, 0, 3, 3));
//        items2.add(new Item(0, 4, 4, "Shoulders of Iron", "Shoulders", 0, 0, 0, 0, 0));
//        items2.add(new Item(2, 4, 0, "Flame Sword LH", "WeaponL1", 0, 0, 0, 4, 0));
//        items2.add(null);
//        items2.add(null);
//        items2.add(null);
//        items2.add(null);
//        items2.add(null);
//        items2.add(null);
//        items2.add(null);
//        items2.add(null);
//        items2.add(null);
//        items2.add(null);
//        items2.add(null);
//        items2.add(null);
//        items2.add(null);
//        items2.add(null);
//        items2.add(null);
//        items2.add(null);
//        items2.add(null);
//        items2.add(null);
//        items2.add(null);
//        items2.add(null);
//        items2.add(null);
//
//        // ITEMS LIST WARLORD GUARANTEED DROP
//        ArrayList<Item> itemsWarlords = new ArrayList<>();
//        itemsWarlords.add(new Item(2, 1, 2, "Helm of Blood", "Helm", 0, 0, 2, 0, 0));
//        itemsWarlords.add(new Item(4, 5, 7, "Armor of Blood", "Armor", 0, -10, 4, 0, 0));
//        itemsWarlords.add(new Item(2, 4, 6, "Ring of Blood R1", "Ring1", 0, 1, 3, 0, 0));
//        itemsWarlords.add(new Item(2, 3, 4, "Leggings of Blood", "Leggings", 0, 8, 1, 0, 0));
//        itemsWarlords.add(new Item(3, 4, 4, "Armor of Blood", "Armor", 0, 11, 2, 0, 0));
//        itemsWarlords.add(new Item(4, 5, 3, "Shoulders of Blood", "Armor", 0, 4, 1, 0, 0));
//        itemsWarlords.add(new Item(5, 3, 1, "Ring of Blood R2", "Ring2", 0, 0, 0, 0, 2));
//        itemsWarlords.add(null);
//        itemsWarlords.add(null);
//        itemsWarlords.add(null);
//
//
//        // ITEMS LIST 3
//        ArrayList<Item> items3 = new ArrayList<>();    // power level of items = items1-99
//        items3.add(new Item(3, 1, 3, "Helm of Strong", "Helm", 0, 0, 2, 0, 0));
//        items3.add(new Item(5, 5, 14, "Armor of Illness", "Armor", 0, -10, 4, 0, 0));
//        items3.add(new Item(1, 4, 11, "Ring of Defense R1", "Ring1", 0, 1, 3, 0, 0));
//        items3.add(new Item(3, 3, 7, "Armor of Metal", "Armor", 0, 8, 1, 0, 0));
//        items3.add(new Item(4, 4, 12, "Armor of Gold", "Armor", 0, 11, 2, 0, 0));
//        items3.add(new Item(6, 5, 13, "Armor of Rock", "Armor", 0, 4, 1, 0, 0));
//        items3.add(new Item(7, 3, 0, "Ring of Strength RH", "Ring2", 0, 0, 0, 0, 0));
//        items3.add(new Item(0, 0, 0, "Small Dagger of Life LH", "WeaponL1", 0, 0, 0, 2, 2));
//        items3.add(null);
//        items3.add(null);
//        items3.add(null);
//        items3.add(null);
//        items3.add(null);
//        items3.add(null);
//        items3.add(null);
//        items3.add(null);
//        items3.add(null);
//        items3.add(null);
//        items3.add(null);
//        items3.add(null);
//        items3.add(null);
//        items3.add(null);
//        items3.add(null);
//        items3.add(null);
//        items3.add(null);
//
//        // RANDOM ITEM LIST 4
//        ArrayList<Item> items4 = new ArrayList<>();    // power level of items = items1-99
//        items4.add(new Item(5, 8, 13, "Helm of Metal", "Helm", 0, 11, 0, 0, 0));
//        items4.add(new Item(4, 7, 12, "Armor of Shadows", "Armor", 0, 4, 0, 0, 0));
//        items4.add(new Item(4, 6, 11, "Ring of Plenty R2", "Ring2", 0, 10, 0, 0, 0));
//        items4.add(new Item(5, 4, 10, "Armor of Glory", "Armor", 0, 6, 0, 0, 0));
//        items4.add(new Item(6, 5, 15, "Giant Axe of Doom RH", "WeaponR1", 0, 7, 0, 8, 8));
//        items4.add(null);
//        items4.add(null);
//        items4.add(null);
//        items4.add(null);
//        items4.add(null);
//        items4.add(null);
//        items4.add(null);
//        items4.add(null);
//        items4.add(null);
//        items4.add(null);
//        items4.add(null);
//        items4.add(null);
//        items4.add(null);
//        items4.add(null);
//        items4.add(null);
//        items4.add(null);
//        items4.add(null);
//        items4.add(null);
//        items4.add(null);
//        items4.add(null);
//        items4.add(null);
//        items4.add(null);
//
//        //_____________________________________________________________________________________________________________________________________________
//
//        // GAME START
//        System.out.println("_________________________________________________________");
//        System.out.println("                       Welcome to                        ");
//        System.out.println("         ~~ \"A Programmers Console Adventure!\" ~~      ");
//        System.out.println("                        A C T   1                        ");
//        System.out.println("Made by Jakob Kvejborg                                   ");
//        System.out.println("_________________________________________________________");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a name for your hero:");
//        String setCharName = scanner.nextLine();
//        ArrayList<Item> initialItems = new ArrayList<>();
////        ArrayList<Item> equippedItems = new ArrayList<>();
//
//
//        // RPG CHARACTER1
//        RpgChar char1 = new RpgChar(1, 1, 1, 0, setCharName, 25, 0, 0, initialItems, 0, initialItems, initialItems);
//
//
//        System.out.println("Well met brave warrior! Here, let me show you your hero: ");
//        System.out.println("Name:" + setCharName + "  Strength:" + char1.charStrength + "  Level:" + char1.getCharLevel() + "  Attack:" + char1.charAttack + "  Defense:" + char1.charDefense + "  Health:" + char1.charHealth + "  Magic:" + char1.charMagic + "  XP:" + char1.charExperiencePoints);
//
//
//        // THE ADVENTURE BEGINS
//        System.out.println();
//        try {
//            Thread.sleep(100); // 9000
//        } catch (Exception e) {
//        }
//        System.out.println("Well now, let's get started. Let me teach you a couple of things before you begin your adv-");
//        try {
//            Thread.sleep(100); // 5000
//        } catch (Exception e) {
//        }
//        System.out.println("WATCH OUT HERO! BEHIND YOU!");
//        try {
//            Thread.sleep(100);  // 2000
//        } catch (Exception e) {
//        }
//
//
//        // FIRST MONSTER ENCOUNTER
//        System.out.println("It's a monster! Slay it hero. Enter \"A\" to attack!");
//        Encounter firstEncounter = new Encounter(char1, monsters1, items1);
//        firstEncounter.performEncounter();
//
//        // ADDS FIXED ITEM TO CHAR
////      //  char1.addItem(item1); // adds the item directly to the hero // DONT USE THIS
////        char1.addItemToInventory(item1);  // adds item 1 to the inventory
////        System.out.println("Item \"" + item1.getItemName() + "\" dropped."); // WORKS!
//
//
//        try {
//            Thread.sleep(2000);
//        } catch (Exception e) {
//        }
//
//
//        System.out.println();
//        System.out.println("Watch out, another enemy is approaching! If you've found some gear, you might want to equip it now!");
//
//        // SECOND FIGHT
//        Encounter secondEncounter = new Encounter(char1, monsters1, items1);
//        secondEncounter.performEncounter();
//
//        try {
//            Thread.sleep(1000);
//        } catch (Exception e) {
//        }
//
//        if (char1.charHealth > 0) {
//            System.out.println("Whew, that was close. Glad that's over. There's a bonfire over there, take a moment to rest.");
//            System.out.println("Press 'ENTER' when you are ready to continue.");
//            // PRESS ENTER TO CONTINUE
//            String x = scanner.nextLine();
//            switch (x) {
//                case "x":
//                    break;
//                default:
//                    System.out.println();
//                    break;
//            }
//        }
//
//
//        // REAL GAME BEGINS / CROSSROADS
//        if (char1.charHealth > 0) {
//            System.out.println("It's good you know how to fight - you're going to need it.");
//            System.out.println("As you continue down the road, a castle appears in the distance, standing in close proximity to a nearby forest. Although the castle seems far away, there's an eerie sensation that it's so near you could almost reach out and touch it.");
//            try {
//                Thread.sleep(1000);
//            } catch (Exception e) {
//            }
//            System.out.println();
//
//        } else {
//            System.out.println("The evil of this land overwhelm you.");
//            System.out.println();
//            System.out.println("Game Over.");
//            System.exit(0);
//        }
//        try {
//            Thread.sleep(100);
//        } catch (Exception e) {
//        }
//
//
//        // __________________________________________________________________________________________________________________________________________________________________________________________//
//        //                                                                             ENCOUNTERS THE 3 WARLORDS
//        //      ACT 1
//
//
//        // FIGHT
//        int optionThreeSelected = 0;
//        int i = 0; // ensures message "you continue" doesn't play the first time around
//        boolean firstTimeMessage = true;
//        int count = 0;
////        for (int fightCountDown = 1; fightCountDown <= 9999;) {  // Number of fights before moving on in the storyline
//        while (optionThreeSelected < 3) {
//            boolean validChoice = false;
//            while (!validChoice) {
//                if (char1.charHealth > 0) {
//                    if (firstTimeMessage) {
//                        System.out.println("This is a world of crossroads - it's time to choose your path.");
//                        System.out.println("Enter your choice: ");
//                        WarlordFrame act1ForrestImage = new WarlordFrame("forrest.png"); // JFRAME PICTURE APPEARS
//                        firstTimeMessage = false;
//                    }
//                    if (i > 0) { // ensures message "you continue" doesn't play the first time around
//                        System.out.println("After the battle you return to the place you started. You continue:");
//                    }
//                    System.out.println("1. Enter the forest and fight lesser enemies.");
//                    System.out.println("2. Slay the monsters on the road to the castle.");
//                    System.out.println("3. Go to the Castle in the distance in hope of defeating one of the 3 Warlords.");
//                    String hey2 = scanner.nextLine();
////                    fightCountDown++;
//                    switch (hey2) {
//                        case "1":
//                            Encounter thirdEncounter = new Encounter(char1, monsters1, items1);
//                            thirdEncounter.performEncounter();
//                            break;
//
//                        case "2":
//                            Encounter fourthEncounter = new Encounter(char1, monsters2, items1);
//                            fourthEncounter.performEncounter();
//                            break;
//                        case "3":
//                            switch (count) {
//                                case 0:
//                                    WarlordFrame imageWarlordManda = new WarlordFrame("Manda.JPG");
//                                    Encounter fifthEncounter = new Encounter(char1, warlordMandaList, itemsWarlords);    // First boss
//                                    fifthEncounter.performEncounter();
//                                    break;
//                                case 1:
//                                    WarlordFrame imageWarlordKoold = new WarlordFrame("Koold.JPG");
//                                    Encounter sixthEncounter = new Encounter(char1, warlordKooldList, itemsWarlords);    // Second boss
//                                    sixthEncounter.performEncounter();
//                                    break;
//                                case 2:
//                                    WarlordFrame imageWarlordYdris = new WarlordFrame("Ydris.JPG");
//                                    Encounter seventhEncounter = new Encounter(char1, warlordYdrisList, itemsWarlords);   // Third boss
//                                    seventhEncounter.performEncounter();
//                                    break;
//                            }
//                            optionThreeSelected++;
//                            count++;
//                            if (optionThreeSelected >= 3) {  // progresses the story
//                                break;
//                            }
//                            break;
////                            Encounter fifthEncounter = new Encounter(char1, monsters3, items3);
////                            fifthEncounter.performEncounter();
////                            optionThreeSelected++;
////                            if (optionThreeSelected >= 3) {      // progresses the story
////                                break;
////                            }
//                        default:
//                            System.out.println("Error, enter a valid choice.");
//                            break;
//                    }
//                    validChoice = true;
//                } else {
//                    System.out.println("The evil of this land overwhelm you.");
//                    System.out.println();
//                    System.out.println("Game Over.");
//                    System.exit(0);
//                }
//                i++;
//            }
//        }
//
//        // _______________________________________________________________________________________________________________________________________________________________________________//
////                                                  THE STORY CONTINUES
//        try {
//            Thread.sleep(3000);
//        } catch (Exception e) {
//        }
//
//        System.out.println();
//        System.out.println("_________________________________________________________________________________________________");
//        System.out.println();
//        System.out.println("    Having defeated the 3 Warlords, the hero savor a moment of newfound strength and relief, ");
//        System.out.println("      only to be interrupted by an unsettling feeling that something much more sinister ");
//        System.out.println("                            awaits just beyond the horizon.");
//        System.out.println("                                       A C T   2");
//        System.out.println();
//        System.out.println("_________________________________________________________________________________________________");
//        System.out.println();
//        System.out.println();
//        try {
//            Thread.sleep(8000);
//        } catch (Exception e) {
//        }
//
//        System.out.println("Driven by unrest, you venture forth. The land ahead of you is vast, but it doesn't take long before you come across");
//        System.out.println("corpses laying on the ground, surrounded by steeds and caravans. This isn't the work of the Warlords - but something else...");
//        System.out.println("You enter a small town with only a few houses. Not many townsfolk remain, and no one seems willing to speak with you.");
//        System.out.println();
//        System.out.println();
//        try {
//            Thread.sleep(7000);
//        } catch (Exception e) {
//        }
//
//
//        // _________________________________________________________________________________________________________________________________________________________________________________________
////        CROSSROADS
//// FIGHT
//        int optionThreeSelected2 = 0;
//        int crossRoadsI2 = 0; // ensures message "you continue" doesn't play the first time around
//        boolean firstTimeMessage2 = true;
//        int count2 = 0;
//        while (optionThreeSelected2 < 1) {
//            boolean validChoice = false;
//            while (!validChoice) {
//                if (char1.charHealth > 0) {
//                    if (firstTimeMessage2) {
//                        System.out.println("Your eyes are drawn towards the tower that stands near the city.");
//                        WarlordFrame act2TowerImage = new WarlordFrame("tower.png"); // JFRAME PICTURE APPEARS
//                        firstTimeMessage2 = false;
//                    }
//                    if (crossRoadsI2 > 0) { // ensures message "you continue" doesn't play the first time around
//                        System.out.println("Despite your exhaustion and being drenched in blood, you continue to fight:");
//                    }
//                    System.out.println("1. Slay the monsters surrounding the town.");
//                    System.out.println("2. Enter the tower and battle the nightmares inside.");
//                    System.out.println("3. Ascend the tower and confront the horror that awaits you.");
//                    String hey3 = scanner.nextLine();
////                    fightCountDown++;
//                    switch (hey3) {
//                        case "1":
//                            Encounter sixthEncounter = new Encounter(char1, monsters3, items1);
//                            sixthEncounter.performEncounter();
//                            break;
//
//                        case "2":
//                            Encounter seventhEncounter = new Encounter(char1, monsters4, items3);
//                            seventhEncounter.performEncounter();
//                            break;
//                        case "3": // ACT 2 BOSS FIGHT
//                            System.out.println("You climb the tall tower. When you reach the top you face a malevolent demon.");
//                            try {
//                                Thread.sleep(3000);
//                            } catch (Exception e) {
//                            }
//                            WarlordFrame imageAct2Boss = new WarlordFrame("act2boss.JPG");
//                            Encounter f2ifthEncounter = new Encounter(char1, act2BossList, items4);
//                            f2ifthEncounter.performEncounter();
//                            optionThreeSelected2++;
//
//                            if (optionThreeSelected2 >= 1) {  // progresses the story
//                                break;
//                            }
//                            break;
//
//                        default:
//                            System.out.println("Error, enter a valid choice.");
//                            break;
//                    }
//                    validChoice = true;
//                } else {
//                    System.out.println("The evil of this land overwhelm you.");
//                    System.out.println();
//                    System.out.println("Game Over.");
//                    System.exit(0);
//                }
//                crossRoadsI2++;
//            }
//        }
//
//        System.out.println("Seconds before its' last breath, the angel whisper things to you... Things no one ever would want to hear.");
//
//
//// _______________________________________________________________________________________________________________________________________________________________________________//
////                                                  THE STORY CONTINUES
//        try {
//            Thread.sleep(3000);
//        } catch (Exception e) {
//        }
//
//        System.out.println();
//        System.out.println("_________________________________________________________________________________________________");
//        System.out.println();
//        System.out.println("                  The hero doesn't celebrate his victory, not this time.              ");
//        System.out.println("                             No glory was found in this battle.                       ");
//        System.out.println("                                   Only death awaits.                                   ");
//        System.out.println("                                       A C T   3");
//        System.out.println();
//        System.out.println("_________________________________________________________________________________________________");
//        System.out.println();
//        System.out.println();
//        try {
//            Thread.sleep(9000);
//        } catch (Exception e) {
//        }
//
//        System.out.println("As you descend from the tower, you begin to hear voices in your mind.");
//        System.out.println("Facing the demons and nightmares is slowly taking its toll, but you can't afford to lose your sanity, not yet. You still have a quest to complete.");
//        System.out.println("The cold mountains to the east lie ahead of you. You must reach them before it's too late.");
//        System.out.println();
//        System.out.println("You journey for several days, and with each passing day, the chill in the air grows more biting. Along the way, you encounter numerous figures standing completely still, frozen.");
//        System.out.println();
//        System.out.println();
//        try {
//            Thread.sleep(11000);
//        } catch (Exception e) {
//        }
//
//        WarlordFrame sAct3 = new WarlordFrame("act3.JPG");
//
//        try {
//            Thread.sleep(4000);
//        } catch (Exception e) {
//        }
//
//        int optionThreeSelected3 = 0;
//        int crossRoadsI3 = 0; // ensures message "you continue" doesn't play the first time around
//        boolean firstTimeMessage3 = true;
//        int count3 = 0;
//        while (optionThreeSelected3 < 1) {
//            boolean validChoice = false;
//            while (!validChoice) {
//                if (char1.charHealth > 0) {
//                    if (firstTimeMessage3) {
//                        System.out.println("After a long and challenging journey, you finally set eyes on your goal. However, even in these distant mountains monsters reside.");
//                        firstTimeMessage3 = false;
//                        WarlordFrame act3Frame = new WarlordFrame("act3lands.JPG");
//                    }
//                    if (crossRoadsI3 > 0) { // ensures message "you continue" doesn't play the first time around
//                        System.out.println("You're on the brink of freezing to death. But you march on:");
//                    }
//
//                    System.out.println("1. Fight through the snow.");
//                    System.out.println("2. Enter the well-lit cave.");
//                    String hey4 = scanner.nextLine();
////                    fightCountDown++;
//                    switch (hey4) {
//                        case "1":
//                            Encounter ninthEncounter = new Encounter(char1, monsters5, items2);
//                            ninthEncounter.performEncounter();
//                            break;
//
//                        case "2": // ACT 3 BOSS FIGHT
//                            System.out.println("Somehow, you know exactly where to look for the cave. The unspeakable horror awaits just at the end of this tunnel.");
//                            System.out.println("The cave lights up, warm and welcoming. But the mere sight of the demon makes you wish you had simply stayed out in the cold and frozen to death.");
//                            try {
//                                Thread.sleep(6000);
//                            } catch (Exception e) {
//                            }
//                            WarlordFrame imageAct3Boss = new WarlordFrame("act3boss.JPG");
//                            Encounter tenthEncounter = new Encounter(char1, act3BossList, items4);
//                            tenthEncounter.performEncounter();
//                            optionThreeSelected3++;
//
//                            if (optionThreeSelected3 >= 1) {  // progresses the story
//                                break;
//                            }
//                            break;
//
//                        default:
//                            System.out.println("Error, enter a valid choice.");
//                            break;
//                    }
//                    validChoice = true;
//                } else {
//                    System.out.println("The evil of this land overwhelm you.");
//                    System.out.println();
//                    System.out.println("Game Over.");
//                    System.exit(0);
//                }
//                crossRoadsI3++;
//            }
//        }
//
//
//        // _______________________________________________________________________________________________________________________________________________________________________________//
////                                                 ACT 4
//
//        try {
//            Thread.sleep(3000);
//        } catch (Exception e) {
//        }
//
//        System.out.println();
//        System.out.println("_________________________________________________________________________________________________");
//        System.out.println();
//        System.out.println("                  The evil of this mountain has been slain by the hero.              ");
//        System.out.println("                         The hero has nearly succumbed to insanity.                                                    ");
//        System.out.println("                                  Was it all for nothing?                                   ");
//        System.out.println("                                       A C T   4");
//        System.out.println();
//        System.out.println("_________________________________________________________________________________________________");
//        System.out.println();
//        System.out.println();
//        try {
//            Thread.sleep(8000);
//        } catch (Exception e) {
//        }
//
//        System.out.println("3 portals open before you.");
//        System.out.println("You may now travel freely to the places you've already been.");
//        System.out.println("One final trial lies ahead.");
//        System.out.println();
//        System.out.println();
//        System.out.println();
//
//        try {
//            Thread.sleep(10000);
//        } catch (Exception e) {
//        }
//
//        int optionFourSelected4 = 0;
//        int crossRoadsI4 = 0; // ensures message "you continue" doesn't play the first time around
//        boolean firstTimeMessage4 = true;
//        int count4 = 0;
//        while (optionFourSelected4 < 1) {
//            boolean validChoice = false;
//            while (!validChoice) {
//                if (char1.charHealth > 0) {
//                    if (firstTimeMessage4) {
//                        System.out.println("Take step into one of the portals.");
//                        firstTimeMessage4 = false;
//                    }
//                    if (crossRoadsI4 > 3) { // ensures message "you continue" doesn't play the first time around
//                        System.out.println("After the battles you return to the cave, but a final portal has opened:");
//                    }
//                    System.out.println("1. Enter the dungeon of the first castle.");
//                    System.out.println("2. The tower still stands, enter it and defeat the nightmares inside.");
//                    System.out.println("3. Enter the cold mountain pathwaths and fight the frost demons.");
//                    if (crossRoadsI4 > 3) { // ensures message "you continue" doesn't play the first time around
//                        System.out.println("4. ??????????");
//                    }
//
//                    String hey4 = scanner.nextLine();
////                    fightCountDown++;
//                    switch (hey4) {
//                        case "1":
//                            Encounter eleventhEncounter = new Encounter(char1, monsters2, items1);
//                            eleventhEncounter.performEncounter();
//                            break;
//
//                        case "2":
//                            Encounter twelthEncounter = new Encounter(char1, monsters4, items3);
//                            twelthEncounter.performEncounter();
//                            break;
//                        case "3": // ACT 2 BOSS FIGHT
//                            Encounter thirtheenthEncounter = new Encounter(char1, monsters5, items2);
//                            thirtheenthEncounter.performEncounter();
//                            break;
//                        case "4":
//                            System.out.println("insert final boss here.");
//                            WarlordFrame lastFrameBoss = new WarlordFrame("curropted.JPG");
//                            Encounter lastEncounter = new Encounter(char1, finalBoss, items1);
//                            optionFourSelected4++;
//                            if (optionFourSelected4 >= 1) {  // progresses the story
//                            }
//                            break;
//
//                        default:
//                            System.out.println("Error, enter a valid choice.");
//                            break;
//                    }
//                    validChoice = true;
//                } else {
//                    System.out.println("The evil of this land overwhelm you.");
//                    System.out.println();
//                    System.out.println("Game Over.");
//                    System.exit(0);
//                }
//                crossRoadsI4++;
//            }
//        }
//
//        System.out.println("\"Congratulations on your victory! Thank you for playing my game.\"");
//        System.out.println(" - Made by Jakob Kvejborg 2023.");
//    }
//}
