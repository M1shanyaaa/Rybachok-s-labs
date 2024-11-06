package MKR1;

public class AddTimestampDecorator implements Message {
    private Message message;

    public AddTimestampDecorator(Message message) {
        this.message = message;
    }

    @Override
    public String getText() {
        String originalText = message.getText();
        return originalText + "[06.11.2024]";
    }
}
