package service;

import model.Client;
import model.Product;
import notify.Notifier;

public class InvoiceProductService {
    private final Notifier notifier;

    public InvoiceProductService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void invoice(Product product, Client client) {
        System.out.println("Invoicing product: " + product.getname() + " for client: " + client.getname());
        notifier.send(client);
    }
}
