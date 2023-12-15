/**
 * Author: Jakob Kvejborg
 * 2023
 * jakobkvejborglol@gmail.com
 */
// This is a bugged version, savefile doesn't work at all.


//Another simple but dangerous way is to use git command:
//
//        git fetch --all
//
//        git reset --hard origin/master
//
//        (Then all your local change will be lost)
//
//        Alt + 9 = git history, able to return to any previous version of the code

import javax.swing.*;
import java.util.*;
import java.util.ArrayList;

// Jakob Kvejborg 18/11/23
// 18:48

public class Main {

    //    WAIT METHODS
    public static void waitThreeSeconds() {
        try {
            Thread.sleep(3000); // 9000
        } catch (Exception e) {
        }
    }

    public static void waitOneSecond() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }

    public static void gameOver(RpgChar rpgChar) {
        if (rpgChar.charHealth <= 0) {
            System.out.println("You have been slain. You lay in a pool of your own blood. Game over.");
            System.exit(0);
        }
    }

    public void showGUI() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUI();
            }
        });
    }


    public static void main(String[] args) {
//         TEST AREA
//        _______________________________________________________________________________





        SwingUtilities.invokeLater(() -> {
                    GUI gui = new GUI(); // Creating GUI instance

                    gui.showWelcomeMessage(); // Display the welcome message in the GUI
                    String heroName = gui.askForHeroName(); // Get hero name from user via GUI
                });




//        _________________________________________________________________________________


        // GAME START
        System.out.println("_________________________________________________________");
        System.out.println("                       Welcome to                        ");
        System.out.println("         ~~ \"A Programmers Console Adventure!\" ~~      ");
        System.out.println("                        A C T   1                        ");
        System.out.println("- Made by Jakob Kvejborg                                ");
        System.out.println("_________________________________________________________");

        SaveLoad saveLoadObject = new SaveLoad(); // TODO fix this
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name for your hero:");
        String setCharName = scanner.nextLine();
        ArrayList<Item> initialItems = new ArrayList<>();
        ListOfItems loi = new ListOfItems();
        ListOfMonsters lom = new ListOfMonsters();


        // RPG CHARACTER1
        RpgChar char1 = new RpgChar(1, 1, 1, 0, setCharName, 35, 0, 0, initialItems, 0, initialItems, initialItems, 0);
        // INVENTORY OBJECT - needed for the inventory system
        InventoryClass inventoryObject = new InventoryClass(char1, (ArrayList<Item>) RpgChar.getInventory());


        System.out.println("Well met brave warrior! Here, let me show you your hero: ");
        System.out.println("Name:" + setCharName + "  Strength:" + char1.charStrength + "  Level:" + char1.getCharLevel() + "  Attack:" + char1.charAttack + "  Defense:" + char1.charDefense + "  Health:" + char1.charHealth + "/" + char1.getCharMaxHealth() + "  Magic:" + char1.charMagic + "  XP:" + char1.charExperiencePoints + "/10");


        // THE ADVENTURE BEGINS
        System.out.println();
        waitThreeSeconds();
        System.out.println("Well now, let's get started. Let me teach you a couple of things before you begin your adv-");
        waitOneSecond();
        System.out.println("WATCH OUT HERO! BEHIND YOU!");
        try {
            Thread.sleep(100);  // 2000
        } catch (Exception e) {
        }


        // FIRST MONSTER ENCOUNTER
        System.out.println("It's a monster! Slay it hero. Enter \"A\" to attack!");
        Encounter firstEncounter = new Encounter(char1, lom.monsters1, loi.items1);
        firstEncounter.performEncounter();
        gameOver(char1);


        // ADDS FIXED ITEM TO CHAR
//        char1.addItem(item1); // adds the item directly to the hero // use this for testing only
//        Item item1 = new Item(0, 0, 90, "hey", "Helm", 0, 0, 0, 0, 0, 0);
//        char1.addItemToInventory(item1);  // adds item 1 to the inventory
//        System.out.println("Item \"" + item1.getItemName() + "\" dropped.");


        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }


        System.out.println();
        System.out.println("Watch out, another enemy is approaching! If you've found some gear, you might want to equip it now!");


        // SECOND FIGHT
        Encounter secondEncounter = new Encounter(char1, lom.monsters1, loi.items1);
        secondEncounter.performEncounter();
        gameOver(char1);
        waitOneSecond();

        if (char1.charHealth > 0) {
            System.out.println("Whew, that was close. Glad that's over. There's a bonfire over there, take a moment to rest.");
            Item.pressEnterToContinue();


            // REAL GAME BEGINS / CROSSROADS
            if (char1.charHealth > 0) {
                System.out.println("It's good you know how to fight - you're going to need it.");
                System.out.println("As you continue down the road, a castle appears in the distance, standing in close proximity to a nearby forest. Although the castle seems far away, there's an eerie sensation that it's so near you could almost reach out and touch it.");


            } else {
                System.out.println("The evil of this land overwhelm you.");
                System.out.println();
                System.out.println("Game Over.");
                System.exit(0);
            }
            // PRESS ENTER TO CONTINUE
            System.out.println("Press 'ENTER' to continue...");


            // __________________________________________________________________________________________________________________________________________________________________________________________//
            //                                                                             ENTER THE 3 WARLORDS
            //      ACT 1

            RpgChar character = new RpgChar();

// Create an Encounter using the character instance
            Encounter encounter = new Encounter(character);
            String choice = scanner.nextLine();  //
            WarlordFrame act1ForrestImage = null;
            WarlordFrame imageWarlordManda = null;
            WarlordFrame imageWarlordKoold = null;
            WarlordFrame imageWarlordYdris = null;

            // FIGHT
            int optionThreeSelected = 0;
            int witchMeetingCounter = 0;
            int i = 0; // ensures message "you continue" doesn't play the first time around
            boolean firstTimeMessage = true;
            int count = 0;
//        for (int fightCountDown = 1; fightCountDown <= 9999;) {  // Number of fights before moving on in the storyline
            while (optionThreeSelected < 3) {
                boolean validChoice = false;
                while (!validChoice) {
//                    if (char1.charHealth > 0) {
                    if (firstTimeMessage) {
                        System.out.println("This is a world of crossroads - it's time to choose your path.");
                        System.out.println("Enter your choice: ");
                        act1ForrestImage = new WarlordFrame("forrest.png");
                        firstTimeMessage = false;
                    }
                    if (i > 0) { // ensures message "you continue" doesn't play the first time around
                        System.out.println("After the battle you return to the place you started. You continue:");
                    }
                    System.out.println("1. Enter the forest and fight lesser enemies.");
                    System.out.println("2. Slay the monsters on the road to the castle.");
                    System.out.println("3. Go to the Castle in the distance in hope of defeating one of the 3 Warlords.");
                    if (witchMeetingCounter == 5) {
                        System.out.println("4. A mysterious figure has appeared on the outskirts of the forest. It could be a witch. Perhaps you should speak to her?");
                    }
                    System.out.println("i. Open inventory.");

                    //                    fightCountDown++;


                    String choice2 = scanner.nextLine();
                    switch (choice2) {
                        // open inventory outside battle
                        case "i":
                            // Open the character's inventory
                            inventoryObject.InventoryOverall();
                            break;
                        // _________
                        case "1":
                            Encounter thirdEncounter = new Encounter(char1, lom.monsters1, loi.items1);
                            thirdEncounter.performEncounter();
                            break;

                        case "2":
                            Encounter fourthEncounter = new Encounter(char1, lom.monsters2, loi.items1);
                            fourthEncounter.performEncounter();
                            break;
                        case "4":
                            if (witchMeetingCounter == 5) {
                                char1.charHealth = char1.getCharMaxHealth();
                                System.out.println("\"Come closer and let me heal you, my dear child. But it will come with a price... Wahaha!\"");
                                System.out.println();
                                witchMeetingCounter++; // makes the witch disappear after spoken to
                                Item.pressEnterToContinue();
                                break;
                            } else {
                                System.out.println("Error, enter a valid choice.");
                            }
                            break;
                        case "save":
                            saveLoadObject.saveGame(character);
                            break;
                        case "load":
                            saveLoadObject.loadGame(character);
                            char1 = character;
                            System.out.println(char1.getCharName());
                            break;
                        case "exit":
                            System.out.println("Closing the game.");
                            System.exit(0);
                            break;
                        case "reset":
                            String[] arguments = {};
                            main(arguments);
                            break;
                        case "3":
                            switch (count) {
                                case 0:

                                    imageWarlordManda = new WarlordFrame("Manda.JPG");
                                    Encounter fifthEncounter = new Encounter(char1, lom.warlordMandaList, loi.itemsWarlords);    // First boss
                                    fifthEncounter.performEncounter();
                                    imageWarlordManda.dispose();
                                    break;
                                case 1:
                                    imageWarlordKoold = new WarlordFrame("Koold.JPG");
                                    Encounter sixthEncounter = new Encounter(char1, lom.warlordKooldList, loi.itemsWarlords);    // Second boss
                                    sixthEncounter.performEncounter();
                                    imageWarlordKoold.dispose();
                                    break;
                                case 2:
                                    imageWarlordYdris = new WarlordFrame("Ydris.JPG");
                                    Encounter seventhEncounter = new Encounter(char1, lom.warlordYdrisList, loi.itemsWarlords);   // Third boss
                                    seventhEncounter.performEncounter();
                                    imageWarlordYdris.dispose();
                                    break;
                            }
                            optionThreeSelected++;
                            count++;
                            if (optionThreeSelected >= 3) {  // progresses the story
                                break;
                            }
                            break;

                        default:
                            System.out.println("Error, enter a valid choice.");
                            break;
                    }
                    validChoice = true;
                    if (choice2.equals("1") || choice2.equals("2") || choice2.equals("3")) {
                        witchMeetingCounter++;
                    }
//                    } else {
//                        System.out.println("The evil of this land overwhelm you.");
//                        System.out.println();
//                        System.out.println("Game Over.");
//                        System.exit(0);
//                    }
                    i++;
                }
            }
            act1ForrestImage.dispose(); // closes the ACT 1 forrest image JFRAME

            gameOver(char1);

            // _______________________________________________________________________________________________________________________________________________________________________________//
//                                                  THE STORY CONTINUES
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }

            System.out.println();
            System.out.println("_________________________________________________________________________________________________");
            System.out.println();
            System.out.println("    Having defeated the 3 Warlords, the hero savor a moment of newfound strength and relief, ");
            System.out.println("      only to be interrupted by an unsettling feeling that something much more sinister ");
            System.out.println("                            awaits just beyond the horizon.");
            System.out.println("                                       A C T   2");
            System.out.println();
            System.out.println("_________________________________________________________________________________________________");
            System.out.println();
            System.out.println();

            // PRESS ENTER TO CONTINUE
            Item.pressEnterToContinue();

            System.out.println("Driven by unrest, you venture forth. The land ahead of you is vast, but it doesn't take long before you come across");
            System.out.println("corpses laying on the ground, surrounded by steeds and caravans. This isn't the work of the Warlords - but something else...");
            System.out.println("You enter a small town with only a few houses. Not many townsfolk remain, and no one seems willing to speak with you.");
            System.out.println();
            System.out.println();

            // PRESS ENTER TO CONTINUE
            Item.pressEnterToContinue();

            // _________________________________________________________________________________________________________________________________________________________________________________________
