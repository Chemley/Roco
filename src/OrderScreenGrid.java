import javax.swing.*;

public class OrderScreenGrid extends JPanel {

    private JButton tacoButton = new JButton();

    public OrderScreenGrid() {
        this.setName("Order Screen");
        this.tacoButton.setName("Taco Button");
        this.tacoButton.setText("Taco Button");
        this.add(tacoButton);
    }

    public JButton getTacoButton() {
        return this.tacoButton;

    }

//        grid = new ();
//       frame.setLayout(grid);
//        frame.setVisible(true);

 }

