package mail_sender;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos;
    private MailSender mailSender;

    public List<MailInfo> getInfos() {
        return infos;
    }

    public MailBox() {
        this.infos = new ArrayList<>();
        this.mailSender = new MailSender();
    }

    public void addMailInfo(MailInfo info){
        infos.add(info);
    }

    public void sendAll(){
        for (MailInfo info : infos) {
            mailSender.sendMail(info);
        }
        infos.clear();
    }

}
