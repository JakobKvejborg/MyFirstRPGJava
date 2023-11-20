import java.util.*;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

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


    public static void main(String[] args) {

//_____________________________________________________________________________________________________________________________________________________________

        // MONSTER LISTS

        // RANDOM MONSTER LIST (WEAK)     // weak - common  - Warlords - normal - nightmare - Act2Boss - Frost - Act3Boss - elite - terror - hellish - corrupted
        ArrayList<Monster> monsters1 = new ArrayList<>();  // power level of monsters1 = monsters1-99
        monsters1.add(new Monster(3, 2, "Weak Goblin", 2));
        monsters1.add(new Monster(3, 1, "Weak Imp", 1));
        monsters1.add(new Monster(3, 3, "Weak Knight", 2));
        monsters1.add(new Monster(6, 1, "Weak Stone Imp", 2));
        monsters1.add(new Monster(4, 2, "Weak Soldier", 2));
        monsters1.add(new Monster(3, 3, "Weak Clayer", 3));
        monsters1.add(new Monster(7, 1, "XP Worm", 6));
        monsters1.add(new Monster(5, 1, "Weak Undead", 3));
        monsters1.add(new Monster(4, 2, "Weak Lancer", 2));
        monsters1.add(new Monster(7, 1, "Weak Bat", 3));
        monsters1.add(new Monster(3, 1, "Weak Leech", 4));
        monsters1.add(new Monster(5, 2, "Weak Stinger", 1));
        monsters1.add(new Monster(8, 1, "Weak Flesheater", 3));
        monsters1.add(new Monster(5, 1, "Weak Thief", 4));
        monsters1.add(new Monster(6, 1, "Weak Orc", 3));
        monsters1.add(new Monster(4, 2, "Weak Drake", 4));
        monsters1.add(new Monster(5, 2, "Weak Demon", 4));
        monsters1.add(new Monster(4, 1, "Weak Warlock", 2));
        monsters1.add(new Monster(4, 2, "Weak Cultist", 2));
        monsters1.add(new Monster(5, 1, "Weak Beast", 3));


        // RANDOM MONSTER LIST (COMMON)
        ArrayList<Monster> monsters2 = new ArrayList<>();
        monsters2.add(new Monster(7, 4, "Common Flayer", 8));
        monsters2.add(new Monster(11, 3, "Common Thief", 7));
        monsters2.add(new Monster(9, 3, "Common Goblin", 6));
        monsters2.add(new Monster(9, 3, "Common Knight", 6));
        monsters2.add(new Monster(11, 5, "Common Clayer", 7));
        monsters2.add(new Monster(12, 3, "Common Golem", 7));
        monsters2.add(new Monster(11, 3, "Common Stone Golem", 6));
        monsters2.add(new Monster(9, 4, "Common Undead", 8));
        monsters2.add(new Monster(11, 5, "Common Skeleton", 9));
        monsters2.add(new Monster(13, 4, "Common Demon", 10));


        // FIXED MONSTER LIST 3 BOSSES
        Monster warlordManda = new Monster(45, 12, "Warlord Manda", 20);
        Monster warlordKoold = new Monster(64, 14, "Warlord Koold", 24);
        Monster warlordYdris = new Monster(88, 20, "Warlord Ydris", 33);
        Monster act2Boss = new Monster(666, 73, "Abaddon, Fallen Angel", 80);
        Monster act3Boss = new Monster(2000, 198, "Hidden Entity", 110);
        ArrayList<Monster> warlordMandaList = new ArrayList<>();
        warlordMandaList.add(warlordManda);
        ArrayList<Monster> warlordKooldList = new ArrayList<>();
        warlordKooldList.add(warlordKoold);
        ArrayList<Monster> warlordYdrisList = new ArrayList<>();
        warlordYdrisList.add(warlordYdris);
        ArrayList<Monster> act2BossList = new ArrayList<>();
        act2BossList.add(act2Boss);
        ArrayList<Monster> act3BossList = new ArrayList<>();
        act3BossList.add(act3Boss);

        // RANDOM MONSTER LIST (NORMAL)    // weak - common  - Warlords - normal - nightmare - Act2Boss - Frost - Act3Boss - elite - terror - hellish - corrupted
        ArrayList<Monster> monsters3 = new ArrayList<>();  // power level of monsters1 = monsters1-99
        monsters3.add(new Monster(44, 22, "Normal Goblin", 24));
        monsters3.add(new Monster(66, 23, "Normal Imp", 15));
        monsters3.add(new Monster(55, 24, "Normal Knight", 22));
        monsters3.add(new Monster(32, 27, "Normal Stone Imp", 22));
        monsters3.add(new Monster(41, 20, "Normal Soldier", 41));
        monsters3.add(new Monster(63, 21, "Normal Clayer", 23));
        monsters3.add(new Monster(41, 20, "Normal Undead", 36));
        monsters3.add(new Monster(52, 27, "Normal Lancer", 31));
        monsters3.add(new Monster(43, 23, "Normal Bat", 31));
        monsters3.add(new Monster(49, 22, "Normal Leech", 25));
        monsters3.add(new Monster(48, 21, "Normal Stinger", 25));
        monsters3.add(new Monster(41, 21, "Normal Flesheater", 21));
        monsters3.add(new Monster(76, 21, "Normal Thief", 26));
        monsters3.add(new Monster(65, 21, "Normal Orc", 28));
        monsters3.add(new Monster(41, 21, "Normal Drake", 29));
        monsters3.add(new Monster(53, 21, "Normal Demon", 39));
        monsters3.add(new Monster(64, 21, "Normal Warlock", 44));
        monsters3.add(new Monster(37, 21, "Normal Cultist", 30));
        monsters3.add(new Monster(56, 22, "Normal Spawn", 22));
        monsters3.add(new Monster(33, 33, "Normal Illusion", 33));
        monsters3.add(new Monster(45, 18, "Normal Cultist", 24));
        monsters3.add(new Monster(40, 30, "Normal Beast", 40));

        // RANDOM MONSTER LIST (NIGHTMARE)
        ArrayList<Monster> monsters4 = new ArrayList<>();
        monsters4.add(new Monster(57, 94, "Nightmare Flayer", 61));
        monsters4.add(new Monster(86, 83, "Nightmare Thief", 51));
        monsters4.add(new Monster(68, 73, "Nightmare Goblin", 51));
        monsters4.add(new Monster(79, 82, "Nightmare Knight", 52));
        monsters4.add(new Monster(80, 96, "Nightmare Clayer", 63));
        monsters4.add(new Monster(110, 83, "Nightmare Golem", 44));
        monsters4.add(new Monster(191, 63, "Nightmare Stone Golem", 45));
        monsters4.add(new Monster(99, 64, "Nightmare Undead", 66));
        monsters4.add(new Monster(79, 75, "Nightmare Skeleton", 77));
        monsters4.add(new Monster(99, 64, "Nightmare Demon", 60));
        monsters4.add(new Monster(78, 100, "Nightmare Shadow", 50));
        monsters4.add(new Monster(91, 79, "Nightmare Lancer", 67));
        monsters4.add(new Monster(120, 56, "Nightmare Bat", 70));

        // RANDOM MONSTER LIST (FROST)   // weak - common  - Warlords - normal - nightmare - Act2Boss - Frost - Act3Boss - elite - terror - hellish - corrupted
        ArrayList<Monster> monsters5 = new ArrayList<>();
        monsters5.add(new Monster(131, 60, "Frost Yeti", 70));
        monsters5.add(new Monster(202, 75, "Frost Giant", 60));
        monsters5.add(new Monster(123, 80, "Frost Elemental", 50));
        monsters5.add(new Monster(154, 94, "Frost Horror", 88));

        // RANDOM MONSTER LIST ELITES
        ArrayList<Monster> monsters6 = new ArrayList<>();  // power level of monsters1 = monsters1-99
        monsters6.add(new Monster(1244, 222, "Elite Hellspawn", 114));
        monsters6.add(new Monster(1266, 223, "Elite Warlock", 115));
        monsters6.add(new Monster(1355, 224, "Elite Knight", 112));
        monsters6.add(new Monster(1255, 174, "Elite Lancer", 102));
        monsters6.add(new Monster(944, 152, "Elite Witch", 114));
        monsters6.add(new Monster(1366, 183, "Elite Skeleton", 105));
        monsters6.add(new Monster(1255, 194, "Elite Elemental", 112));
        monsters6.add(new Monster(955, 144, "Elite Shadow", 39));
        monsters6.add(new Monster(944, 200, "Elite Illusion", 47));
        monsters6.add(new Monster(1033, 230, "Elite Demon", 114));
        monsters6.add(new Monster(1233, 200, "Elite Dragon", 124));

        // RANDOM MONSTER LIST TERRORS
        ArrayList<Monster> monsters7 = new ArrayList<>();  // power level of monsters1 = monsters1-99
        monsters7.add(new Monster(1944, 202, "Terror Hellspawn", 214));
        monsters7.add(new Monster(2066, 203, "Terror Warlock", 205));
        monsters7.add(new Monster(1955, 204, "Terror Knight", 212));
        monsters7.add(new Monster(2055, 154, "Terror Lancer", 192));
        monsters7.add(new Monster(1844, 132, "Terror Witch", 214));
        monsters7.add(new Monster(2566, 153, "Terror Skeleton", 205));
        monsters7.add(new Monster(2455, 174, "Terror Elemental", 212));
        monsters7.add(new Monster(2455, 124, "Terror Shadow", 182));
        monsters7.add(new Monster(2044, 180, "Terror Illusion", 134));
        monsters7.add(new Monster(1633, 210, "Terror Demon", 214));
        monsters7.add(new Monster(1833, 190, "Terror Dragon", 234));
        monsters7.add(new Monster(1533, 130, "Terror Warlock", 164));
        monsters7.add(new Monster(1500, 240, "Terror Beast", 250));


        // FINAL BOSS MONSTER LIST
        ArrayList<Monster> finalBoss = new ArrayList<>();
        finalBoss.add(new Monster(9999, 180, "Corrupted Hero", 999));

        //__________________________________________________________________________________________________________________________________________________________________________________

        // ITEMS LISTS

        // FIXED ITEM LIST
        Item item1 = new Item(100, 1, 999, "Boots", "Boots", 999, 999, 999, 999, 999);
        Item item2 = new Item(5, 2, 5, "Armor of Strength1", "Armor", 0, 0, 0, 0, 0);
        Item item3 = new Item(1, 1, 6, "bracers", "Bracers", 0, 1, 0, 0, 0);
        Item item4 = new Item(1, 1, 1, "brace2", "Bracers", 0, 1, 1, 0, 0);
        Item item5 = new Item(0, 0, 4, "boooots", "Boots", 0, 0, 0, 0, 0);

        // RANDOM ITEM LIST 1
        ArrayList<Item> items1 = new ArrayList<>();    // power level of items = items1-99
        items1.add(new Item(1, 2, 1, "Leggings of Defense", "Leggings", 0, 0, 0, 0, 0));
        items1.add(new Item(2, 1, 1, "Helm of Strength", "Helm", 0, 0, 0, 0, 0));
        items1.add(new Item(2, 1, 2, "Armor of Health", "Armor", 0, 2, 0, 0, 0));
        items1.add(new Item(1, 2, 1, "Ring of Attributes R1", "Ring1", 0, 1, 1, 0, 1));
        items1.add(new Item(0, 2, 3, "Armor of Survival", "Armor", 0, 5, 0, 0, 0));
        items1.add(new Item(1, 1, 1, "Boots", "Boots", 0, 0, 0, 0, 0));
        items1.add(new Item(1, 1, 1, "Gloves", "Gloves", 0, 1, 0, 0, 0));
        items1.add(new Item(0, 2, 2, "Armor", "Armor", 0, 8, 0, 0, 0));
        items1.add(new Item(1, 2, 1, "Bracers of Health", "Bracers", 0, 2, 0, 0, 0));
        items1.add(new Item(0, 3, 0, "Amulet of Magic", "Amulet", 0, 2, 2, 0, 0));
        items1.add(new Item(0, 1, 0, "Small Dagger of Lifesteal RH", "WeaponR1", 0, 0, 0, 2, 12));
        items1.add(new Item(0, 2, 0, "Longsword of Rust LH", "WeaponL1", 0, 0, 0, 2, 0));
        items1.add(new Item(0, 4, 0, "Ring of Lifesteal R2", "Ring2", 0, 0, 0, 0, 10));
        items1.add(new Item(0, 1, 0, "Small Knife LH", "WeaponL1", 0, 0, 0, 1, 5));
        items1.add(new Item(0, 1, 1, "Belt of Defense", "Belt", 0, 0, 0, 0, 0));
        items1.add(new Item(0, 2, 1, "Bracers of Lifesteal", "Bracers", 0, 0, 0, 0, 10));
        items1.add(new Item(3, 2, 2, "Shoulders of Defense", "Shoulders", 0, 0, 0, 0, 0));
        items1.add(new Item(0, 1, 1, "Leggings of Health", "Leggings", 0, 5, 0, 0, 0));
        items1.add(new Item(2, 0, 2, "Shoulders of Lifesteal", "Shoulders", 0, 0, 0, 0, 12));
        items1.add(new Item(1, 0, 2, "Belt of Lifesteal", "Belt", 0, 0, 0, 0, 10));
        items1.add(new Item(4, 0, 1, "Shoulders of Strength", "Shoulders", 0, 0, 0, 0, 0));
        items1.add(new Item(0, 0, 0, "Small Axe RH", "WeaponR1", 0, 0, 0, 2, 0));
        items1.add(new Item(0, 0, 0, "Small Scythe RH", "WeaponR1", 0, 0, 0, 2, 5));
        items1.add(new Item(1, 3, 1, "Ring of Life R1", "Ring1", 0, 9, 0, 0, 0));
        items1.add(new Item(0, 2, 2, "Boots of Dust", "Boots", 0, 0, 0, 0, 0));
        items1.add(new Item(0, 0, 1, "Belt of Life", "Belt", 0, 5, 0, 0, 5));
        items1.add(new Item(0, 1, 0, "Sword of Dust LH", "WeaponL1", 0, 0, 0, 3, 7));
        items1.add(new Item(0, 2, 2, "Helm of Rust", "Helm", 0, 5, 0, 0, 0));
        items1.add(new Item(0, 1, 1, "Amulet of Rust", "Amulet", 0, 0, 1, 0, 0));
        items1.add(new Item(2, 0, 1, "Helm of Lifesteal", "Helm", 0, 6, 0, 0, 8));
        items1.add(new Item(0, 0, 1, "Ring of Silver R2", "Ring2", 0, 5, 1, 0, 0));
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);
        items1.add(null);


        // RANDOM ITEM LIST 1.A ACT 2
        ArrayList<Item> items1a = new ArrayList<>();
        items1a.add(new Item(3, 6, 2, "Ring of Sand R1", "Ring1", 0, 12, 0, 0, 0));
        items1a.add(new Item(4, 6, 4, "Boots of Sand", "Boots", 0, 8, 0, 0, 0));
        items1a.add(new Item(4, 6, 4, "Gloves of Sand", "Gloves", 0, 10, 0, 0, 5));
        items1a.add(new Item(2, 6, 6, "Armor of Sand", "Armor", 0, 5, 0, 0, 0));
        items1a.add(new Item(0, 6, 2, "Amulet of Sand", "Amulet", 0, 8, 0, 0, 5));
        items1a.add(new Item(0, 8, 0, "Claymore of Sand LH", "WeaponL1", 0, 10, 0, 3, 0));
        items1a.add(new Item(4, 8, 5, "Shoulders of Sand", "Shoulders", 0, 20, 0, 0, 13));
        items1a.add(new Item(0, 10, 0, "Dagger of Sand LH", "WeaponL1", 0, 0, 1, 4, 10));
        items1a.add(new Item(0, 7, 0, "Mace of Sand RH", "WeaponR1", 0, 10, 1, 2, 7));
        items1a.add(null);
        items1a.add(null);
        items1a.add(null);
        items1a.add(null);
        items1a.add(null);
        items1a.add(null);
        items1a.add(null);
        items1a.add(null);
        items1a.add(null);
        items1a.add(null);
        items1a.add(null);
        items1a.add(null);
        items1a.add(null);
        items1a.add(null);
        items1a.add(null);
        items1a.add(null);
        items1a.add(null);
        items1a.add(null);
        items1a.add(null);
        items1a.add(null);
        items1a.add(null);
        items1a.add(null);
        items1a.add(null);
        items1a.add(null);
        items1a.add(null);
        items1a.add(null);
        items1a.add(null);
        items1a.add(null);
        items1a.add(null);
        items1a.add(null);
        items1a.add(null);
        items1a.add(null);


        // RANDOM ITEM LIST 2
        ArrayList<Item> items2 = new ArrayList<>();    // power level of items = items1-99
        items2.add(new Item(3, 2, 6, "Helm of Defense", "Helm", 0, 2, 0, 0, 0));
        items2.add(new Item(5, 7, 10, "Armor of Level & Health", "Armor", 1, 15, 0, 0, 0));
        items2.add(new Item(3, 3, 0, "Ring of Health R1", "Ring1", 0, 30, 0, 0, 0));
        items2.add(new Item(5, 11, 12, "Armor of Iron", "Armor", 0, 0, 0, 0, 0));
        items2.add(new Item(0, 0, 0, "Giant Axe of Life RH", "WeaponR1", 0, 0, 0, 3, 10));
        items2.add(new Item(2, 4, 7, "Shoulders of Iron", "Shoulders", 0, 0, 0, 0, 0));
        items2.add(new Item(0, 7, 0, "Flame Sword LH", "WeaponL1", 0, 0, 0, 4, 0));
        items2.add(new Item(0, 3, 0, "Ring of Vitality R1", "Ring1", 0, 16, 0, 0, 0));
        items2.add(new Item(0, 8, 3, "Belt of Vitality", "Belt", 0, 25, 0, 0, 0));
        items2.add(new Item(0, 8, 4, "Boots of Defense", "Boots", 0, 15, 0, 0, 0));
        items2.add(new Item(5, 9, 5, "Bracers of Defense", "Bracers", 0, 17, 0, 0, 0));
        items2.add(new Item(0, 6, 0, "Ring of Vampire R2", "Ring2", 0, 18, 0, 0, 8));
        items2.add(new Item(0, 11, 6, "Leggings of Iron", "Leggings", 0, 13, 0, 0, 0));
        items2.add(new Item(0, 5, 0, "Claymore of Gore LH", "WeaponL1", 0, 8, 0, 4, 0));
        items2.add(new Item(6, 11, 6, "Gloves of Vitality", "Gloves", 0, 15, 0, 0, 0));
        items2.add(new Item(2, 15, 5, "Boots of Attributes", "Boots", 0, 15, 5, 0, 10));
        items2.add(new Item(6, 6, 8, "Helm of Iron", "Helm", 0, 0, 5, 0, 5));
        items2.add(new Item(0, 10, 6, "Gloves of Health", "Gloves", 0, 30, 0, 0, 0));
        items2.add(new Item(3, 13, 8, "Gloves of Vampire", "Gloves", 0, 0, 0, 0, 6));
        items2.add(new Item(0, 12, 0, "Flame Mace RH", "WeaponR1", 0, 0, 0, 4, 9));
        items2.add(new Item(2, 30, 3, "Bracers of Hunger", "Bracers", 0, 0, 0, 0, 8));
        items2.add(null);
        items2.add(null);
        items2.add(null);
        items2.add(null);
        items2.add(null);
        items2.add(null);
        items2.add(null);
        items2.add(null);
        items2.add(null);
        items2.add(null);
        items2.add(null);
        items2.add(null);
        items2.add(null);
        items2.add(null);
        items2.add(null);
        items2.add(null);
        items2.add(null);
        items2.add(null);
        items2.add(null);
        items2.add(null);
        items2.add(null);
        items2.add(null);
        items2.add(null);
        items2.add(null);
        items2.add(null);
        items2.add(null);
        items2.add(null);
        items2.add(null);
        items2.add(null);
        items2.add(null);
        items2.add(null);
        items2.add(null);
        items2.add(null);
        items2.add(null);
        items2.add(null);
        items2.add(null);

        // ITEMS LIST WARLORD GUARANTEED DROP
        ArrayList<Item> itemsWarlords = new ArrayList<>();
        itemsWarlords.add(new Item(3, 1, 2, "Helm of Blood", "Helm", 0, 10, 2, 0, 0));
        itemsWarlords.add(new Item(4, 5, 7, "Armor of Blood", "Armor", 0, 10, 4, 0, 0));
        itemsWarlords.add(new Item(2, 4, 6, "Ring of Blood R1", "Ring1", 0, 1, 3, 0, 0));
        itemsWarlords.add(new Item(4, 3, 4, "Leggings of Blood", "Leggings", 0, 8, 1, 0, 0));
        itemsWarlords.add(new Item(3, 4, 4, "Belt of Blood", "Belt", 0, 11, 2, 0, 0));
        itemsWarlords.add(new Item(2, 5, 3, "Shoulders of Blood", "Shoulders", 0, 4, 1, 0, 0));
        itemsWarlords.add(new Item(3, 3, 3, "Boots of Blood", "Boots", 0, 0, 0, 0, 7));
        itemsWarlords.add(new Item(0, 8, 0, "Amulet of Blood", "Amulet", 0, 15, 3, 0, 0));
        itemsWarlords.add(null);
        itemsWarlords.add(null);
        itemsWarlords.add(null);


        // ITEMS LIST 3
        ArrayList<Item> items3 = new ArrayList<>();    // power level of items = items1-99
        items3.add(new Item(8, 1, 3, "Helm of Strong", "Helm", 0, 0, 5, 0, 0));
        items3.add(new Item(5, 5, 14, "Armor of Illness", "Armor", 0, 0, 4, 0, 0));
        items3.add(new Item(1, 4, 8, "Ring of Defense R1", "Ring1", 0, 1, 3, 0, 5));
        items3.add(new Item(3, 3, 7, "Armor of Metal", "Armor", 0, 28, 4, 0, 0));
        items3.add(new Item(4, 4, 12, "Armor of Gold", "Armor", 0, 11, 2, 0, 0));
        items3.add(new Item(6, 9, 10, "Armor of Rock", "Armor", 0, 4, 4, 0, 0));
        items3.add(new Item(5, 3, 1, "Ring of Strength R2", "Ring2", 0, 0, 0, 0, 0));
        items3.add(new Item(0, 11, 0, "Small Dagger of Life LH", "WeaponL1", 0, 0, 0, 2, 13));
        items3.add(new Item(1, 7, 0, "Small Hammer RH", "WeaponR1", 0, 0, 0, 5, 0));
        items3.add(new Item(2, 6, 4, "Boots of Metal", "Boots", 0, 0, 0, 0, 0));
        items3.add(new Item(0, 9, 4, "Leggings of Vitality", "Leggings", 0, 23, 0, 0, 0));
        items3.add(new Item(0, 7, 0, "Amulet of Lifesteal", "Amulet", 0, 15, 0, 0, 5));
        items3.add(new Item(0, 10, 0, "Ring of Jordan R1", "Ring1", 2, 0, 0, 0, 0));
        items3.add(new Item(0, 5, 7, "Gloves of Iron", "Gloves", 0, 0, 0, 0, 0));
        items3.add(new Item(4, 11, 5, "Shoulders of Metal", "Shoulders", 0, 23, 0, 0, 0));
        items3.add(new Item(0, 10, 6, "Bracers of Metal", "Bracers", 0, 18, 0, 0, 0));
        items3.add(new Item(0, 8, 0, "Warhammer RH", "WeaponR1", 0, 0, 0, 6, 0));
        items3.add(new Item(0, 9, 4, "Amulet of Iron", "Amulet", 0, 0, 0, 0, 0));
        items3.add(new Item(0, 15, 5, "Boots of Vitality", "Boots", 0, 28, 0, 0, 0));
        items3.add(new Item(3, 21, 3, "Bracers of Vitality", "Bracers", 0, 30, 0, 0, 10));
        items3.add(new Item(0, 25, 0, "Flail of Lifesteal RH", "WeaponR1", 0, 15, 0, 4, 13));
        items3.add(new Item(5, 20, 10, "Helm of Life", "Helm", 0, 10, 0, 0, 0));
        items3.add(new Item(5, 15, 9, "Helm of Vampire", "Helm", 0, 0, 0, 0, 6));
        items3.add(new Item(0, 16, 0, "Dagger of Vampire LH", "WeaponL1", 0, 0, 1, 3, 13));
        items3.add(new Item(0, 26, 0, "Ring of Hunger R2", "Ring2", 0, 10, 2, 0, 7));
        items3.add(new Item(0, 28, 0, "Flail of Hunger LH", "WeaponL1", 0, 0, 0, 3, 15));
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);
        items3.add(null);

        // RANDOM ITEM LIST 4
        ArrayList<Item> items4 = new ArrayList<>();    // power level of items = items1-99
        items4.add(new Item(9, 8, 13, "Helm of Metal", "Helm", 0, 11, 0, 0, 0));
        items4.add(new Item(7, 7, 13, "Armor of Shadows", "Armor", 0, 24, 0, 0, 0));
        items4.add(new Item(6, 6, 11, "Ring of Plenty R2", "Ring2", 0, 20, 0, 0, 0));
        items4.add(new Item(5, 4, 13, "Armor of Glory", "Armor", 2, 16, 0, 0, 0));
        items4.add(new Item(2, 5, 0, "Giant Axe of Doom RH", "WeaponR1", 0, 0, 0, 7, 13));
        items4.add(new Item(6, 6, 7, "Boots of Iron", "Boots", 0, 0, 0, 0, 0));
        items4.add(new Item(0, 20, 0, "Ring of Wedding R1", "Ring1", 3, 0, 8, 0, 0));
        items4.add(new Item(0, 11, 0, "Claymore of Doom LH", "WeaponL1", 0, 0, 0, 8, 0));
        items4.add(new Item(7, 20, 9, "Belt of Doom", "Belt", 0, 40, 5, 9, 7));
        items4.add(null);
        items4.add(null);
        items4.add(null);
        items4.add(null);
        items4.add(null);
        items4.add(null);
        items4.add(null);
        items4.add(null);
        items4.add(null);
        items4.add(null);
        items4.add(null);
        items4.add(null);
        items4.add(null);
        items4.add(null);
        items4.add(null);
        items4.add(null);
        items4.add(null);
        items4.add(null);
        items4.add(null);
        items4.add(null);
        items4.add(null);
        items4.add(null);
        items4.add(null);
        items4.add(null);
        items4.add(null);

        // RANDOM ITEM LIST 5
        ArrayList<Item> items5 = new ArrayList<>();    // power level of items = items1-99
        items5.add(new Item(11, 25, 22, "Helm of Darkness", "Helm", 3, 21, 0, 0, 5));
        items5.add(new Item(0, 25, 11, "Bracers of Darkness", "Bracers", 0, 40, 0, 0, 0));
        items5.add(new Item(0, 25, 0, "Warhammer of Darkness RH", "WeaponR1", 0, 0, 0, 8, 0));
        items5.add(new Item(0, 25, 12, "Boots of Darkness", "Boots", 3, 30, 10, 0, 7));
        items5.add(new Item(10, 25, 14, "Belt of Darkness", "Belt", 4, 0, 5, 0, 14));
        items5.add(new Item(0, 25, 0, "Claymore of Darkness LH", "WeaponL1", 0, 0, 0, 10, 10));
        items5.add(new Item(10, 25, 13, "Leggings of Darkness", "Leggings", 0, 50, 5, 0, 8));
        items5.add(new Item(15, 25, 8, "Ring of Darkness R1", "Ring1", 3, 35, 2, 0, 10));
        items5.add(new Item(0, 25, 12, "Shoulders of Darkness", "Shoulders", 3, 25, 5, 0, 10));
        items5.add(new Item(0, 25, 5, "Amulet of Darkness", "Amulet", 4, 30, 5, 0, 8));
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);
        items5.add(null);

        // RANDOM ITEM LIST 6 CHAOS ITEMS TERROR MONSTERS
        ArrayList<Item> items6 = new ArrayList<>();    // power level of items = items1-99
        items6.add(new Item(18, 45, 25, "Helm of Chaos", "Helm", 5, 91, 0, 0, 15));
        items6.add(new Item(0, 45, 15, "Bracers of Chaos", "Bracers", 0, 60, 0, 0, 0));
        items6.add(new Item(0, 45, 0, "Warhammer of Chaos RH", "WeaponR1", 0, 0, 0, 8, 0));
        items6.add(new Item(0, 45, 17, "Boots of Chaos", "Boots", 6, 60, 10, 0, 15));
        items6.add(new Item(18, 45, 15, "Belt of Chaos", "Belt", 5, 0, 5, 0, 25));
        items6.add(new Item(0, 45, 0, "Claymore of Chaos LH", "WeaponL1", 0, 10, 0, 10, 13));
        items6.add(new Item(18, 45, 16, "Leggings of Chaos", "Leggings", 0, 70, 5, 0, 10));
        items6.add(new Item(18, 45, 7, "Ring of Chaos R1", "Ring1", 4, 75, 2, 0, 15));
        items6.add(new Item(0, 45, 13, "Shoulders of Chaos", "Shoulders", 0, 55, 5, 0, 20));
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);
        items6.add(null);


        //_____________________________________________________________________________________________________________________________________________


        // GAME START
        System.out.println("_________________________________________________________");
        System.out.println("                       Welcome to                        ");
        System.out.println("         ~~ \"A Programmers Console Adventure!\" ~~      ");
        System.out.println("                        A C T   1                        ");
        System.out.println("- Made by Jakob Kvejborg                                ");
        System.out.println("_________________________________________________________");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name for your hero:");
        String setCharName = scanner.nextLine();
        ArrayList<Item> initialItems = new ArrayList<>();


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
        Encounter firstEncounter = new Encounter(char1, monsters1, items1);
        firstEncounter.performEncounter();


        // ADDS FIXED ITEM TO CHAR
