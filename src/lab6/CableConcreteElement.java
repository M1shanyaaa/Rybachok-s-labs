package lab6;

/**
 * Представляє кабель у мережі.
 */
public class CableConcreteElement implements Element {
    private final int length; // довжина кабелю в метрах

    public CableConcreteElement(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCable(this);
    }
}

