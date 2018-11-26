package lt.mif.vu.shop.Integrational.mailSenderImp;

import lt.mif.vu.shop.Integrational.mailListener.MailListener;
import lt.mif.vu.shop.Integrational.mailSencer.MessageSender;

import java.util.List;

public class MessageSenderConsole implements MessageSender {

    List<MailListener> mailListeners;

    public void sendMessage(String message, String receiver) {
        System.out.println(receiver + " got message: " + message);

        mailListeners.forEach(listener -> listener.emailWasSent(message, receiver));
    }
}
