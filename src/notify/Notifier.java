package notify;

import model.Client;

public interface Notifier {
    void send(Client client);
}