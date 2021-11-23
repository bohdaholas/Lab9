package mail_sender;

import java.util.LinkedList;

public class MailBox {
    private LinkedList<MailInfo> infos;
    private MailSender sender;

    public MailBox() {
        this.infos = new LinkedList<>();
        this.sender = new MailSender();
    }

    public boolean addMailInfo(MailInfo info){
        if(info != null && info.getClient() != null & info.getMailCode() != null){
            infos.add(info);
            return true;
        }
        return false;
    }

    public void sendAll(){
        for (MailInfo info : infos) {
            sender.sendMail(info);
        }
        infos.clear();
    }

}
