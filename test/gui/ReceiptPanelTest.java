package gui;
import org.junit.Before;
import org.junit.Test;
import org.junit.*;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

import static org.junit.Assert.assertEquals;

public class ReceiptPanelTest {

    private ReceiptPanel receiptPanel;

    @Before
    public void setUpForReceiptPanel(){
        receiptPanel = new ReceiptPanel();
    }

    @Test
    public void nameOfOrderScreenGrid() {
        assertEquals("Receipt Panel", receiptPanel.getName()); }

    @Test
    public void pannelHasText () {
        JLabel nameLabel = (JLabel) receiptPanel.getComponents()[0];
        assertEquals("Customer Name", nameLabel.getText());
        assertEquals(BoxLayout.Y_AXIS,((BoxLayout)receiptPanel.getLayout()).getAxis());
    }

    @Test
    public void subtotalUpdatesAsItemsAdded() {
        ReceiptPanel receiptPanel = new ReceiptPanel();
        receiptPanel.updateSubtotal(3.00);
        assertEquals("Subtotal: $3.0", ((JLabel) receiptPanel.taxTotalPanel.getComponents()[0]).getText());
    }

    @Test
    public void testTaxUpdatesAsItemsAdded() {
        receiptPanel.updateTax(0.18);
        assertEquals("Tax: $0.18", ((JLabel) receiptPanel.taxTotalPanel.getComponents()[1]).getText());
    }

    @Test
    public void totalUpdatesAsItemsAreAdded() {
        receiptPanel.updateTotal(3.18);
        assertEquals("Total: $3.18", ((JLabel) receiptPanel.taxTotalPanel.getComponents()[2]).getText());
    }


}
