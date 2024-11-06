package MKR1;

public class CompressMessageDecorator implements Message {
    private Message message;

    public CompressMessageDecorator(Message message) {
        this.message = message;
    }

    @Override
    public String getText() {
        String originalText = message.getText();
        return originalText + " (Compressed message)\t";
    }
}
