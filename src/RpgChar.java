import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RpgChar implements Serializable {

    public int charStrength;
    public int charLevel;
    public int charAttack;
    public int charDefense;
    public String charName;
    public int charHealth;
    public int charMagic;
    public ArrayList<Item> items = new ArrayList<>();
    public int charExperiencePoints;
    public static ArrayList<Item> charInventory;
    public int charLifeSteal;
    private List<Item> inventory;
    //    private ArrayList<Item> charEquippedItems;
    private List<Item> charEquippedItems = new ArrayList<>();
    private boolean isBootsEquipped;
    private int charMaxHealth;
    private int charMaxExperiencePoints;


    // RPGCHAR CONSTRUCTOR
    public RpgChar(int charStrength, int charLevel, int charAttack, int charDefense, String charName, int charHealth, int charMagic, int charExperiencePoints, ArrayList<Item> charInventory, int charLifeSteal, ArrayList<Item> charEquippedItems, List<Item> initialEquippedItems, int charMaxExperiencePoints) {
        this.charStrength = charStrength;
        this.charLevel = charLevel;
        this.charAttack = charAttack;
        this.charDefense = charDefense;
        this.charName = charName;
        this.charHealth = charHealth;
        this.charMagic = charMagic;
        this.charExperiencePoints = charExperiencePoints;
        RpgChar.charInventory = charInventory;
        this.charLifeSteal = charLifeSteal;
        this.inventory = new ArrayList<>();
        this.charEquippedItems = new ArrayList<>(initialEquippedItems);
        this.charMaxHealth = 35;
        this.charMaxExperiencePoints = charMaxExperiencePoints;
    }


    // TEXT COLOR
    String blueColor = "\u001B[34m";
    String resetColor = "\u001B[0m";

    public RpgChar() {

    }


    // XP GAIN
    public void charGainExperience(Monster encounteredMonster) {
        int experienceGained = encounteredMonster.getMonsterExperience();
        addExperience(experienceGained);
    }

    public void addExperience(int charExperiencePoints) {
        this.charExperiencePoints += charExperiencePoints;
        if (this.charExperiencePoints >= 10 * charLevel) {
            this.charLevel++;
            System.out.println(blueColor + "You leveled up!" + resetColor);
            this.charExperiencePoints = 0;
        }
    }


    // RPGCHAR GETTERS & SETTERS

    public void setCharHealth(int charHealth) {
        this.charHealth = charHealth;
    }

    public String getCharName() {
        return charName;
    }

    public int getCharLevel() {
        return charLevel;
    }

    public int getCharStrength() {
        return charStrength;
    }

    public int getCharAttack() {
        return charAttack;
    }

    public int getCharDefense() {
        return charDefense;
    }

    public int getCharCurrentHealth() {
        return charHealth;
    }

    public int getCharMaxExperiencePoints() {
        return 10 * charLevel;
    }

    public int getTotalLevel() {
        return charLevel + getItemLevel();
    }

    public int getCharMaxHealth() {
        return charMaxHealth + (5 * getCharLevel() * getCharLevel() / 10);
    }

    public int getTotalStrength() {
        return charStrength + getItemStrength();
    }

    public int getTotalDefense() {
        return charDefense + getItemDefense();
    }

    public static List<Item> getInventory() {
        return charInventory; // changed from: "return inventory"
    }

    public List<Item> getCharEquippedItems() {
        return charEquippedItems;
    }

    public int getCharMagic() {
        return charMagic;
    }

    public void setIsBootsEquipped(boolean equipped) {
        this.isBootsEquipped = equipped;
    }

    public int getCharLifeSteal() {
        return charLifeSteal;
    }

    public int getItemLevel() {
        int result = 0;
        for (Item itemList : items) {
            result = result + itemList.getItemLevel();
        }
        return result;
    }

    public int getItemMaxHealth() {
        int result = 0;
        for (Item itemList : items) {
            result = result + itemList.getItemMaxHealth();
        }
        return result;
    }

    public int getItemStrength() {
        int result = 0;
        for (Item itemList : items) {
            result = result + itemList.getItemStrength();
        }
        return result;
    }

    public int getItemDefense() {
        int result = 0;
        for (Item itemList : items) {
            result = result + itemList.getItemDefense();
        }
        return result;
    }

    public int getItemAttack() {
        int result = 0;
        for (Item itemList : items) {
            result = result + itemList.getItemAttack();
        }
        return result;
    }

    public double getItemLifeSteal() {
        double result = 0;
        for (Item itemList : items) {
            result = result + itemList.getItemLifeSteal();
        }
        return result;
    }

    public int getItemMagic() {
        int result = 0;
        for (Item itemList : items) {
            result = result + itemList.getItemMagic();
        }
        return result;
    }


    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItemToInventory(Item item) {
        charInventory.add(item);
    }

    public void addItemToCharEquipped(Item item) {
        charEquippedItems.add(item);
    }


    // SETTERS
    public void setCharName(String charName) {
        this.charName = charName;
    }


    // FIXED ITEM ADD TO CHAR
    public void addItem(Item charItem) {
        if (charItem != null && getCharLevel() >= charItem.getItemLevelRequirement()) {
            charDefense += charItem.getItemDefense(); // Update character's defense with item defense
            charStrength += charItem.getItemStrength(); // Update character's strength with item strength
            charHealth = charHealth;
            charMaxHealth += charItem.getItemMaxHealth(); // health
            charMagic += charItem.getItemMagic(); // adds the dropped items magic stat to the char
            charAttack += charItem.getItemAttack();
            charLifeSteal += charItem.getItemLifeSteal();
            charLevel += charItem.getItemLevel();
            items.add(charItem);
        } else if (charItem != null) {
            System.out.println("You don't meet the level requirement yet.");
        }
    }

    // THIS WHOLE SHIT IS JUST FOR FUCKING UNEQUIPPING AN ITEM
    public void removeItemFromCharEquipped(Item charItem) {
        if (charEquippedItems.contains(charItem)) {
            charEquippedItems.remove(charItem);                // THIS WHOLE THING REVERTS THE ATTRIBUTES OF THE ITEM
            charDefense -= charItem.getItemDefense();
            charStrength -= charItem.getItemStrength();
            charHealth = charHealth;
            charMaxHealth -= charItem.getItemMaxHealth();
            charMagic -= charItem.getItemMagic();
            charAttack -= charItem.getItemAttack();
            charLifeSteal -= charItem.getItemLifeSteal();
            charLevel -= charItem.getItemLevel();
            items.remove(charItem);
        }
    }

    public Serializable everyStatForSaving() {
        // Create a Serializable object (can be a Map, custom class, etc.) to store all necessary stats
        Map<String, Serializable> characterStats = new HashMap<>();

        // Add all necessary character stats to the map
        characterStats.put("charStrength", charStrength);
        characterStats.put("charLevel", charLevel);
        characterStats.put("charAttack", charAttack);
        characterStats.put("charDefense", charDefense);
        characterStats.put("charName", charName);
        characterStats.put("charHealth", charHealth);
        characterStats.put("charMagic", charMagic);
        characterStats.put("charExperiencePoints", charExperiencePoints);
        characterStats.put("charLifeSteal", charLifeSteal);
        characterStats.put("charInventory", charInventory);
        characterStats.put("charEquippedItems", (Serializable) charEquippedItems);

        // Return the Serializable object containing all the character's stats
        return (Serializable) characterStats;
    }

}