//        CROSSROADS
// FIGHT
            WarlordFrame act2TowerImage = null;
            WarlordFrame imageAct2Boss = null;
            int optionThreeSelected2 = 0;
            int crossRoadsI2 = 0; // ensures message "you continue" doesn't play the first time around
            boolean firstTimeMessage2 = true;
            int healingWellCounter = 0;
            int count2 = 0;
            while (optionThreeSelected2 < 1) {
                boolean validChoice = false;
                while (!validChoice) {
                    if (char1.charHealth > 0) {
                        if (firstTimeMessage2) {
                            System.out.println("Your eyes are drawn towards the tower that stands near the city.");
                            act2TowerImage = new WarlordFrame("tower.png"); // JFRAME PICTURE APPEARS
                            firstTimeMessage2 = false;
                        }
                        if (crossRoadsI2 > 0) { // ensures message "you continue" doesn't play the first time around
                            System.out.println("Despite your exhaustion and being drenched in blood, you continue to fight:");
                        }
                        System.out.println("1. Slay the monsters surrounding the town.");
                        System.out.println("2. Enter the tower and battle the nightmares inside.");
                        System.out.println("3. Ascend the tower and confront the horror that awaits you.");
                        if (healingWellCounter >= 16) {
                            System.out.println("4. Only now you notice a well in the middle of street. Investigate it.");
                        }
                        System.out.println("i. Open inventory.");

                        String hey3 = scanner.nextLine();
//                    fightCountDown++;
                        switch (hey3) {
                            // open inventory outside battle
                            case "i":
                                // Open the character's inventory
                                inventoryObject.InventoryOverall();
                                break;
                            // _________
                            case "1":
                                Encounter sixthEncounter = new Encounter(char1, lom.monsters3, loi.items1a);
                                sixthEncounter.performEncounter();
                                break;

                            case "2":
                                Encounter seventhEncounter = new Encounter(char1, lom.monsters4, loi.items3); // nightmare monster
                                seventhEncounter.performEncounter();
                                break;
                            case "4":
                                if (healingWellCounter >= 16) {
                                    char1.charHealth = char1.getCharMaxHealth();
                                    System.out.println("You drink from the well and feel refreshed.");
                                    System.out.println();
                                    System.out.println();
                                    break;
                                } else {
                                    System.out.println("Error, enter a valid choice.");
                                }
                                break;
                            case "3": // ACT 2 BOSS FIGHT
                                System.out.println("You climb the tall tower. When you reach the top you face a malevolent demon.");
                                try {
                                    Thread.sleep(3000);
                                } catch (Exception e) {
                                }
                                imageAct2Boss = new WarlordFrame("act2boss.JPG");
                                Encounter f2ifthEncounter = new Encounter(char1, lom.act2BossList, loi.items4);
                                f2ifthEncounter.performEncounter();      // ENCOUNTERS ACT 2 BOSS
                                optionThreeSelected2++;
                                imageAct2Boss.dispose(); // closes the boss image jframe

                                if (optionThreeSelected2 >= 1) {  // progresses the story
                                    break;
                                }
                                break;

                            default:
                                System.out.println("Error, enter a valid choice.");
                                break;
                        }
                        validChoice = true;
                        if (hey3.equals("1") || hey3.equals("2") || hey3.equals("3")) {
                            healingWellCounter++;
                        }
                    } else {
                        System.out.println("The evil of this land overwhelm you.");
                        System.out.println();
                        System.out.println("Game Over.");
                        System.exit(0);
                    }
                    crossRoadsI2++;
                }
            }

            gameOver(char1);

            act2TowerImage.dispose();
            System.out.println("Seconds before its' last breath, the angel whisper things to you... Things no one ever would want to hear.");


