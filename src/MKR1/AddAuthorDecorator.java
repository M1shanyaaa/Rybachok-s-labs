package MKR1;

public class AddAuthorDecorator implements Message {
    private Message message;
    private static final String AUTHOR = "Rybachok Mikhailo";

    public AddAuthorDecorator(Message message) {
        this.message = message;
    }

    @Override
    public String getText() {
        String originalText = message.getText();
        return originalText + " (Author: " + AUTHOR + ")";
    }
}
