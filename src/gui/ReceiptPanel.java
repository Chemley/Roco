package gui;

import model.Taco;

import javax.swing.*;
import java.awt.*;


public class ReceiptPanel extends JPanel {

    private JPanel itemsListing;

    public ReceiptPanel() {
        this.setName("Receipt Panel");
        this.setBackground(Color.CYAN);
        JLabel receiptLabel = new JLabel("Receipt for some customer");
        itemsListing = new JPanel();
        itemsListing.setName("ReceiptPanelItemsListing");
        itemsListing.setLayout(new BoxLayout(itemsListing, BoxLayout.Y_AXIS));
        this.add(receiptLabel);
        this.add(itemsListing);
        JLabel subtotalField = new JLabel("Subtotal: $0.00");
        this.add(subtotalField);

    }


    public void addItemToReceipt(Taco taco) {
        String labelString = taco.toString() + " $" + taco.getUnitPrice();
        JLabel newLabel = new JLabel(labelString);
        itemsListing.add(newLabel);
        this.revalidate();
    }
}
