import javax.swing.*;

public class OrderScreenGrid extends JPanel {

    private JButton tacoButton = new JButton();

    public OrderScreenGrid() {
        this.setName("Order Screen");
        this.tacoButton.setName("Taco Button");
        this.add(tacoButton);
    }

    public JButton getTacoButton() {
        return this.tacoButton;

    }


//        grid = new ();
//
//        // what layout we want to use for our frame
//
//       frame.setLayout(grid);
//        frame.add(new JButton("Taco"));
//        frame.add(new JButton("Coke"));


//        frame.setVisible(true);

 }

