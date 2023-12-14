import javax.swing.*;
import javax.swing.text.DefaultCaret;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.Currency;

public class GameGUI extends JFrame {

    private JTextArea roomTextArea;
    private JTextArea outputTextArea;
    private JTextArea promptTextArea;
    private JTextField inputTextField;
    private boolean inConversation;

    public void updateRoom(String text) {
        roomTextArea.setText(text);
    }

    public void printOutput(String text) {
        outputTextArea.append(text + "\n\n");
    }

    public void updatePrompt(String text) {
        promptTextArea.setText(text);
    }

    public GameGUI() {
        setTitle("Text Game");
        setSize(755, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        roomTextArea = createTextArea(5, 50);
        add(roomTextArea);

        outputTextArea = createTextArea(15, 50);
        outputTextArea.setEditable(false);
        DefaultCaret caret = (DefaultCaret) outputTextArea.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
        JScrollPane scroll = new JScrollPane(outputTextArea);
        add(scroll);

        promptTextArea = createTextArea(1, 50);
        promptTextArea.setBackground(getForeground());
        promptTextArea.setEditable(false);
        add(promptTextArea);

        inputTextField = new JTextField(50);
        inputTextField.setFont(new Font(null, Font.PLAIN, 15));
        inputTextField.addActionListener(e -> {
            // Add your updated input handling logic directly here if needed.
            // This empty listener will no longer trigger the handleInput() method.
        });
        add(inputTextField);


        setVisible(true);
    }

    private JTextArea createTextArea(int rows, int columns) {
        JTextArea textArea = new JTextArea(rows, columns);
        textArea.setFont(new Font(null, Font.PLAIN, 15));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        return textArea;
    }



  public void setConversation(boolean isConvo) {
        inConversation = isConvo;
    }

  public static void main(String[] args) {
        SwingUtilities.invokeLater(GameGUI::new);
    }

  static void room() {
      System.out.println("Room Description:");
      // Display the current room's description
      String description = RoomDescriptions.getOrDefault(Currency.currentRoom(), "No description available.");
      System.out.println(description);

      System.out.println("Items in the room:");
      // Display items in the room
      for (Item item : currentRoom.getItems()) {
          System.out.println(item.getName());
      }

      System.out.println("NPCs in the room:");
      // Display NPCs in the room
      for (NPC npc : currentRoom.getNPCs()) {
          System.out.println(npc.getName());
      }
  }
	// TODO Auto-generated method stub
	
  private static Room currentRoom;
 
  // Existing methods...

  private static Room currentRoom() {
      return currentRoom;
  }
}
