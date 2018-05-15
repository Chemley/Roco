import gui.*;
import model.Cashier;
import model.Order;
import model.Taco;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Presenter {

    private final ContainerPanel containerPanel;
    private TacoTruck view;
    private Cashier model;
    public Order firstOrder;

    public Presenter(TacoTruck view, Cashier model) {
        this.view = view;
        this.view.init();
        this.model = model;
        firstOrder = new Order("Unknown Customer");
        this.model.addOrder(firstOrder);
        this.containerPanel = new ContainerPanel();
        initializePresenter();
        JButton tacoButton = ((ContainerPanel) getCurrentScreen()).getMenuItemPanel().getTacoButton();
        tacoButton.setActionCommand("AddTaco");
        tacoButton.addActionListener(new ItemButtonActionListener());
    }

    private void initializePresenter(){
        setCurrentScreen(containerPanel);
    }

    public TacoTruck getView() {
        return this.view;
    }

    private void setCurrentScreen(JPanel screen){
        this.view.setContentPane(screen);
        view.revalidate();
    }

    public Container getCurrentScreen() {
        return view.getContentPane();
    }

    private class StartButtonActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            setCurrentScreen(new TacoTruckWelcomePanel());
        }
    }

    private class ItemButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            Taco taco = new Taco();
            String actionCommand = ae.getActionCommand();
            switch (actionCommand) {
                case "AddTacoWGuac":
                    taco.addGuacamole();
                case "AddTaco":
                    firstOrder.addItem(new Taco());
                    containerPanel.getReceiptPanel().addItemToReceipt(taco);
                    containerPanel.getReceiptPanel().updateSubtotal(firstOrder.getSubtotal());
                    containerPanel.getReceiptPanel().updateTax(firstOrder.getSubtotal() * firstOrder.getTaxRate());
                    containerPanel.getReceiptPanel().updateDiscountAmount(firstOrder.getDiscountAmount());
                    containerPanel.getReceiptPanel().updateTotal(firstOrder.getTotal());
                    break;
                default:
                    System.err.println("Command not recognized");
            }
        }

    }

    public static void main(String[] args) {
        new Presenter(new TacoTruck(), new Cashier());
    }

}
