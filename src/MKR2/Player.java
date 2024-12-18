package MKR2;

public class Player implements Observer {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void update(Character newCharacter) {
        System.out.println("Player " + name + " notified: A new character has entered the arena!");
        newCharacter.displayInfo();
    }
}

