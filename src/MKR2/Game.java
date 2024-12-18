package MKR2;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Інструкція
        System.out.println("Choose your character:");
        System.out.println("Warrior: Health = 150, Attack = 20");
        System.out.println("Mage: Health = 100, Attack = 40");
        System.out.println("Archer: Health = 120, Attack = 30\n");

        // Вибір персонажів
        System.out.println("Player 1, choose your character (Warrior, Mage, Archer):");
        Character player1 = chooseCharacter(scanner);

        System.out.println("Player 2, choose your character (Warrior, Mage, Archer):");
        Character player2 = chooseCharacter(scanner);

        // Гра
        System.out.println("\n--- The Battle Begins! ---");
        while (player1.isAlive() && player2.isAlive()) {
            takeTurn(scanner, player1, player2, "Player 1");
            if (!player2.isAlive()) break;

            takeTurn(scanner, player2, player1, "Player 2");
        }

        // Визначення переможця
        if (player1.isAlive()) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }

    private static Character chooseCharacter(Scanner scanner) {
        while (true) {
            try {
                String choice = scanner.nextLine();
                return CharacterFactory.createCharacter(choice);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid choice, try again:");
            }
        }
    }

    private static void takeTurn(Scanner scanner, Character player, Character opponent, String playerName) {
        System.out.println("\n" + playerName + "'s turn. Choose an action: [1] Move, [2] Attack, [3] Heal");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter movement delta (x y):");
                int deltaX = scanner.nextInt();
                int deltaY = scanner.nextInt();
                if (Math.abs(deltaX) <= 20 && Math.abs(deltaY) <= 20) {
                    player.move(deltaX, deltaY);
                } else {
                    System.out.println("Movement too far! Try again.");
                }
                break;

            case 2:
                if (isInAttackRange(player, opponent)) {
                    int damage = player.attack();
                    opponent.takeDamage(damage);
                } else {
                    System.out.println("Opponent is out of range!");
                }
                break;

            case 3:
                player.heal();
                break;

            default:
                System.out.println("Invalid choice!");
        }

        // Статус після ходу
        System.out.println(playerName + " Status - Health: " + player.getHealth() + ", Position: (" + player.getX() + ", " + player.getY() + ")");
    }

    private static boolean isInAttackRange(Character player, Character opponent) {
        int distance = Math.abs(player.getX() - opponent.getX()) + Math.abs(player.getY() - opponent.getY());
        return distance <= player.getAttackRange();
    }
}

