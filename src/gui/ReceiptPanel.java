package gui;

import model.Taco;

import javax.swing.*;
import java.awt.*;


public class ReceiptPanel extends JPanel {
    JLabel subtotalField = new JLabel("Subtotal: $0.00");
    JLabel taxField = new JLabel("Tax: $0.00");

    public ReceiptPanel() {
        this.setName("Receipt Panel");
        this.setLayout(new BorderLayout());
        this.setBackground(Color.CYAN);
        JLabel receiptLabel = new JLabel("Customer Name");
        this.add(receiptLabel, BorderLayout.PAGE_START);
        this.add(subtotalField, BorderLayout.PAGE_END);
        this.add(taxField, BorderLayout.PAGE_END);



    }


    public void addItemToReceipt(Taco taco) {
        String labelString = taco.toString() + " $" + taco.getUnitPrice();
        JLabel newLabel = new JLabel(labelString);
        this.add(newLabel, BorderLayout.CENTER);
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
}
