package gui;
import javax.swing.*;
import java.awt.GridLayout;

public class TacoTruck extends JFrame {

    public TacoTruck() {
        this.setTitle("Taco Truck!");
        //new JPanel set as base panel, with grid layout
        //setcontentpane(basePanel)

        this.getContentPane().setLayout(new GridLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(900, 300);
        this.setVisible(true);


    }
}
