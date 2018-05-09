package gui;
import gui.MenuItemPanel;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;


public class MenuItemPanelTest {

    private MenuItemPanel menuItemPanel;

    @Before
    public void setUpForMenuItemPanel(){
        menuItemPanel = new MenuItemPanel();
    }

    @Test
    public void nameOfMenuItemPanel() {
        assertEquals("Menu Item Panel",menuItemPanel.getName());

    }

    @Test
    public void addTacoButton(){
        JButton tacoButton = ((JButton) menuItemPanel.getComponents()[0]);
        assertEquals(tacoButton, menuItemPanel.getTacoButton());
        assertEquals("Taco Button", tacoButton.getName());
        assertEquals("Taco Button", tacoButton.getText());
    }

}