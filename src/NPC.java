import java.util.Scanner;

public class NPC {
    private String name; // NPC's name
    private String desc; // NPC's description
    private static Scanner scan = new Scanner(System.in); // Scanner for user input

    public NPC(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void say(String dialog) {
        System.out.println(name + ": " + dialog);
    }

    public void look() {
        System.out.println(desc);
    }

    public void talk() {
        System.out.println("You can't talk to " + name + ".");
    }

    public void response(int option) {
        // This method intentionally left blank.
    }

    public int getResponse(String[] options) {
        for (int i = 0; i < options.length; i++) {
            System.out.println("Option " + (i + 1) + ": " + options[i]);
        }
        System.out.println("Enter an option (1-" + options.length + "):");
        int chosenOption = scan.nextInt();
        scan.nextLine(); // Flush input buffer
        return chosenOption;
    }

    public String getDescription() {
        String description = null;
		return description;
    }
	}