// _______________________________________________________________________________________________________________________________________________________________________________//
//                                                  THE STORY CONTINUES
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }

            System.out.println();
            System.out.println("_________________________________________________________________________________________________");
            System.out.println();
            System.out.println("                  The hero doesn't celebrate his victory, not this time.              ");
            System.out.println("                             No glory was found in this battle.                       ");
            System.out.println("                                   Only death awaits.                                   ");
            System.out.println("                                       A C T   3");
            System.out.println();
            System.out.println("_________________________________________________________________________________________________");
            System.out.println();
            System.out.println();

            // PRESS ENTER TO CONTINUE
            Item.pressEnterToContinue();

            System.out.println("As you descend from the tower, you begin to hear voices in your head.");
            System.out.println("Facing the demons and nightmares is slowly taking its toll, but you can't afford to lose your sanity, not yet. You still have a quest to complete.");
            System.out.println("The cold mountains to the east lie ahead of you. You must reach them before it's too late.");
            System.out.println();
            System.out.println("You journey for several days, and with each passing day, the chill in the air grows more biting. Along the way, you encounter numerous figures standing completely still, frozen.");
            System.out.println();
            System.out.println();

            // PRESS ENTER TO CONTINUE
            Item.pressEnterToContinue();

            WarlordFrame sAct3 = null;
            WarlordFrame act3Frame = null;
            WarlordFrame imageAct3Boss = null;


            sAct3 = new WarlordFrame("act3.JPG");

            try {
                Thread.sleep(6000);
            } catch (Exception e) {
            }
            sAct3.dispose(); // closes act3 image jframe

            int optionThreeSelected3 = 0;
            int crossRoadsI3 = 0; // ensures message "you continue" doesn't play the first time around
            boolean firstTimeMessage3 = true;
            int count3 = 0;
            while (optionThreeSelected3 < 1) {
                boolean validChoice = false;
                while (!validChoice) {
                    if (char1.charHealth > 0) {
                        if (firstTimeMessage3) {
                            System.out.println("After a long and challenging journey, you finally set eyes on your goal. However, even in these distant mountains monsters reside.");
                            firstTimeMessage3 = false;
                            act3Frame = new WarlordFrame("act3lands.JPG");
                        }
                        if (crossRoadsI3 > 0) { // ensures message "you continue" doesn't play the first time around
                            System.out.println("You're on the brink of freezing to death. But you march on:");
                        }

                        System.out.println("1. Fight through the snow.");
                        System.out.println("2. Enter the hidden ice cave.");
                        System.out.println("i. Open inventory.");
                        String hey4 = scanner.nextLine();
//                    fightCountDown++;
                        switch (hey4) {
                            // open inventory outside battle
                            case "i":
                                // Open the character's inventory
                                inventoryObject.InventoryOverall();
                                break;
                            // _________
                            case "1":
                                Encounter ninthEncounter = new Encounter(char1, lom.monsters5, loi.items3a); // Frost monster
                                ninthEncounter.performEncounter();
                                break;

                            case "2": // ACT 3 BOSS FIGHT
                                System.out.println("Somehow, you know exactly where to look for the cave. The unspeakable horror awaits just at the end of this tunnel.");
                                System.out.println("The cave lights up, warm and welcoming. But the mere sight of the demon makes you wish you had simply stayed out in the cold and frozen to death.");
                                // PRESS ENTER TO CONTINUE
                                Item.pressEnterToContinue();
                                imageAct3Boss = new WarlordFrame("act3boss.JPG");
                                Encounter tenthEncounter = new Encounter(char1, lom.act3BossList, loi.items4);
                                tenthEncounter.performEncounter();
                                optionThreeSelected3++;
                                imageAct3Boss.dispose();

                                if (optionThreeSelected3 >= 1) {  // progresses the story
                                    break;
                                }
                                break;

                            default:
                                System.out.println("Error, enter a valid choice.");
                                break;
                        }
                        validChoice = true;
                    } else {
                        System.out.println("The evil of this land overwhelm you.");
                        System.out.println();
                        System.out.println("Game Over.");
                        System.exit(0);
                    }
                    crossRoadsI3++;
                }
            }
            gameOver(char1);
            act3Frame.dispose();

            // _______________________________________________________________________________________________________________________________________________________________________________//
