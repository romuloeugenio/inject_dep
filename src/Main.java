import model.Client;
import model.Product;
import notify.NotifierWhatsapp;
import service.InvoiceProductService;

public class Main {
	public static void main(String[] args) {
		Product product = new Product(1500.0, "Notebook");
		Client client = new Client("Romulo");

        //faturar
		InvoiceProductService invoiceProductService = new InvoiceProductService(new NotifierWhatsapp());
		invoiceProductService.invoice(product, client);
	}
}
