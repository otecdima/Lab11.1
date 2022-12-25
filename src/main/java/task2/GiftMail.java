package task2;

public class GiftMail implements MailCode {
    private static String TEMPLATE = "BLACK FRIDAY! %NAME receive your discount right now";
    @Override
    public String generate(Client client) {
        return TEMPLATE.replaceAll("%NAME", client.getName());
    }
}
