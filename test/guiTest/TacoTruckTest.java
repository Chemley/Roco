import org.junit.Test;

import javax.swing.*;

import java.awt.GridLayout;

import static org.junit.Assert.*;

public class TacoTruckTest {

    @Test
    public void tacoTruck_initialState(){
        TacoTruck tacoTruck = new TacoTruck();
        assertEquals("Taco Truck!",tacoTruck.getTitle());
        assertTrue(tacoTruck.isVisible());
        assertEquals(JFrame.EXIT_ON_CLOSE,tacoTruck.getDefaultCloseOperation());
        assertEquals(900,tacoTruck.getWidth());
        assertEquals(300,tacoTruck.getHeight());
        assertEquals(GridLayout.class,tacoTruck.getContentPane().getLayout().getClass());
        assertEquals(GridLayout.class,tacoTruck.getLayout().getClass());

    }

}