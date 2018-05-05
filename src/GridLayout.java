import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayout {
    private static JButton[] arrayBtn;

    public static void main(String[] args) {

        // the frame that contains the components

        JFrame frame = new JFrame("GridLayoutTest from JCG");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set the size of the frame

        frame.setSize(350, 350);

        // set the rows and cols of the grid, as well the distances between them

        GridLayout grid = new GridLayout();

        // what layout we want to use for our frame

//        frame.setLayout(grid);
        frame.add(new JButton("Taco"));
        frame.add(new JButton("Coke"));


        frame.setVisible(true);

    }

}
