package model;

import model.ConsumableItem;

/**
 * @author Samah Majadla
 */
public class Taco extends ConsumableItem {

    private boolean hasGuacamole = false;

    public Taco() {
        super(3.0);
    }

    public boolean hasGuacamole() {
        return this.hasGuacamole;
    }

    public void addGuacamole() {
        this.hasGuacamole = true;
        this.setUnitPrice(this.getUnitPrice()+ .75);
    }

    /**
     * A text representation of the taco.
     * @return Just "Taco" if the taco does not have guacamole, "Taco with guacamole" if it does
     */
    @Override
    public String toString() {
        String tacoString = "Taco";
        if (this.hasGuacamole) {
            tacoString += " with guacamole";
        }
        return tacoString;
    }
}
