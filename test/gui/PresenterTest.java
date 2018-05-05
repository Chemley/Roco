package gui;
import gui.Presenter;
import gui.TacoTruck;
import gui.TacoTruckWelcomePanel;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;

import java.awt.*;

import static org.junit.Assert.*;

public class PresenterTest {

    private Presenter presenter;

    @Before
    public void setUp(){
        presenter = new Presenter(new TacoTruck());
    }

    @Test
    public void presenter_initializesTruckWithStartScreen(){
        TacoTruck view = new TacoTruck();
        presenter = new Presenter(view);
        Container currentScreen = presenter.getCurrentScreen();

        assertEquals(view,presenter.getView());
        assertEquals("TacoTruckWelcomePanel", currentScreen.getName());
        assertEquals(currentScreen, presenter.getView().getContentPane());
    }

    @Test
    public void startButton_onClick_GoesToOrderScreen(){
        JButton startButton = ((TacoTruckWelcomePanel) presenter.getCurrentScreen()).getStartButton();
        startButton.doClick();
        assertEquals("TacoTruckOrderPanel",presenter.getCurrentScreen().getName());
    }
}