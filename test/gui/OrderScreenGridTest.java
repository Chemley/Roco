package gui;
import gui.OrderScreenGrid;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;


public class OrderScreenGridTest {

    private OrderScreenGrid orderScreenGrid;

    @Before
    public void setUpForOrderScreen(){
        orderScreenGrid = new OrderScreenGrid();
    }

    @Test
    public void nameOfOrderScreenGrid() {
        assertEquals("Order Screen",orderScreenGrid.getName());

    }

    @Test
    public void addTacoButton(){
        JButton tacoButton = ((JButton) orderScreenGrid.getComponents()[0]);
        assertEquals(tacoButton, orderScreenGrid.getTacoButton());
        assertEquals("Taco Button", tacoButton.getName());
        assertEquals("Taco Button", tacoButton.getText());
    }
}