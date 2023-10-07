package runInvoices;

import java.time.LocalDate;

public class Invoice {
    // date
    LocalDate date;
    // number
    int invoiceNumber;
    // lines
    InvoiceLine invoiceLines[] = new InvoiceLine[] {
            new InvoiceLine(10, "bolt", 2, 12),
            new InvoiceLine(11, "washer", 3, 12),
            new InvoiceLine(12, "wingnut", 16, 12),
    };
    // int ns[] = new int[]{1,2,3};

    public Invoice(LocalDate date, int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        this.date = date;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public String getDateString() {
        return this.date.toString();
    }

    public int getInvoiceNumber() {
        return this.invoiceNumber;
    }

    public int getTotal() {
        int total = 0;
        for (InvoiceLine iL : invoiceLines) {
            total += iL.quantity * iL.itemPrice;
        }
        return total;
    }
}
