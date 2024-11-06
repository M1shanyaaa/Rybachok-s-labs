package MKR1;

public class EncryptMessageDecorator implements Message {
    private Message message;

    public EncryptMessageDecorator(Message message) {
        this.message = message;
    }

    @Override
    public String getText() {
        String originalText = message.getText();
        return originalText + "\t(Encrypt Message)\t";
    }
}