package MKR2;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас Arena координує дії персонажів та повідомляє спостерігачів про зміни.
 */
public class Arena {
    private List<Character> characters = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    /**
     * Додає персонажа до арени та повідомляє спостерігачів.
     * @param character персонаж, що додається
     */
    public void addCharacter(Character character) {
        characters.add(character);
        notifyObservers(character);
    }

    /**
     * Переміщує персонажа до заданих координат.
     * @param character персонаж
     * @param x координата X
     * @param y координата Y
     */
    public void moveCharacter(Character character, int x, int y) {
        character.move(x, y);
    }

    /**
     * Починає бій між персонажами на арені.
     */
    public void startBattle() {
        System.out.println("Battle begins!");
        for (int i = 0; i < characters.size(); i++) {
            for (int j = i + 1; j < characters.size(); j++) {
                Character attacker = characters.get(i);
                Character defender = characters.get(j);

                if (attacker.isAlive() && defender.isAlive()) {
                    int damage = attacker.attack();
                    defender.takeDamage(damage);

                    if (!defender.isAlive()) {
                        System.out.println(defender.getClass().getSimpleName() + " has been defeated!");
                    }
                }
            }
        }
    }

    /**
     * Додає спостерігача до арени.
     * @param observer спостерігач
     */
    public void attachObserver(Observer observer) {
        observers.add(observer);
    }

    private void notifyObservers(Character character) {
        for (Observer observer : observers) {
            observer.update(character);
        }
    }
}

