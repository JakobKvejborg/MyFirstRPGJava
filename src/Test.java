
    /*
    ________________________________________________________________________________________________________________
    HASHMAP TEST
    import java.util.HashMap;
import java.util.Map;

public class RPGChar {
    private Map<String, Boolean> equippedItemTypes;

    // Constructor
    public RPGChar() {
        equippedItemTypes = new HashMap<>();
    }

    // Method to set the type of an equipped item to true
    public void setItemTypeEquipped(String itemType, boolean isEquipped) {
        equippedItemTypes.put(itemType, isEquipped);
    }

    // Method to check if a specific item type is equipped
    public boolean isItemTypeEquipped(String itemType) {
        return equippedItemTypes.getOrDefault(itemType, false);
    }

    // Other methods and properties of your RPGChar class
    // ...
}


// ... Encounter Class

if (character.canEquipItemType(itemToEquip.getItemType())) {
    if (character.isItemTypeEquipped(itemToEquip.getItemType())) {
        System.out.println("You already have this item type equipped.");
    } else {
        // Equip the item
        character.addItemToCharEquipped(itemToEquip);
        System.out.println("Item '" + itemToEquip.getItemName() + "' equipped.");
        System.out.println();
        character.getInventory().remove(itemToEquip);

        // Set the item type as equipped
        character.setItemTypeEquipped(itemToEquip.getItemType(), true);
    }
} else {
    // The character can't equip this item type
    System.out.println("You cannot equip this type of item.");
}

// ... (remaining code)


_________________________________________________________________________________________________________________________








// monster deals damage
     if (enemyDamage > 0) {

                            System.out.println("The enemy attacks you and deals " + encounteredMonster.getMonsterAttack() + " damage.");
                            System.out.println("Your armor blocks " + character.getCharDefense() + " damage.");
                            playerHealth = playerHealth - enemyDamage;
                            character.charHealth = playerHealth;
                            System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);     // the 'if' statement is armor-based
                        } else {  // PLAYER ARMOR IS HIGHER THAN ENEMY'S DAMAGE
                            System.out.println("The enemy can't penetrate your armor, you block all " + encounteredMonster.getMonsterAttack() + " damage.");
                            System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);
                        }
                    }














// the game finds the monstername automatic
String monsterNameLowerCase = encounteredMonster.getMonsterName().toLowerCase();
//                            int modifiedDamage = 0;  // Initialize a variable to store modified damage

                            if (monsterNameLowerCase.contains("normal")) {
                                System.out.println("You encountered a normal monster!");
                                enemyDamage = enemyDamage + randomDamageModifierWarlords();  // Calculate modified damage for the "boss" monster
                            } else {
                                enemyDamage = enemyDamage;  // Default case for normal monsters
                            }






















    String options = scanner.next();
        switch (options){
        case "1":



 ///             PRESS Y TO CONTINUE ACTUALLY WORKING!!! YEAH!!
String y;
        while (true) {
            System.out.println("Enter 'y' when you are ready to continue.");
            y = scanner.nextLine().toLowerCase();
            if (y.equals("y")) {
                System.out.println();
                break; // Break out of the loop when "y" is entered
            } else {
                System.out.println();
            }
        }







   // Random item
            int randomItemIndex = random.nextInt(items.size());
            Item useless = items.get(randomItemIndex);
            Item droppedItem = items.get(randomItemIndex);
            char1.addItem(droppedItem);
            System.out.println("Name:" + setCharName + "  Strength:" + char1.charStrength + "  Level:" + char1.getLevel() + "  Attack:" + char1.charAttack + "  Defense:" + char1.charDefense + "  Health:" + char1.charHealth);



  // END COMBAT  / EXPERIENCE
        int experiencePointsGained = encounteredMonster.monsterExperience;
        char1.addExperience(experiencePointsGained);
        // Check for level up
        char1.charCheckLevelUp();





        // something
        System.out.println("___________________________________");
            System.out.println("'A' to attack - 'M' to use magic");
            System.out.println("'B' to block  - 'I' to open inventory.");
            System.out.println("___________________________________");








// WORKING ENCOUNTER
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class Encounter {
    private RpgChar character;
    private ArrayList<Monster> monsters;
    private ArrayList<Item> items;

    Scanner scanner = new Scanner(System.in);

    // Constructor
    public Encounter(RpgChar character, ArrayList<Monster> monsters, ArrayList<Item> items) {
        this.character = character;
        this.monsters = monsters;
        this.items = items;
    }

    // MONSTER SPAWNER
    public void performEncounter() {  // Randomly selects a monster for the encounter
        Random random2 = new Random();
        int randomMonsterIndex = random2.nextInt(monsters.size());
        Monster encounteredMonster = monsters.get(randomMonsterIndex);

        System.out.println();
        System.out.println(encounteredMonster.getMonsterName() + " (" + encounteredMonster.getMonsterHealth() + ")");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }


        System.out.println("___________________________________");
        System.out.println("'A' to attack - 'M' to use magic");
        System.out.println("'B' to block  - 'I' to open inventory.");
        System.out.println("___________________________________");

        // COMBAT
        while (character.charHealth > 0 && encounteredMonster.getMonsterHealth() > 0) {

            String combatOptions = scanner.nextLine();
            int playerHealth = character.charHealth;
            int enemyHealth = encounteredMonster.getMonsterHealth();

            switch (combatOptions) {
                case "a":
                    int playerDamage = (character.charAttack + character.charStrength) * character.charLevel;
                    int enemyDamage = encounteredMonster.getMonsterAttack();
                    System.out.println("You attack and deal " + playerDamage + " damage.");
                    System.out.println();
                    enemyHealth -= playerDamage;
                    character.charHealth = playerHealth; // updates character's health after each enemy attack
                    encounteredMonster.setMonsterHealth(enemyHealth);
                    System.out.println(encounteredMonster.getMonsterName() + " (" + encounteredMonster.getMonsterHealth() + ")");

                    if (enemyHealth <= 0) {
                        System.out.println();
                        System.out.println("You defeated the " + encounteredMonster.getMonsterName() + "!");
                        System.out.println("You gained " + encounteredMonster.monsterExperience + " XP");
                        monsters.remove(randomMonsterIndex);
                        character.charGainExperience(encounteredMonster);  // XP gained
                        System.out.println("Name:" + character.charName + "  Strength:" + character.charStrength + "  Level:" + character.charLevel + "  Attack:" + character.charAttack + "  Defense:" + character.charDefense + "  Health:" + character.charHealth + "  XP:" + character.charExperiencePoints);
                        System.out.println();
                        break;
                    } else {
                        System.out.println("The enemy attacks you and deals " + encounteredMonster.getMonsterAttack() + " damage.");
                        playerHealth = playerHealth - enemyDamage;
                        character.charHealth = playerHealth;
                        System.out.println(character.getCharName() + " (" + playerHealth + ")");
                    }

                    if (playerHealth <= 0) {
                        System.out.println();
                        System.out.println("You were defeated. Your ashes will be scattered across the land but your name will be forgotten. Game Over.");
                        System.exit(0);
                        break;
                    }

                default:
                    break;


            }

        }
    }
}





 /// FIGHT IN MAIN
// FIGHT02
        System.out.println("Enter your choice: ");
        System.out.println("1. Enter the forest and fight lesser enemies.");
        System.out.println("2. Enter the dungeon and search for evil.");
        System.out.println("3. Go to the Castle in the distance in hope of defeating one of the Warlords.");
        String hey3 = scanner.nextLine();
        switch (hey3) {
            case "1":
                Encounter thirdEncounter = new Encounter(char1, monsters1, items1);
                thirdEncounter.performEncounter();
                break;
            case "2":
                Encounter fourthEncounter = new Encounter(char1, monsters2, items1);
                fourthEncounter.performEncounter();
                break;
            case "3":
                Encounter fifthEncounter = new Encounter(char1, monsters3, items3);
                fifthEncounter.performEncounter();
                break;
            default:
                System.out.println();
                break;
        }






 // woorking lifesteal
                    if (character.charLifeSteal > 0) {
                        int combatLifeSteal = character.getItemLifeSteal();
                        int lifeStealAmount = combatLifeSteal;
                        character.charHealth += lifeStealAmount;

                        System.out.println("You lifesteal: " + combatLifeSteal + " hp.");
                       // character.charHealth = playerHealth;
                    }
                    playerHealth = playerHealth + character.charLifeSteal;
                    System.out.println(encounteredMonster.getMonsterName() + " (" + enemyHealth + ")");



___________________________________________________________________________
// WORKING JFRAME IMAGES
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WarlordFrame extends JFrame {

    public WarlordFrame(String imagePath) {
        super("Warlord Image"); // Set the frame title

        // Load the image
        ImageIcon imageIcon = new ImageIcon(imagePath);

        // Create a JLabel to display the image
        JLabel imageLabel = new JLabel(imageIcon);

        // Set the frame size to match the image size
        setSize(imageIcon.getIconWidth(), imageIcon.getIconHeight());

        // Add the JLabel to the frame
        add(imageLabel);

        // Make the frame visible
        setVisible(true);

        // Close the application when the frame is closed
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setFocusableWindowState(false);
        setVisible(true);
        setFocusableWindowState(true);
    }
}

_______________________________________________________________________
CASE 3 Working
    case "3":
                            switch (count) {
                                case 0:
//                                    WarlordFrame imageWarlordManda = new WarlordFrame("C:\\Users\\Kvaj\\IdeaProjects\\Radiator\\MainFolder\\MyFirstRPG\\src\\Manda.JPG");
                                    Encounter fifthEncounter = new Encounter(char1, warlordMandaList, items3);    // First boss
                                    fifthEncounter.performEncounter();
                                    break;
                                case 1:
//                                    WarlordFrame imageWarlordKoold = new WarlordFrame("C:\\Users\\Kvaj\\IdeaProjects\\Radiator\\MainFolder\\MyFirstRPG\\src\\Koold.png");
                                    Encounter sixthEncounter = new Encounter(char1, warlordKooldList, items3);    // Second boss
                                    sixthEncounter.performEncounter();
                                    break;
                                case 2:
//                                    WarlordFrame imageWarlordYdris = new WarlordFrame("C:\\Users\\Kvaj\\IdeaProjects\\Radiator\\MainFolder\\MyFirstRPG\\src\\Ydris.JPG");
                                    Encounter seventhEncounter = new Encounter(char1, warlordYdrisList, items3);   // Third boss
                                    seventhEncounter.performEncounter();
                                    break;
                            }
                            optionThreeSelected++;
                            count++;
                            if (optionThreeSelected >= 3) {  // progresses the story
                                break;
                            }
                            break;
____________________________________________________________________________________________

     */




   // JLABEL + JFRAME
        /*
        JLabel label = new JLabel();
        label.setText("help me");
        JFrame frame = new JFrame(); // creates a frame
        frame.setVisible(true); // make frame visible
        frame.setSize(420, 420); // this sets the x- and y-dimension of the frame
        frame.setTitle("JFrame title goes here"); // this sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit the application when X is pressed
        frame.setResizable(false); // frame cannot be resized
        frame.add(label);

    // ImageIcon image = new ImageIcon("demon.jpg");  // this will create an image icon
    // frame.setIconImage(image.getImage());  // changes the icon of the frame
    // frame.getContentPane().setBackground(new Color(20, 12, 15));  // changes the color background of the frame














//________________________________________________________________________

//MONSTER DEALS DAMAGE + RANDOM DAMAGE MODIFIER WORKING

// MONSTER DEALS DAMAGE
                        String monsterNameLowerCase = encounteredMonster.getMonsterName().toLowerCase();

                        if (monsterNameLowerCase.contains("warlord")) {
                            if (enemyDamage > 0) {
                                System.out.println("The enemy attacks you and deals " + (encounteredMonster.getMonsterAttack() + randomDamageModifierWarlord()) + " damage.");
                                System.out.println("Your armor blocks " + character.getCharDefense() + " damage.");
                                playerHealth = playerHealth - (enemyDamage + randomDamageModifierWarlord());
                                character.charHealth = playerHealth;
                                System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);     // the 'if' statement is armor-based
                            } else {  // PLAYER ARMOR IS HIGHER THAN ENEMY'S DAMAGE
                                System.out.println("The enemy can't penetrate your armor, you block all " + (encounteredMonster.getMonsterAttack() + randomDamageModifierWarlord()) + " damage.");
                                System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);
                            }
                        } else {
                            if (monsterNameLowerCase.contains("weak")) {
                                if (enemyDamage > 0) {
                                    System.out.println("The enemy attacks you and deals " + encounteredMonster.getMonsterAttack() + " damage.");
                                    System.out.println("Your armor blocks " + character.getCharDefense() + " damage.");
                                    playerHealth = playerHealth - enemyDamage;
                                    character.charHealth = playerHealth;
                                    System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);     // the 'if' statement is armor-based
                                } else {  // PLAYER ARMOR IS HIGHER THAN ENEMY'S DAMAGE
                                    System.out.println("The enemy can't penetrate your armor, you block all " + encounteredMonster.getMonsterAttack() + " damage.");
                                    System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);
                                }
                            } else {
                                if (monsterNameLowerCase.contains("common")) {
                                    if (enemyDamage > 0) {
                                        System.out.println("The enemy attacks you and deals " + encounteredMonster.getMonsterAttack() + " damage.");
                                        System.out.println("Your armor blocks " + character.getCharDefense() + " damage.");
                                        playerHealth = playerHealth - enemyDamage;
                                        character.charHealth = playerHealth;
                                        System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);     // the 'if' statement is armor-based
                                    } else {  // PLAYER ARMOR IS HIGHER THAN ENEMY'S DAMAGE
                                        System.out.println("The enemy can't penetrate your armor, you block all " + encounteredMonster.getMonsterAttack() + " damage.");
                                        System.out.println(character.getCharName() + getHealthColor(playerHealth) + " (" + playerHealth + ")" + resetColor);
                                    }
                                }
                            }
                        }
                    }
//___________________________________________________________________________________________________________________________



// A FUN LITTLE FOR LOOP
   for (int i = 0; i <= 3; i++) {  // initialize the variable i; the loop will continue as long as 'i' is less than or equal to 3; i gets one bigger each time the loop runs.
            System.out.println("Hej 4 gange!");
            if (i == 0) {
                System.out.println("Hello second time!");
            } else if (i == 1) {
                System.out.println("hello a fourth time!");
            }
        }
_____________________________________________________



         */





