package room2;
import java.util.HashMap;

public class RoomDescriptions {
    private static HashMap<String, String> roomDescs;

    public RoomDescriptions() {
        roomDescs = new HashMap<>();
    }

    public void addDescription(String key, String description) {
        roomDescs.put(key, description);
    }

    public String getDescription(String key) {
        return roomDescs.get(key);
    }

    public boolean hasDescription(String key) {
        return roomDescs.containsKey(key);
    }

    public static void put(String key, String description) {
        roomDescs.put(key, description);
	}

    // Other methods for managing room descriptions if needed
}
