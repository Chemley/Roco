package gui;

import javax.swing.*;
import java.awt.*;

public class ContainerPanel extends JPanel {

    private MenuItemPanel menuItemPanel;
    private ReceiptPanel receiptPanel;

    public ContainerPanel() {
        this.setName("Container Panel");
        this.setLayout(new BorderLayout());
        this.menuItemPanel = new MenuItemPanel();
        this.add(menuItemPanel, BorderLayout.WEST);
        this.receiptPanel = new ReceiptPanel();
        this.add(receiptPanel, BorderLayout.CENTER);
    }

    public MenuItemPanel getMenuItemPanel() {
        return this.menuItemPanel;
    }

    public ReceiptPanel getReceiptPanel() {
        return this.receiptPanel;
    }

}
