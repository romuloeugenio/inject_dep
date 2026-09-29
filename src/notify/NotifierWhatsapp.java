package notify;

import model.Client;

public class NotifierWhatsapp implements Notifier {
    @Override
    public void send(Client client) {
        System.out.println("Sending WhatsApp message to " + client.getname());
    }
} 