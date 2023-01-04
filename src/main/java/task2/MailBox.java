package task2;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos = new ArrayList<>();
    private MailSender mailSender = new MailSender();

    private void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    private void sendAll() throws MailjetSocketTimeoutException, MailjetException {
        for (MailInfo info: infos) {
            mailSender.sendMail(info);
        }
    }
}
