import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.management.BufferPoolMXBean;

public class Presenter {

    private TacoTruck view;
    private TacoTruckWelcomePanel welcomeScreen;
    public Presenter(TacoTruck view) {
        this.view = view;
        setUp();
    }

    private void setUp(){
        welcomeScreen = new TacoTruckWelcomePanel();
        welcomeScreen.getStartButton().addActionListener(new StartButtonActionListener());
        setCurrentScreen(welcomeScreen);
    }

    public TacoTruck getView() {
        return this.view;
    }

    private void setCurrentScreen(JPanel screen){
        this.view.setContentPane(screen);
        view.revalidate();
    }

    public Container getCurrentScreen() {
        return view.getContentPane();
    }

    public static void main(String[] args) {
        new Presenter(new TacoTruck());
    }


    private class StartButtonActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            setCurrentScreen(new OrderScreenGrid());
        }
    }
}
