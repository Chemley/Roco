package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Presenter {

    private final MenuItemPanel orderScreen;
    private TacoTruck view;
    public Presenter(TacoTruck view) {
        this.view = view;
        this.orderScreen = new MenuItemPanel();
        setUp();
    }

    private void setUp(){

        setCurrentScreen(orderScreen);
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
            setCurrentScreen(new TacoTruckWelcomePanel());
        }
    }
}
