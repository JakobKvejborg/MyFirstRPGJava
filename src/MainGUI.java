//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
//import java.util.List;
//
//public class MainGUI implements ActionListener {
//
//    private JFrame frame;
//    private JButton buttonAttack;
//    private JButton buttonForest;
//    private JButton buttonCastle;
//    private JLabel label;
//    private RpgChar character;
//    private Encounter currentEncounter;
//    private int encounterCount;
//    private ListOfMonsters listOfMonsters;
//
//    public MainGUI(ListOfMonsters listOfMonsters) {
//        this.listOfMonsters = listOfMonsters;
//
//        frame = new JFrame("Hero Corrupted - GUI Edition");
//        buttonAttack = new JButton("Attack");
//        buttonForest = new JButton("Enter Forest");
//        buttonCastle = new JButton("Go to Castle");
//        label = new JLabel();
//
//        buttonAttack.addActionListener(this);
//        buttonForest.addActionListener(this);
//        buttonCastle.addActionListener(this);
//
//        JPanel panel = new JPanel();
//        panel.setLayout(new GridLayout(4, 1));
//        panel.add(buttonAttack);
//        panel.add(buttonForest);
//        panel.add(buttonCastle);
//        panel.add(label);
//
//        frame.add(panel);
//        frame.setSize(400, 200);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//
//        character = new RpgChar(1, 1, 1, 0, "DefaultName", 35, 0, 0, new ArrayList<>(), 0, new ArrayList<>(), new ArrayList<>(), 0);
//        encounterCount = 0;
//        updateLabel("Welcome to Hero Corrupted - GUI Edition!");
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == buttonAttack) {
//            performEncounter();
//        } else if (e.getSource() == buttonForest) {
//            updateLabel("Entering the forest. Prepare for a new encounter!");
//            performEncounter();
//        } else if (e.getSource() == buttonCastle) {
//            updateLabel("Approaching the castle. Get ready for a challenging encounter!");
//            performEncounter();
//        }
//    }
//
//    private void performEncounter() {
//        currentEncounter = new Encounter(character, (ArrayList<Monster>) getMonsterList(), (ArrayList<Item>) getItemList());
//        currentEncounter.performEncounter();
//        encounterCount++;
//
//        if (encounterCount == 3) {
//            updateLabel("Congratulations! You have reached the castle!");
//            frame.dispose();
//        } else {
//            updateLabel("Next encounter! Choose your action:");
//        }
//
//        gameOver();
//    }
//
//    private List<Monster> getMonsterList() {
//        switch (encounterCount) {
//            case 1:
//                return listOfMonsters.monsters1;
//            case 2:
//                return listOfMonsters.monsters2;
//            case 3:
//                return listOfMonsters.monsters3;
//            // Add more cases as needed
//            default:
//                return new ArrayList<>(); // Return an empty list for unknown encounters
//        }
//    }
//
//    private List<Item> getItemList() {
//        // Logic to determine the appropriate item list based on the encounterCount
//        // For simplicity, using the same item list for each encounter
//        return new ArrayList<>(); // Replace with your logic
//    }
//
//    private void updateLabel(String newText) {
//        label.setText(newText);
//    }
//
//    private void gameOver() {
//        if (character.getCharCurrentHealth() <= 0) {
//            updateLabel("Game Over. Your hero has been defeated.");
//        }
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> new MainGUI(new ListOfMonsters()));
//    }
//}
