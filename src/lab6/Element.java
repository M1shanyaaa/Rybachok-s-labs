package lab6;

/**
 * Інтерфейс елементу мережі.
 * Визначає метод accept() для прийняття відвідувача.
 */
public interface Element {
    void accept(Visitor visitor);
}
