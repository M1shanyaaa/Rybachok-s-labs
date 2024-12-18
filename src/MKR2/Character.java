package MKR2;

public interface Character {
    void displayInfo();
    void move(int deltaX, int deltaY);
    int attack();
    void heal();
    void takeDamage(int damage);
    boolean isAlive();
    int getHealth();
    int getX();
    int getY();
    String getName();
    int getAttackRange();
}
