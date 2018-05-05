import javax.swing.*;
import java.lang.management.BufferPoolMXBean;

public class TacoTruckWelcomePanel extends JPanel {

    private JButton startButton;

    public TacoTruckWelcomePanel(){
        this.setName("TacoTruckWelcomePanel");
        startButton = new JButton("Start Order");
        startButton.setName("StartOrderButton");
        this.add(startButton);
    }

    public JButton getStartButton() {
        return this.startButton;
    }
}
