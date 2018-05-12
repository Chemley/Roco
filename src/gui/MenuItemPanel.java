package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;


public class MenuItemPanel extends JPanel {

    private JButton tacoButton = new JButton();

    public MenuItemPanel() {
        this.setName("Menu Item Panel");
        this.tacoButton.setName("Taco Button");
        this.tacoButton.setText("Taco Button");
        this.add(tacoButton, 0, 0);
        this.setBackground(Color.BLACK);
        this.setLayout(new GridLayout(2, 2));
    }

    public JButton getTacoButton() {
        return this.tacoButton;

    }

//        grid = new ();
//       frame.setLayout(grid);
//        frame.setVisible(true);

}

