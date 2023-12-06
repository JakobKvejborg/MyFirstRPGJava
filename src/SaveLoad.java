import java.io.*;
import java.util.Scanner;

public class SaveLoad {

    // Method to save game
    public void saveGame(RpgChar char1) {
        if (char1 == null) {
            System.out.println("Character is null. Cannot save.");
            return;
        }

        System.out.println("Do you want to save the game? y/n: ");
        Scanner saveScanner = new Scanner(System.in);
        String saveSwitch = saveScanner.nextLine();

        switch (saveSwitch) {
            case "y":
                try {
                    FileOutputStream fileOut = new FileOutputStream("saveGame.ser");
                    ObjectOutputStream out = new ObjectOutputStream(fileOut);

                    // Serialize and write the game state
                    out.writeObject(char1); // Serialize the RpgChar instance
                    out.writeObject(char1.everyStatForSaving());

                    out.close();
                    fileOut.close();
                    System.out.println("Game saved!");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "n":
                break;
            default:
                break;
        }
    }

    
    // Method to load a saved game
    public void loadGame(RpgChar char1) {
        System.out.println("Do you want to load a game? y/n: ");
        Scanner loadScanner = new Scanner(System.in);
        String loadSwitch = loadScanner.nextLine();
        switch (loadSwitch) {
            case "y":
                try {
                    FileInputStream fileIn = new FileInputStream("saveGame.ser");
                    ObjectInputStream in = new ObjectInputStream(fileIn);

                    // Deserialize and read the game state
                    RpgChar loadedCharacter = (RpgChar) in.readObject(); // Deserialize the RpgChar instance
                    char1.setCharName(loadedCharacter.getCharName());
                    // ... (deserialize other necessary game state)

                    in.close();
                    fileIn.close();
                    System.out.println("Game loaded successfully.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "n":
                break;
            default:
                break;
        }
    }


}
