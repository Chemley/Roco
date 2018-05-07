package gui;

import javax.swing.*;


public class ReceiptPanel extends JPanel {

    private JButton tacoButton = new JButton();

    public ReceiptPanel() {
        this.setName("Receipt Panel");
        this.tacoButton.setName("Taco Button");
        this.tacoButton.setText("Taco Button");
        this.add(tacoButton);
    }

    public JButton getTacoButton() {
        return this.tacoButton;

    }
}