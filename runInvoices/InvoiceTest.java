package runInvoices;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.time.LocalDate;

public class InvoiceTest {
    Invoice invoice;

    @Before
    public void init() {
        invoice = new Invoice(LocalDate.of(2023, 7, 4), 900);
    }

    @Test
    public void shouldReturnDateString() {
        assertEquals("2023-07-04", invoice.getDateString());
    }

    @Test
    public void shouldReturnInvoiceNumber() {
        assertEquals(900, invoice.getInvoiceNumber());
    }

    @Test
    public void shouldReturnTotal() {
        assertEquals(252, invoice.getTotal());
    }
}