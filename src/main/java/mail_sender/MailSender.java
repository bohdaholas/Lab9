package mail_sender;

public class MailSender {
    public void sendMail(MailInfo info){
        System.out.println(info.getClient() + "\n" + info.getMailText());
    }
}