//        char1.addItem(item1); // adds the item directly to the hero // use this for testing only
//        char1.addItemToInventory(item1);  // adds item 1 to the inventory
//        System.out.println("Item \"" + item1.getItemName() + "\" dropped.");


        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }


        System.out.println();
        System.out.println("Watch out, another enemy is approaching! If you've found some gear, you might want to equip it now!");


        // SECOND FIGHT
        Encounter secondEncounter = new Encounter(char1, monsters1, items1);
        secondEncounter.performEncounter();

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
            //                                                                             ENCOUNTERS THE 3 WARLORDS
            //      ACT 1

            RpgChar character = char1; // Create an instance of RpgChar
            Encounter encounter = new Encounter(character); // Pass the character instance to Encounter
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
                    if (char1.charHealth > 0) {
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
                        if (witchMeetingCounter == 4) {
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
                                Encounter thirdEncounter = new Encounter(char1, monsters1, items1);
                                thirdEncounter.performEncounter();
                                break;

                            case "2":
                                Encounter fourthEncounter = new Encounter(char1, monsters2, items1);
                                fourthEncounter.performEncounter();
                                break;
                            case "4":
                                if (witchMeetingCounter == 4) {
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
                            case "3":
                                switch (count) {
                                    case 0:

                                        imageWarlordManda = new WarlordFrame("Manda.JPG");
                                        Encounter fifthEncounter = new Encounter(char1, warlordMandaList, itemsWarlords);    // First boss
                                        fifthEncounter.performEncounter();
                                        imageWarlordManda.dispose();
                                        break;
                                    case 1:
                                        imageWarlordKoold = new WarlordFrame("Koold.JPG");
                                        Encounter sixthEncounter = new Encounter(char1, warlordKooldList, itemsWarlords);    // Second boss
                                        sixthEncounter.performEncounter();
                                        imageWarlordKoold.dispose();
                                        break;
                                    case 2:
                                        imageWarlordYdris = new WarlordFrame("Ydris.JPG");
                                        Encounter seventhEncounter = new Encounter(char1, warlordYdrisList, itemsWarlords);   // Third boss
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
                    } else {
                        System.out.println("The evil of this land overwhelm you.");
                        System.out.println();
                        System.out.println("Game Over.");
                        System.exit(0);
                    }
                    i++;
                }
            }
            act1ForrestImage.dispose(); // closes the ACT 1 forrest image JFRAME

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
                        if (healingWellCounter >= 15) {
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
                                Encounter sixthEncounter = new Encounter(char1, monsters3, items1a);
                                sixthEncounter.performEncounter();
                                break;

                            case "2":
                                Encounter seventhEncounter = new Encounter(char1, monsters4, items3); // nightmare monster
                                seventhEncounter.performEncounter();
                                break;
                            case "4":
                                if (healingWellCounter >= 15) {
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
                                Encounter f2ifthEncounter = new Encounter(char1, act2BossList, items4);
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
            if (char1.getCharCurrentHealth() <= 0) {
                System.out.println("The demons' claws pierce your armor and deep into your chest.");
                System.out.println("Game over.");
            }
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
                                Encounter ninthEncounter = new Encounter(char1, monsters5, items3);
                                ninthEncounter.performEncounter();
                                break;

                            case "2": // ACT 3 BOSS FIGHT
                                System.out.println("Somehow, you know exactly where to look for the cave. The unspeakable horror awaits just at the end of this tunnel.");
                                System.out.println("The cave lights up, warm and welcoming. But the mere sight of the demon makes you wish you had simply stayed out in the cold and frozen to death.");
                                // PRESS ENTER TO CONTINUE
                                Item.pressEnterToContinue();
                                imageAct3Boss = new WarlordFrame("act3boss.JPG");
                                Encounter tenthEncounter = new Encounter(char1, act3BossList, items4);
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
                                Encounter xthirdEncounter = new Encounter(char1, monsters1, items1);
                                xthirdEncounter.performEncounter();
                                break;
                            case "2":
                                Encounter xfourthEncounter = new Encounter(char1, monsters2, items1);
                                xfourthEncounter.performEncounter();
                                break;
                            case "3":
                                Encounter xsixthEncounter = new Encounter(char1, monsters3, items1a);
                                xsixthEncounter.performEncounter();
                                break;
                            case "4":
                                Encounter xseventhEncounter = new Encounter(char1, monsters4, items3); // nightmare monster
                                xseventhEncounter.performEncounter();
                                break;
                            case "5":
                                Encounter xninthEncounter = new Encounter(char1, monsters5, items3);
                                xninthEncounter.performEncounter();
                                break;
                            case "6":
                                Encounter xtenthEncounter = new Encounter(char1, monsters6, items5); // Elite monsters
                                xtenthEncounter.performEncounter();
                                break;
                            case "7": // Terror monsters
                                Encounter terrorEncounter = new Encounter(char1, monsters7, items6);
                                terrorEncounter.performEncounter();
                                break;
                            case "8":
                                if (finalBossCounter > 19) {
                                    lastFrameBoss = new WarlordFrame("curropted.JPG");
                                    Encounter lastEncounter = new Encounter(char1, finalBoss, items6);
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
