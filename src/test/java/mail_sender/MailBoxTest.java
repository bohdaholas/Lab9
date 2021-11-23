package mail_sender;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailBoxTest {

    @Test
    void addMailInfo() {
        MailBox mailBox = new MailBox();
        Client client = new Client("Harry", 10, Gender.FEMALE);
        MailCode mailCode = MailCode.HAPPY_BIRTHDAY;
        MailInfo mailInfo = new MailInfo(client, mailCode);
        mailBox.addMailInfo(mailInfo);
        assertNotNull(mailBox.getInfos());
    }
}