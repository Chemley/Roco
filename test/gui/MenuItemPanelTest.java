package gui;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.swing.*;

public class MenuItemPanelTest {

    private MenuItemPanel menuItemPanel;

    @Before
    public void setUpForMenuItemPanel(){
        menuItemPanel = new MenuItemPanel();
    }

    /**
     * Test to make sure menu item panel has the proper name
     */
    @Test
    public void testNameOfMenuItemPanel() {
        assertEquals("MenuItemPanel", menuItemPanel.getName());
    }

    /**
     * Test to make sure the proper taco button is attached to the MenuItemPanel
     */
    @Test
    public void testAddTacoButton(){
        JButton tacoButton = ((JButton) menuItemPanel.getComponents()[0]);
        assertEquals(tacoButton, menuItemPanel.getTacoButton());
        assertEquals("TacoButton", tacoButton.getName());
        assertEquals("Taco", tacoButton.getText());
    }

}