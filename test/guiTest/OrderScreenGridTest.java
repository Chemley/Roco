import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;

public class OrderScreenGridTest {

    @Test
    public void nameOfOrderScreenGrid() {
        OrderScreenGrid orderScreenGrid = new OrderScreenGrid();
        assertEquals("Order Screen",orderScreenGrid.getName());
    }

}