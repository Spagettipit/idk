public class Key extends Item {



public Key() {

super("key");

}



public void use() {

if (Game.getCurrentRoom().getName().equals("Crypt")) {


if (isUsed())

System.out.println("The chest is already open.");


else {


System.out.println("They key fits into the chest! You open the chest and" + " find a code inside!");


Item code = new Item("theres a code inside for the door");


code.setDesc("it says 7589!");


Game.getCurrentRoom().addItem(code);


setUsed(true);

}


} else


System.out.println("The key doesn't fit any lock in this room.");

}

}