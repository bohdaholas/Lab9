package mail_sender;

public class MailSender {
    public MailSender() {
    }

    public boolean sendMail(MailInfo info){
        String mailText = info.getMailText();
        Client client = info.getClient();

        if (client != null &&  mailText != null){
            System.out.printf("Mail was send to %s:\n%s\n", client, mailText);
            return true;
        }
        System.out.printf("Error. Mail to %s wasn't send", client);
        return false;
    }
}
