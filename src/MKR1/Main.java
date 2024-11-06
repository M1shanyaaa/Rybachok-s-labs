package MKR1;

public class Main {
    public static void main(String[] args) {

        Message message = new SimpleMessage("Hello World, я Мішаня, надіюсь у вас справи йдуть добре(бо я ось пишу код для МКР)");
        System.out.println("Origin message: \n"+ message.getText());

        message = new EncryptMessageDecorator(message);
        System.out.println("Encrypted message: \n" + message.getText());

        message = new CompressMessageDecorator(message);
        System.out.println("Compressed message: \n" + message.getText());

        message = new AddTimestampDecorator(message);
        System.out.println("Add timestamp: \n" + message.getText());

        message = new AddAuthorDecorator(message);
        System.out.println("Add author: \n" + message.getText());

    }
}

