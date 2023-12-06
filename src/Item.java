import java.io.Serializable;
import java.util.Scanner;

public class Item implements Serializable {

    private int itemStrength;
    private int itemLevelRequirement;
    private int itemDefense;
    private String itemName;
    private String itemType;
    private int itemLevel;
    private int itemMaxHealth;
    private int itemMagic;
    private int itemAttack;
    private double itemLifeSteal;
    private boolean itemIsEquipped;
    private int numberOfTimesEquipped; // used for testing only


    // ITEM CONSTRUCTOR
    public Item(int itemStrength, int itemLevelRequirement, int itemDefense, String itemName, String itemType, int itemLevel, int itemMaxHealth, int itemMagic, int itemAttack, double itemLifeSteal) {
        this.itemLevelRequirement = itemLevelRequirement;
        this.itemDefense = itemDefense;
        this.itemName = itemName;
        this.itemType = itemType;
        this.itemLevel = itemLevel;
        this.itemStrength = itemStrength;
        this.itemMaxHealth = itemMaxHealth;
        this.itemMagic = itemMagic;
        this.itemAttack = itemAttack;
        this.itemLifeSteal = itemLifeSteal;
        // this.itemIsEquipped = false;
    }

    // ITEM CONSTRUCTOR (OVERLOADED, USED FOR TESTING NUMBEROFTIMESEQUIPPED)
    public Item(int itemStrength, int itemLevelRequirement, int itemDefense, String itemName, String itemType, int itemLevel, int itemMaxHealth, int itemMagic, int itemAttack, double itemLifeSteal, int numberOfTimesEquipped) {
        this.itemLevelRequirement = itemLevelRequirement;
        this.itemDefense = itemDefense;
        this.itemName = itemName;
        this.itemType = itemType;
        this.itemLevel = itemLevel;
        this.itemStrength = itemStrength;
        this.itemMaxHealth = itemMaxHealth;
        this.itemMagic = itemMagic;
        this.itemAttack = itemAttack;
        this.itemLifeSteal = itemLifeSteal;
        this.numberOfTimesEquipped = numberOfTimesEquipped;
    }



    // METHOD TO EQUIP ITEM
    public void equip() {
        itemIsEquipped = true;
    }

    // METHOD TO UNEQUIP ITEM
    public void unEquip() {
        itemIsEquipped = false;
    }

    // METHOD TO SEE IF ITEM IS EQUIPPED
    public boolean itemIsEquipped() {
        return itemIsEquipped;
    }


    // ITEM SETTERS & GETTERS
    public int getItemLevelRequirement() {
        return itemLevelRequirement;
    }


    public String getItemName() {
        return itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public int getItemDefense() {
        return itemDefense;
    }

    public int getItemLevel() {
        return itemLevel;
    }

    public int getItemMaxHealth() {
        return itemMaxHealth;
    }

    public int getItemStrength() {
        return itemStrength;
    }

    public int getItemMagic() {
        return itemMagic;
    }

    public int getItemAttack() {
        return itemAttack;
    }

    public double getItemLifeSteal() {
        return itemLifeSteal;
    }
    public int getNumberOfTimesEquipped() {
        return numberOfTimesEquipped;
    }

    public void incrementTimesEquipped() {
        numberOfTimesEquipped++;
    }

    // SCANNER PRESS ENTER TO CONTINUE METHOD
    public static void pressEnterToContinue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 'ENTER' to continue...");
        String enterToContinue8 = scanner.nextLine();
    }


}

