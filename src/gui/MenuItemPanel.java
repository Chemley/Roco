package gui;

import javax.swing.*;
import java.awt.*;


public class MenuItemPanel extends JPanel {

    private JButton tacoButton = new JButton();

    public MenuItemPanel() {
        this.setName("Menu Item Panel");
        this.tacoButton.setName("Taco Button");
        this.tacoButton.setText("Taco Button");
        this.add(tacoButton);
        this.setBackground(Color.BLACK);
    }

    public JButton getTacoButton() {
        return this.tacoButton;

    }

//        grid = new ();
//       frame.setLayout(grid);
//        frame.setVisible(true);

}

