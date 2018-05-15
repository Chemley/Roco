package gui;
import javax.swing.*;

public class TacoTruck extends JFrame {

    public void init() {
        this.setTitle("Taco Truck!");
        // new JPanel set as base panel, with grid layout
        // setcontentpane(basePanel)
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(900, 300);
        this.setVisible(true);
    }
}
