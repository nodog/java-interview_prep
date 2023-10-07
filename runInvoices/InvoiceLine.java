package runInvoices;

public class InvoiceLine {
    int itemId;
    String itemDescription;
    int itemPrice;
    int quantity;

    public InvoiceLine(int itemId, String itemDescription, int itemPrice, int quantity) {
        this.itemId = itemId;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }
}
