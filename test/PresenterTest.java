import Presenter;
import gui.MenuItemPanel;
import gui.TacoTruck;
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
        assertEquals("Order Screen", currentScreen.getName());
        assertEquals(currentScreen, presenter.getView().getContentPane());
    }

 /*   @Test
    public void startButton_onClick_GoesToOrderScreen(){
        JButton startButton = ((TacoTruckWelcomePanel) presenter.getCurrentScreen()).getStartButton();
        startButton.doClick();
        assertEquals("TacoTruckOrderPanel",presenter.getCurrentScreen().getName());
    }
*/
    @Test
    public void tacoButton_onClick_AddsTaco() {
        JButton tacoButton = ((MenuItemPanel) presenter.getCurrentScreen()).getTacoButton();
        tacoButton.doClick();
        assertEquals("Order Screen", presenter.getCurrentScreen().getName());

    }
}