package gui;
import gui.TacoTruckWelcomePanel;
import org.junit.Test;

import javax.swing.*;
import java.awt.*;

import static org.junit.Assert.*;

public class TacoTruckWelcomePanelTest {

    @Test
    public void welcomePanel_initialState(){
        TacoTruckWelcomePanel welcome = new TacoTruckWelcomePanel();
        JButton startButton = (JButton) welcome.getComponents()[0];

        assertEquals("TacoTruckWelcomePanel",welcome.getName());
        assertEquals("StartOrderButton",welcome.getStartButton().getName());
        assertEquals("Start Order",welcome.getStartButton().getText());

        assertEquals("StartOrderButton",startButton.getName());
        assertEquals("Start Order",startButton.getText());

        assertEquals(startButton, welcome.getStartButton());

    }

}