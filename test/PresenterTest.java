
import gui.ContainerPanel;
import gui.MockTacoTruck;
import gui.TacoTruck;
import model.Cashier;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;

import java.awt.*;

import static org.junit.Assert.*;

public class PresenterTest {

    private Presenter presenter;
    private MockTacoTruck mockView = new MockTacoTruck();

    @Before
    public void setUp(){
        presenter = new Presenter(mockView, new Cashier());
    }

    @Test
    public void initializesTacoTruck() {
        assertTrue(mockView.wasInitCalled());
    }

    @Test
    public void presenter_initializesTruckWithStartScreen(){
        TacoTruck view = new TacoTruck();
        Cashier model = new Cashier();
        Presenter presenter = new Presenter(view, model);
        Container currentScreen = presenter.getCurrentScreen();

        assertEquals(view,presenter.getView());
        assertEquals("Container Panel", currentScreen.getName());
        assertEquals(currentScreen, presenter.getView().getContentPane());
    }

    @Test
    public void testTacoButtonDoesAddToOrder() {
        JButton tacoButton = ((ContainerPanel) presenter.getCurrentScreen()).getMenuItemPanel().getTacoButton();
        tacoButton.doClick();
        assertEquals(1, presenter.firstOrder.getOrderSize());
        Component actual = ((ContainerPanel) presenter.getCurrentScreen())
                .getReceiptPanel().getComponents()[1];
        assertEquals("Taco", actual.getName());
    }

    @Test
    public void testCanAddTacoWithGuacamoleToOrder() {
        JButton tacoButton = ((ContainerPanel) presenter.getCurrentScreen()).getMenuItemPanel().getTacoButton();
        tacoButton.doClick();
        assertEquals(1, presenter.firstOrder.getOrderSize());
        Component actual = ((ContainerPanel) presenter.getCurrentScreen())
                .getReceiptPanel().getComponents()[1];
        assertEquals("Taco with guacamole" +
                "", actual.getName());
    }

    @Test
    public void testSubtotalUpdatesOnItemsAdd() {
       JButton tacoButton = ((ContainerPanel) presenter.getCurrentScreen()).getMenuItemPanel().getTacoButton();
       tacoButton.doClick();
       assertEquals("Subtotal: $3.0", ((ContainerPanel) presenter.getCurrentScreen()).getReceiptPanel().getSubtotalField().getText());
    }

    @Test
    public void testTaxUpdatesOnItemAdd() {
        JButton tacoButton = ((ContainerPanel) presenter.getCurrentScreen()).getMenuItemPanel().getTacoButton();
        tacoButton.doClick();
        assertEquals("Tax: $0.18", ((ContainerPanel) presenter.getCurrentScreen()).getReceiptPanel().getTaxField().getText());
    }

/*    @Test
    public void startButton_onClick_GoesToOrderScreen(){
        JButton startButton = ((TacoTruckWelcomePanel) presenter.getCurrentScreen()).getStartButton();
        startButton.doClick();
        assertEquals("TacoTruckOrderPanel",presenter.getCurrentScreen().getName());
    }*/

//   Test
//    public void tacoButton_onClick_AddsTaco() {
//        JButton tacoButton = ((MenuItemPanel) presenter.getCurrentScreen()).getTacoButton();
//        tacoButton.doClick();
//        assertEquals("Order Screen", presenter.getCurrentScreen().getName());
//
//    }


}