package gui;

import model.Taco;

import javax.swing.*;
import java.awt.*;

public class ReceiptPanel extends JPanel {

    private JLabel subtotalField;
    private JLabel taxField;
    private JLabel totalField;
    private JLabel discountAmountField;
    private JPanel itemsList;

    ReceiptPanel() {
        this.setName("ReceiptPanel");
        this.setLayout(new BorderLayout());
        this.setBackground(Color.CYAN);
        JLabel receiptLabel = new JLabel("Customer Name");
        this.add(receiptLabel, BorderLayout.PAGE_START);
        JPanel taxTotalPanel = new JPanel();
        taxTotalPanel.setLayout(new BoxLayout(taxTotalPanel, BoxLayout.Y_AXIS));
        subtotalField = new JLabel("Subtotal: $0.00");
        taxTotalPanel.add(subtotalField);
        taxField = new JLabel("Tax: $0.00");
        taxTotalPanel.add(taxField);
        discountAmountField = new JLabel ("Discount Amount: $0.00");
        taxTotalPanel.add(discountAmountField);
        totalField = new JLabel("Total: $0.00");
        taxTotalPanel.add(totalField);
        taxTotalPanel.setBackground(Color.YELLOW);
        this.add(taxTotalPanel, BorderLayout.PAGE_END);
        itemsList = new JPanel();
        this.add(itemsList, BorderLayout.CENTER);
        itemsList.setLayout(new BoxLayout(itemsList, BoxLayout.Y_AXIS));
    }

    /**
     * Adds a ConsumableItem to the receipt. Actually, it is specifically a Taco at this point.
     * @param taco This should be changed to ConsumableItem once the tests dictate the change is necessary
     */
    public void addItemToReceipt(Taco taco) {
        String labelString = taco.toString() + " $" + taco.getUnitPrice();
        JLabel newLabel = new JLabel(labelString);
        itemsList.add(newLabel);
        this.revalidate();
    }

    public void updateSubtotal(double newSubtotal) {
        this.subtotalField.setText("Subtotal: $" + newSubtotal);
    }

    public JLabel getSubtotalField() {
        return this.subtotalField;
    }

    public void updateTax(double newTaxAmount) {
        this.taxField.setText("Tax: $" + newTaxAmount);
    }

    public JLabel getTaxField() {
        return this.taxField;
    }

    public void updateTotal(double newTotal) {
        this.totalField.setText("Total: $" + newTotal);
    }

    JLabel getTotalField() {
        return this.totalField;
    }

    public void updateDiscountAmount(double newDiscountAmount ) {
        this.discountAmountField.setText("Discount Amount: $" + newDiscountAmount);
    }

    JLabel getDiscountAmountField() {
        return this.discountAmountField;
    }

}
