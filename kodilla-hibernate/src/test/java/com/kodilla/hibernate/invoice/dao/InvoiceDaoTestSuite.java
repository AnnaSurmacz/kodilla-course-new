package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ProductDao productDao;

    @Autowired
    private ItemDao itemDao;

    @Test
    @Transactional
    void testInvoiceDaoSave() {
        // Given
        Product product1 = new Product("Keyboard");
        Product product2 = new Product("Monitor");
        Product product3 = new Product("Mouse");

        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);

        Item item1 = new Item(product1, new BigDecimal("150.00"), 2, new BigDecimal("300.00"));
        Item item2 = new Item(product2, new BigDecimal("800.00"), 1, new BigDecimal("800.00"));
        Item item3 = new Item(product3, new BigDecimal("50.00"), 3, new BigDecimal("150.00"));

        Invoice invoice = new Invoice("FV-001/2025");
        invoice.getItems().addAll(Arrays.asList(item1, item2, item3));
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        // When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        // Then
        assertNotEquals(0, invoiceId);
        assertEquals(3, invoice.getItems().size());
        assertNotEquals(0, invoiceId);
        Invoice myInvoice = invoiceDao.findById(invoiceId).orElse(null);
        assertNotNull(myInvoice);
        assertEquals("FV-001/2025", myInvoice.getNumber());

        Item myItem1 = myInvoice.getItems().get(0);
        Item myItem2 = myInvoice.getItems().get(1);
        Item myItem3 = myInvoice.getItems().get(2);

        assertEquals("Keyboard",myItem1.getProduct().getName());
        assertEquals(new BigDecimal("150.00"), myItem1.getPrice());
        assertEquals(2, myItem1.getQuantity());
        assertEquals(new BigDecimal("300.00"), myItem1.getValue());

        assertEquals("Monitor", myItem2.getProduct().getName());
        assertEquals(new BigDecimal("800.00"), myItem2.getPrice());
        assertEquals(1, myItem2.getQuantity());
        assertEquals(new BigDecimal("800.00"), myItem2.getValue());

        assertEquals("Mouse", myItem3.getProduct().getName());
        assertEquals(new BigDecimal("50.00"), myItem3.getPrice());
        assertEquals(3, myItem3.getQuantity());
        assertEquals(new BigDecimal("150.00"), myItem3.getValue());


        // CleanUp
        invoiceDao.deleteById(invoiceId);
    }
}