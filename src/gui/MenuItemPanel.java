package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;

public class MenuItemPanel extends JPanel {

    private JButton tacoButton = new JButton();

    public MenuItemPanel() {
        this.setName("MenuItemPanel");
        this.tacoButton.setName("TacoButton");
        this.tacoButton.setText("Taco");
        this.add(tacoButton, 0, 0);
        this.setBackground(Color.BLACK);
        this.setLayout(new GridLayout(2, 2));
    }

    /**
     * Gets the taco button for use by the presenter
     * @return The JButton labeled "Taco" that is placed on this MenuTitemPanel
     */
    public JButton getTacoButton() {
        return this.tacoButton;
    }

//        grid = new ();
//       frame.setLayout(grid);
//        frame.setVisible(true);

}

