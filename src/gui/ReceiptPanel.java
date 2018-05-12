package gui;

import model.Taco;

import javax.swing.*;
import java.awt.*;


public class ReceiptPanel extends JPanel {
    JLabel subtotalField = new JLabel("Subtotal: $0.00");
    JLabel taxField = new JLabel("Tax: $0.00");
    JLabel totalField = new JLabel("Total: $0.00");
    JPanel itemsList = new JPanel();
    JPanel taxTotalPanel = new JPanel();

    public ReceiptPanel() {
        this.setName("Receipt Panel");
        this.setLayout(new BorderLayout());
        this.setBackground(Color.CYAN);
        JLabel receiptLabel = new JLabel("Customer Name");
        this.add(receiptLabel, BorderLayout.PAGE_START);
        taxTotalPanel.setLayout(new BoxLayout(taxTotalPanel, BoxLayout.Y_AXIS));
        taxTotalPanel.add(subtotalField);
        taxTotalPanel.add(taxField);

        taxTotalPanel.add(totalField);
        taxTotalPanel.setBackground(Color.YELLOW);
        this.add(taxTotalPanel, BorderLayout.PAGE_END);
        this.add(itemsList, BorderLayout.CENTER);
        itemsList.setLayout(new BoxLayout(itemsList, BoxLayout.Y_AXIS));
    }


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
}
