package gui;

import model.Taco;

import javax.swing.*;
import java.awt.*;


public class ReceiptPanel extends JPanel {

    public ReceiptPanel() {
        this.setName("Receipt Panel");
        this.setBackground(Color.CYAN);
        JLabel receiptLabel = new JLabel("Customer Name");
        this.add(receiptLabel);
        JLabel subtotalField = new JLabel("Subtotal: $0.00");
        this.add(subtotalField);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

    }


    public void addItemToReceipt(Taco taco) {
        String labelString = taco.toString() + " $" + taco.getUnitPrice();
        JLabel newLabel = new JLabel(labelString);
        this.add(newLabel);
        this.revalidate();
    }


}
