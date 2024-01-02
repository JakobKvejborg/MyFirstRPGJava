import java.util.ArrayList;

public class ListOfMonsters {
    ArrayList<Monster> warlordMandaList = new ArrayList<>();
    ArrayList<Monster> warlordKooldList = new ArrayList<>();
    ArrayList<Monster> warlordYdrisList = new ArrayList<>();
    ArrayList<Monster> act2BossList = new ArrayList<>();
    ArrayList<Monster> act3BossList = new ArrayList<>();
    ArrayList<Monster> finalBoss = new ArrayList<>();
    ArrayList<Monster> monsters1 = new ArrayList<>();
    ArrayList<Monster> monsters2 = new ArrayList<>();
    ArrayList<Monster> monsters3 = new ArrayList<>();
    ArrayList<Monster> monsters4 = new ArrayList<>();
    ArrayList<Monster> monsters5 = new ArrayList<>();
    ArrayList<Monster> monsters6 = new ArrayList<>();
    ArrayList<Monster> monsters7 = new ArrayList<>();
    ArrayList<Monster> monsters8 = new ArrayList<>();

    public ListOfMonsters() {
        // FIXED MONSTER LIST BOSSES
        Monster warlordManda = new Monster(49, 10, "Warlord Manda", 20);
        Monster warlordKoold = new Monster(67, 12, "Warlord Koold", 24);
        Monster warlordYdris = new Monster(91, 18, "Warlord Ydris", 33);
        Monster act2Boss = new Monster(666, 72, "Abaddon, Fallen Angel", 88);
        Monster act3Boss = new Monster(2000, 149, "Hidden Entity", 110);
        warlordMandaList.add(warlordManda);
        warlordKooldList.add(warlordKoold);
        warlordYdrisList.add(warlordYdris);
        act2BossList.add(act2Boss);
        act3BossList.add(act3Boss);

        // FINAL BOSS MONSTER LIST
        finalBoss.add(new Monster(9999, 160, "Corrupted Hero", 999));

        // RANDOM MONSTER LIST (WEAK)     // weak - common  - Warlords - normal - nightmare - Act2Boss - Frost - Act3Boss - elite - terror - hellish - corrupted
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

        // RANDOM MONSTER LIST (NORMAL)    // weak - common  - Warlords - normal - nightmare - Act2Boss - Frost - Act3Boss - elite - terror - hellish - corrupted
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
        monsters5.add(new Monster(131, 60, "Frost Yeti", 70));
        monsters5.add(new Monster(202, 75, "Frost Giant", 60));
        monsters5.add(new Monster(123, 80, "Frost Elemental", 50));
        monsters5.add(new Monster(154, 94, "Frost Horror", 88));
        monsters5.add(new Monster(210, 91, "Frost Bohemoth", 102));

        // RANDOM MONSTER LIST ELITES
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

        // RANDOM MONSTER LIST (CORRUPTED)   // weak - common  - Warlords - normal - nightmare - Act2Boss - Frost - Act3Boss - elite - terror - hellish - corrupted
        monsters8.add(new Monster(2144, 20, "Corrupted Behemoth", 224));
        monsters8.add(new Monster(2266, 20, "Corrupted Soulless", 225));
        monsters8.add(new Monster(1955, 20, "Corrupted Nightmare", 222));
        monsters8.add(new Monster(2255, 20, "Corrupted Demon", 222));
        monsters8.add(new Monster(1944, 20, "Corrupted Knight", 234));
        monsters8.add(new Monster(2766, 20, "Corrupted Unspoken", 245));
        monsters8.add(new Monster(2655, 20, "Corrupted Warlord", 252));
        monsters8.add(new Monster(2655, 20, "Corrupted Firemaw", 182));
    }
}
