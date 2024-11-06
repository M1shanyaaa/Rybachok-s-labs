package MKR1;

public class SimpleMessage implements Message {
    private String text;

    public SimpleMessage(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}
