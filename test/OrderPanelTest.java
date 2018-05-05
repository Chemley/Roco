import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;

public class OrderPanelTest {


    @Test
    public void orderPanel_hasLabel(){
        OrderPanel orderPanel = new OrderPanel();
        assertEquals("Order screen",((JLabel)orderPanel.getComponents()[0]).getText());
        assertEquals("TacoTruckOrderPanel",orderPanel.getName());
    }
}