public class Guide extends NPC {
    public Guide() {
        super("Guide", "A helpful guide ready to assist.");
    }

    @Override
    public void talk() {
        say("Welcome! I'm here to assist you on your journey.");
        String[] options = {
            "Can you provide directions?",
            "Tell me about this place."
        };
        getResponse(options);
    }

    @Override
    public void response(int option) {
        switch(option) {
            case 1:
                say("Of course! Where would you like to go?");
                break;
            case 2:
                say("This is a mystical land full of wonders. Explore and enjoy!");
                break;
            default:
                say("I'm sorry, I didn't quite catch that. Could you ask again?");
                break;
        }
    }
}
