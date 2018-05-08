package gui;

import javax.swing.*;
import java.awt.*;

public class ContainerPanel extends JPanel {

    private MenuItemPanel menuItemPanel;

    public ContainerPanel () {
        this.setName("Container Panel");
        this.menuItemPanel = new MenuItemPanel();
        this.add(menuItemPanel);
    }

}
