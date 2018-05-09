import gui.MenuItemPanel;
import gui.TacoTruck;
import gui.TacoTruckWelcomePanel;
import model.Cashier;
import gui.ContainerPanel;
import model.Order;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Presenter {

    private final ContainerPanel containerPanel;
    private TacoTruck view;
    private Cashier model;

    public Presenter(TacoTruck view, Cashier model) {
        this.view = view;
        this.model = model;
        this.containerPanel = new ContainerPanel();
        setUp();
    }

    private void setUp(){

        setCurrentScreen(containerPanel);
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
        new Presenter(new TacoTruck(), new Cashier());
    }


    private class StartButtonActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            setCurrentScreen(new TacoTruckWelcomePanel());
        }
    }
}
