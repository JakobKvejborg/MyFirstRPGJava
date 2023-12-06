import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InventoryClass implements Serializable {
    private RpgChar character;
    Scanner inventoryScanner = new Scanner(System.in);
    private ArrayList<Item> itemsList; // Create the character with initial items
    private Item item;


    public InventoryClass(RpgChar character, ArrayList<Item> itemsList) { // itemslist skal maybe hedde RpgChar.getInventory()
        this.character = character;
        this.itemsList = new ArrayList<>();
    }


//____________________________________________________

    //    OPEN CHAR INVENTORY (this method prints out all the stats of the items when inventory is opened
    public void openCharInventory() {
        System.out.println(Encounter.magentaColor + "Inventory:" + Encounter.resetColor);
        List<Item> inventory = RpgChar.getInventory();

        if (inventory.isEmpty()) {
            System.out.println("You have no items here.");
        } else {
            for (Item item : inventory) {

                System.out.print(item.getItemName() + " ");

                if (item.getItemLevelRequirement() > character.getCharLevel()) {
                    System.out.print("lvlReq:" + item.getItemLevelRequirement() + " ");
                }

                if (item.getItemLevel() > 0) {
                    System.out.print(Encounter.brightYellowColor + "[" + item.getItemLevel() + "] " + Encounter.resetColor);
                }

                if (item.getItemAttack() > 0) {
                    System.out.print(Encounter.redColor + "[" + item.getItemAttack() + "] " + Encounter.resetColor);
                }

                if (item.getItemStrength() > 0) {
                    System.out.print(Encounter.brightBlackColor + "[" + item.getItemStrength() + "] " + Encounter.resetColor);
                }

                if (item.getItemDefense() > 0) {
                    System.out.print(Encounter.brightBlueColor + "[" + item.getItemDefense() + "] " + Encounter.resetColor);
                }

                if (item.getItemMaxHealth() > 0) {
                    System.out.print(Encounter.greenColor + "[" + item.getItemMaxHealth() + "] " + Encounter.resetColor);
                }

                if (item.getItemLifeSteal() > 0) {
                    System.out.print("[" + item.getItemLifeSteal() + "%] ");
                }
                System.out.println();
            }
        }
    }
//____________________________________________________________________


    // SHOW WHAT ITEMS THE PLAYER HAS EQUIPPED
    public void openCharEquippedInventory() {
        List<Item> equipInventory = character.getCharEquippedItems();

        if (equipInventory.isEmpty()) {
            System.out.println("You don't have any items equipped.");

        } else {
            System.out.println(Encounter.brightCyanColor + "Equipped:" + Encounter.resetColor);
            for (Item item : equipInventory) {

                System.out.print(item.getItemName() + " ");

                if (item.getItemLevelRequirement() > character.getCharLevel()) {
                    System.out.print("lvlRequirement: " + "[" + item.getItemLevelRequirement() + "] ");
                }

                if (item.getItemLevel() > 0) {
                    System.out.print(Encounter.brightYellowColor + "[" + item.getItemLevel() + "] " + Encounter.resetColor);
                }

                if (item.getItemAttack() > 0) {
                    System.out.print(Encounter.redColor + "[" + item.getItemAttack() + "] " + Encounter.resetColor);
                }

                if (item.getItemStrength() > 0) {
                    System.out.print(Encounter.brightBlackColor + "[" + item.getItemStrength() + "] " + Encounter.resetColor);
                }

                if (item.getItemDefense() > 0) {
                    System.out.print(Encounter.brightBlueColor + "[" + item.getItemDefense() + "] " + Encounter.resetColor);
                }

                if (item.getItemMaxHealth() > 0) {
                    System.out.print(Encounter.greenColor + "[" + item.getItemMaxHealth() + "] " + Encounter.resetColor);
                }

                if (item.getItemLifeSteal() > 0) {
                    System.out.print("[" + item.getItemLifeSteal() + "%] ");
                }
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("Press 'E' to equip items, 'U' to unequip items, 'R' to throw away items, 'T' to thrash entire inventory, or 'ENTER' to continue.");
    }

//________________________________________________________________________________________

    // Remove item from inventory
    public void removeItemFromInventory() {
        if (RpgChar.getInventory().isEmpty()) {
            System.out.println("You don't have any items in your inventory.");
            System.out.println();
        } else {
            System.out.println("Enter the name of the item to remove:");
            String itemNameToRemove = inventoryScanner.nextLine().toLowerCase(); // Read the name of the item to remove

            // Find the Item object with the matching name in the player's inventory
            Item itemToRemove = null;
            for (Item item : RpgChar.getInventory()) {
                if (item.getItemName().equalsIgnoreCase(itemNameToRemove)) {
                    itemToRemove = item;
                    break; // notice these breaks are because the method is called inside a switch
                }
            }
            // Check if the item was found in the player's inventory
            if (itemToRemove != null) {
                // Remove the item from the player's inventory
                RpgChar.getInventory().remove(itemToRemove);
//                                items.remove(itemToRemove); removes the item from the item list maybe?
                System.out.println("You threw the item '" + itemNameToRemove + "' away.");
                System.out.println();
            } else {
                System.out.println("Item not found in your inventory.");
                System.out.println();
            }
        }
    }

    // ___________________________________________________________________________________________

    // REMOVE ALL ITEMS FROM INVENTORY
    public void thrashAllItemsInventory() {
        List<Item> inventory = RpgChar.getInventory();

        if (RpgChar.getInventory().isEmpty()) {
            System.out.println("You don't have any items in your inventory.");
            System.out.println();
        } else {
            inventory.clear();
            System.out.println("You throw away all the items in your inventory.");
            System.out.println();
        }
    }


    //_____________________________________________________________________________________________


    // Equip item from inventory to the character with item types
    public void equipItemToCharFromInventory() {
        System.out.println("Enter the name of the item to equip:");
        String itemNameToEquip = inventoryScanner.nextLine().toLowerCase();
        ; // Read the name of the item to equip

// Find the Item object with the matching name in the player's inventory
        Item itemToEquip = null;
        Item itemToUnequip = null;

        for (Item item : RpgChar.getInventory()) { // searches the inventory for the item with the searched name
            if (item.getItemName().toLowerCase().contains(itemNameToEquip)) {
                itemToEquip = item; // sets the found item in the inventory to a tmp called itemToEquip
                break;
            }
        }

        if (itemToEquip != null && character.getCharLevel() >= itemToEquip.getItemLevelRequirement()) {
//            if (itemToEquip.getNumberOfTimesEquipped() < 1) { // Check if the item has not been equipped before

            String itemType = itemToEquip.getItemType().toLowerCase(); // if the searched item name is found in inventory the program runs the method itemToEquip.getItemType(),
            // which just returns the String itemType (which is in the item class constructor).


            // Getting info itemType on the already equipped item (equippedItem is a local variable)
            for (Item equippedItem : character.getCharEquippedItems()) { // searches through all the items equipped
                if (equippedItem.getItemType().equalsIgnoreCase(itemType)) { // if there's a match on the item already equipped and the String itemType found from the inventory item earlier
                    itemToUnequip = equippedItem; // this says: "the item you have equipped is now the item that should be unequipped".
                    break;
                }
            }

            switch (itemType) {
                case "boots":
                case "leggings":
                case "belt":
                case "armor":
                case "amulet":
                case "helm":
                case "shoulders":
                case "bracers":
                case "gloves":
                case "ring1":
                case "ring2":
                case "weaponl1":
                case "weaponr1":
                    if (itemToUnequip != null) {
                        // Unequip the existing boots and add them back to the inventory
                        character.removeItemFromCharEquipped(itemToUnequip);
                        character.addItemToInventory(itemToUnequip);
                        System.out.println("Itemtype duplicate, '" + itemToUnequip.getItemName() + "' unequipped.");
                    }


                    character.getInventory().remove(itemToEquip); // removes the item from inventory
                    unequipItemAndAddToInventory(itemType); // adds the item to inventory
                    character.addItem(itemToEquip);
                    character.addItemToCharEquipped(itemToEquip); // equips the new item to the char
                    System.out.println("Item '" + itemToEquip.getItemName() + "' equipped.");
                    System.out.println();
//                    itemToEquip.incrementTimesEquipped(); // these two methods can tell how many times an item has been equipped. Used for testing.
//                    System.out.println("Number of times equipped: " + itemToEquip.getNumberOfTimesEquipped()); // these two methods can tell how many times an item has been equipped. Used for testing.
                    break;
            }

        } else {
            System.out.println("Item not found in your inventory or you don't meet the level requirement.");
            System.out.println();
        }
    }
//    }

    // _______________________________________

    // UNEQUIP ITEM FROM CHAR MANUALLY
    public void unequipItemFromCharManually() {
        if (character.getCharEquippedItems().isEmpty()) {
            System.out.println("You don't have any items to unequip.");
            System.out.println();
        } else {
            System.out.println("Enter the name of the item to unequip:");
            String itemNameToUnequip = inventoryScanner.nextLine().toLowerCase();
            ; // read the name of the item to unequip

            Item itemToUnequip = null;
            for (Item item : character.getCharEquippedItems()) {
                if (item.getItemName().toLowerCase().contains(itemNameToUnequip)) {
                    itemToUnequip = item;
                    break;
                }
            }

            if (itemToUnequip != null) {
                // Unequip the item and add it back to the inventory
                character.removeItemFromCharEquipped(itemToUnequip);
                character.addItemToInventory(itemToUnequip);
                System.out.println("Item '" + itemToUnequip.getItemName() + "' unequipped.");
                System.out.println();
            } else {
                System.out.println("You don't have that item equipped.");
                System.out.println();
            }
        }
    }


    //______________________________________________________________

    // UNEQUIP ITEM ^ USED IN METHOD WHEN EQUIPPING ITEM

    public void unequipItemAndAddToInventory(String itemType) {
        if (character.getCharEquippedItems().isEmpty()) {
        } else {
            Item itemToUnequip = null;
            for (Item item : character.getCharEquippedItems()) {
            }
        }

    }

    //________________________________________________________________________________________________________________________________________________________________________________________

    public void handleInventoryInteraction() {
        List<Item> inventory = RpgChar.getInventory();

        // Read player's interaction choice
        String interactInventory = inventoryScanner.nextLine().toLowerCase();

        switch (interactInventory) {
            case "r":
                removeItemFromInventory();
                break;
            case "e":
                equipItemToCharFromInventory();
                break;
            case "u":
                unequipItemFromCharManually();
                break;
            case "t":
                thrashAllItemsInventory();
                break;
        }
    }

    public void InventoryOverall() {
        openCharInventory();
        openCharEquippedInventory();
        handleInventoryInteraction();
    }
}





