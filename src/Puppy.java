public class Puppy extends NPC {
    private int talkCount; // To track how many times the player talks to the puppy

    public Puppy() {
        super("puppy", "An adorable puppy wags its tail.");
        talkCount = 0;
    }

    @Override
    public void talk() {
        talkCount++;

        if (talkCount == 1) {
            say("Hi! I'm an adorable puppy!");
            String[] options = {
                    "Yes you are! Who's a good boy?",
                    "Ew, no. You're actually kinda hideous."
            };
            int response = getResponse(options);
            response(response);
        } else if (talkCount == 2) {
            say("Hey! Wanna play fetch? Say yes! Say yes!");
            String[] options = {
                    "Yes! I love fetch!",
                    "No. I am a horrible person and don't like playing with puppies."
            };
            int response = getResponse(options);
            response(response);
        } else {
            say("Yip! *wags tail*");
        }
    }

    @Override
    public void response(int option) {
        if (talkCount == 1) {
            switch (option) {
                case 1:
                    say("I am! I'm a good boy!");
                    break;
                case 2:
                    say("I am too adorable! Why are you so mean?");
                    System.out.println("The puppy bites you. You deserve it.");
                    break;
                default:
                    say("Invalid option.");
                    break;
            }
        } else if (talkCount == 2) {
            switch (option) {
                case 1:
                    say("Yay! Fetch!");
                    // Perform action for playing fetch (e.g., giving the player a ball)
                    break;
                case 2:
                    say("You're a bad person! I don't like you!");
                    // Perform action for the puppy running away
                    break;
                default:
                    say("Invalid option.");
                    break;
            }
        }
    }
}
