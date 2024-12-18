package MKR2;

public class Warrior implements Character {
    private String name = "Warrior";
    private int health = 150;
    private int attackPower = 20;
    private int x = 0, y = 0;
    private final int attackRange = 20; // Range for attack

    @Override
    public void displayInfo() {
        System.out.println(name + " - Health: " + health + ", Attack: " + attackPower);
    }

    @Override
    public void move(int deltaX, int deltaY) {
        x = Math.min(20, Math.max(0, x + deltaX));
        y = Math.min(20, Math.max(0, y + deltaY));
        System.out.println(name + " moves to (" + x + ", " + y + ")");
    }

    @Override
    public int attack() {
        System.out.println(name + " attacks with power " + attackPower);
        return attackPower;
    }

    @Override
    public void heal() {
        health += 20;
        System.out.println(name + " heals for 20 points. Health is now: " + health);
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " takes " + damage + " damage. Remaining health: " + health);
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public int getHealth() { return health; }

    @Override
    public int getX() { return x; }

    @Override
    public int getY() { return y; }

    @Override
    public String getName() { return name; }

    @Override
    public int getAttackRange() { return attackRange; }
}

