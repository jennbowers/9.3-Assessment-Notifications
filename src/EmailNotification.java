/**
 * Created by jenniferbowers on 7/19/17.
 */
public class EmailNotification extends Notification{
    private String recipient;
    private String smtpProvider;
    protected String status;

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    @Override
    public void transport() {
        System.out.println("Recipient: " + this.recipient + ", smtp Provider: " + this.smtpProvider + ", Subject: " + getSubject() + ", Body: " + getBody() + ", Created At: " + getCreatedAt());
    }
}
