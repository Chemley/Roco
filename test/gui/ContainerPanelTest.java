package gui;

import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class ContainerPanelTest {

    private ContainerPanel containerPanel;

    @Before
    public void setUpForContainerPanel(){
        containerPanel = new ContainerPanel();
    }

    @Test
    public void nameOfContainerPanel() {
        assertEquals("Container Panel",containerPanel.getName());

    }

    @Test
    public void canHoldAPanel () {
        Component[] items = containerPanel.getComponents();
        assertEquals("Menu Item Panel",items[0].getName());

    }
}