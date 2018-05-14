package gui;

import org.junit.Before;
import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.assertEquals;

public class ReceiptPanelTest {

    private ReceiptPanel receiptPanel;

    @Before
    public void setUpForReceiptPanel(){
        receiptPanel = new ReceiptPanel();
    }

    @Test
    public void testNameOfOrderScreenGrid() {
        assertEquals("ReceiptPanel", receiptPanel.getName()); }

    @Test
    public void testPanelHasText () {
        JLabel nameLabel = (JLabel) receiptPanel.getComponents()[0];
        assertEquals("Customer Name", nameLabel.getText());
        assertEquals(BoxLayout.Y_AXIS,((BoxLayout) receiptPanel.getLayout()).getAxis());
    }

    @Test
    public void testSubtotalUpdatesAsItemsAdded() {
        receiptPanel.updateSubtotal(3.00);
        assertEquals("Subtotal: $3.0", receiptPanel.getSubtotalField().getText());
    }

    @Test
    public void testTaxUpdatesAsItemsAdded() {
        receiptPanel.updateTax(0.18);
        assertEquals("Tax: $0.18", receiptPanel.getTaxField().getText());
    }

    @Test
    public void testAddThreeTacosUpdatesDiscount() {
        receiptPanel.updateDiscountAmount(1.50);
        assertEquals("Discount Amount: $1.5", receiptPanel.getDiscountAmountField().getText());
    }

    @Test
    public void totalUpdatesAsItemsAreAdded() {
        receiptPanel.updateTotal(3.18);
        assertEquals("Total: $3.18", receiptPanel.getTotalField().getText());
    }

}
