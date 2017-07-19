public class Main {

    public static void main(String[] args) {
	EmailNotification newEmailNotification = new EmailNotification("Hello World", "I am an Email Notification", "Joel", "new stmp Provider");

    newEmailNotification.transport();
    newEmailNotification.showStatus();
    newEmailNotification.protectedMethodTest();

    Object emailNotificationClone = null;
    try {
        emailNotificationClone = newEmailNotification.clone();
    } catch (CloneNotSupportedException e) {
        e.printStackTrace();
    }
    newEmailNotification.equals(emailNotificationClone);


    TextNotification newTextNotification = new TextNotification("Hi Again", "I am now a Text Notification", "Jenn", "new sms Provider");

    newTextNotification.transport();
    newTextNotification.showStatus();



    }



}
