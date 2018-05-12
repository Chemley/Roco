package gui;
import org.junit.Before;
import org.junit.Test;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class ReceiptPanelTest {

    private ReceiptPanel receiptPanel;

    @Before
    public void setUpForReceiptPanel(){
        receiptPanel = new ReceiptPanel();
    }

    @Test
    public void nameOfOrderScreenGrid() {
        assertEquals("Receipt Panel", receiptPanel.getName()); }

    @Test
    public void testPanelHasTextArea() {
        assertEquals("ReceiptPanelTextArea", receiptPanel.getComponents()[1].getName());

    }


}
