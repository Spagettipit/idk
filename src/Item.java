import java.util.ArrayList;

public class Item {
    private String name;
    private String desc;
    private boolean heavy;
    private boolean used;

    public Item(String n) {
        name = n;
        heavy = false;
        used = false;
    }

    public void setHeavy(boolean b) {
        heavy = b;
    }

    public boolean isHeavy() {
        return heavy;
    }

    public void setDesc(String d) {
        desc = d;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean b) {
        used = b;
    }

    public void look() {
        System.out.println(desc);
    }

    public void use() {
        System.out.println("You can't use the " + name + ", yet...");
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }

 private String rename;
 private String description;

 public Item(String name, String description) {
     this.name = name;
     this.description = description;
 }

 public String getrename() {
     return name;
 }

 public String getDescription() {
     return description;
 }



	 public static Item crypticKey = new Item("Cryptic Key", "Unlocks a hidden room in the basement.");
	 public static Item mapPiece1 = new Item("Torn Map Piece 1", "Part of a map leading to the secret chamber.");
	 public static Item mapPiece2 = new Item("Torn Map Piece 2", "Part of a map leading to the secret chamber.");
	 public static Item candlestick = new Item("Candlestick", "Required to illuminate a dark passage.");
	 public static Item magnifyingGlass = new Item("Magnifying Glass", "Helps decipher cryptic inscriptions.");
	 public static Item artifactFragment = new Item("Artifact Fragment", "Uncover these fragments to piece together the archaeologist's discovery.");

	 // Create an ArrayList to hold the player's inventory
	 public static ArrayList<Item> inventory = new ArrayList<>();

 // Your other methods...
}