//                                                 ACT 4

            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }

            System.out.println();
            System.out.println("_________________________________________________________________________________________________");
            System.out.println();
            System.out.println("                   The evil of this mountain has been slain by the hero.              ");
            System.out.println("                    On the brink of madness, he fights through the pain.                                                    ");
            System.out.println("                                  Was it all for nothing?                                   ");
            System.out.println("                                       A C T   4");
            System.out.println();
            System.out.println("_________________________________________________________________________________________________");
            System.out.println();
            System.out.println();

            // PRESS ENTER TO CONTINUE
            Item.pressEnterToContinue();

            System.out.println("Magic portals open before you.");
            System.out.println("You can now travel freely to the places you've already been.");
            System.out.println("One final trial lies ahead.");
            System.out.println();
            System.out.println();
            System.out.println();

            // PRESS ENTER TO CONTINUE
            Item.pressEnterToContinue();

            WarlordFrame imageAct4 = null;
            WarlordFrame lastFrameBoss = null;
            imageAct4 = new WarlordFrame("imageAct4.JPG");

            int optionFourSelected4 = 0;
            int finalBossCounter = 0;
            int crossRoadsI4 = 0; // ensures message "you continue" doesn't play the first time around
            boolean firstTimeMessage4 = true;
            int count4 = 0;
            while (optionFourSelected4 < 1) {
                boolean validChoice = false;
                while (!validChoice) {
                    if (char1.charHealth > 0) {
                        if (firstTimeMessage4) {
                            System.out.println("Take step into one of the portals:");
                            firstTimeMessage4 = false;
                        }
                        if (crossRoadsI4 > 1) {
                            System.out.println("Choose a path:");
                        }
                        if (finalBossCounter == 20) {
                            try {
                                Thread.sleep(2000);
                            } catch (Exception e) {
                            }
                            System.out.println("A final portal has opened. Be careful hero, and good luck.");
                            try {
                                Thread.sleep(3000);
                            } catch (Exception e) {
                            }
                        }
                        System.out.println("1. Annihilate the monsters in the forest.");
                        System.out.println("2. Enter the dungeon of the first castle.");
                        System.out.println("3. Slay the monsters surrounding the tall tower");
                        System.out.println("4. The tower still stands, enter it and defeat the nightmares inside.");
                        System.out.println("5. Enter the cold mountain pathwaths and fight the frost demons.");
                        System.out.println("6. Elite monsters have followed your trail and are now blocking the exit. Slay them.");
                        System.out.println("7. Hellish fire burns from this portal.");

                        if (finalBossCounter > 19) { // ensures message "you continue" doesn't play the first time around
                            System.out.println("8. ??????????");
                        }
                        System.out.println("i. Open inventory.");

                        String switchBoss = scanner.nextLine();
//                    fightCountDown++;
                        switch (switchBoss) {
                            // open inventory outside battle
                            case "i":
                                // Open the character's inventory
                                inventoryObject.InventoryOverall();
                                break;
                            // _________
                            case "1":
                                Encounter xthirdEncounter = new Encounter(char1, lom.monsters1, loi.items1);
                                xthirdEncounter.performEncounter();
                                break;
                            case "2":
                                Encounter xfourthEncounter = new Encounter(char1, lom.monsters2, loi.items1);
                                xfourthEncounter.performEncounter();
                                break;
                            case "3":
                                Encounter xsixthEncounter = new Encounter(char1, lom.monsters3, loi.items1a);
                                xsixthEncounter.performEncounter();
                                break;
                            case "4":
                                Encounter xseventhEncounter = new Encounter(char1, lom.monsters4, loi.items3); // nightmare monster
                                xseventhEncounter.performEncounter();
                                break;
                            case "5":
                                Encounter xninthEncounter = new Encounter(char1, lom.monsters5, loi.items3);
                                xninthEncounter.performEncounter();
                                break;
                            case "6":
                                Encounter xtenthEncounter = new Encounter(char1, lom.monsters6, loi.items5); // Elite monsters
                                xtenthEncounter.performEncounter();
                                break;
                            case "7": // Terror monsters
                                Encounter terrorEncounter = new Encounter(char1, lom.monsters7, loi.items6);
                                terrorEncounter.performEncounter();
                                break;
                            case "8":
                                if (finalBossCounter > 19) {
                                    lastFrameBoss = new WarlordFrame("curropted.JPG");
                                    Encounter lastEncounter = new Encounter(char1, lom.finalBoss, loi.items6);
                                    lastEncounter.performEncounter();
                                    lastFrameBoss.dispose();
                                    imageAct4.dispose();
                                    System.out.println("The hero has succeded. Before him lies a corrupted soul, once a hero.");
                                    System.out.println("He takes a seat near the bloody corpse but feels no different.");
                                    System.out.println("From his wounds runs black blood. Perhaps the evil has indeed reached him?");
                                    System.out.println("With one final sigh of relief, the hero removes the helmet of the body laying before him, and puts it on.");
                                    System.out.println("Now, all that remains is hope that someone will come kill him.");
                                    System.out.println();
                                    System.out.println();
                                    System.out.println("\"Congratulations on your victory! Thank you for playing my game.\"");
                                    System.out.println(" - Made by Jakob Kvejborg 2023.");
                                    // PRESS ENTER TO CONTINUE
                                    Item.pressEnterToContinue();
                                } else {
                                    System.out.println("Error, enter a valid choice.");
                                }
                                break;

                            default:
                                System.out.println("Error, enter a valid choice.");
                                break;
                        }
                        validChoice = true;
                        if (switchBoss.equals("1") || switchBoss.equals("2") || switchBoss.equals("3") || switchBoss.equals("4") || switchBoss.equals("5") || switchBoss.equals("6") || switchBoss.equals("7")) {
                            finalBossCounter++;
                        }
                    } else {
                        System.out.println("The evil of this land overwhelm you.");
                        System.out.println();
                        System.out.println("Game Over.");
                        System.exit(0);
                    }
                    crossRoadsI4++;
                }
            }
        }
    }
}
