package notify;

import model.Client;


public class NotifierEmail implements Notifier {
    @Override
    public void send(Client client) {
        System.out.println("Sending -  email to " + client.getname());
    }
}
