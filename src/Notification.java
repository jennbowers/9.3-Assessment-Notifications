import java.time.LocalDateTime;

/**
 * Created by jenniferbowers on 7/19/17.
 */
public class Notification {
    private LocalDateTime createdAt;
    private String subject;
    private String body;

    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        this.createdAt = LocalDateTime.now();
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public void transport() {
        try {
            throw new NoTransportException();
        } catch (NoTransportException e) {
            System.out.println("Throwing NoTransportException");
        }
    }
}
