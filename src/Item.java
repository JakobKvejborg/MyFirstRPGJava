import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Item {

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


    // SCANNER PRESS ENTER TO CONTINUE METHOD
    public static String pressEnterToContinue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 'ENTER' to continue...");
        String enterToContinue8 = scanner.nextLine();
        return enterToContinue8;
    }

}

