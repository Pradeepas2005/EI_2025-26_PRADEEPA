package com.satellite;

import java.util.logging.Logger;

// Singleton Satellite (Receiver)
public class Satellite {
    private static final Logger logger = Logger.getLogger(Satellite.class.getName());
    private static Satellite instance;

    private String orientation;
    private boolean solarPanelsActive;
    private int dataCollected;

    private Satellite() {
        this.orientation = "North";
        this.solarPanelsActive = false;
        this.dataCollected = 0;
    }

    public static Satellite getInstance() {
        if (instance == null) {
            instance = new Satellite();
        }
        return instance;
    }

    public void rotate(String direction) {
        this.orientation = direction;
        logger.info("Satellite rotated to: " + direction);
    }

    public void activatePanels() {
        if (solarPanelsActive) {
            logger.info("Solar panels are already activated.");
        } else {
            this.solarPanelsActive = true;
            logger.info("Solar panels activated.");
        }
    }

    public void deactivatePanels() {
        if (!solarPanelsActive) {
            logger.info("Solar panels are already deactivated.");
        } else {
            this.solarPanelsActive = false;
            logger.info("Solar panels deactivated.");
        }
    }

    public void collectData() {
        if (solarPanelsActive) {
            this.dataCollected += 10;
            logger.info("Data collected. Total: " + dataCollected + " units.");
        } else {
            logger.warning("Cannot collect data. Solar panels are inactive.");
        }
    }

    public String getOrientation() {
        return orientation;
    }

    public boolean isSolarPanelsActive() {
        return solarPanelsActive;
    }

    public int getDataCollected() {
        return dataCollected;
    }

    @Override
    public String toString() {
        return "Orientation: " + orientation +
                ", Solar Panels: " + (solarPanelsActive ? "Active" : "Inactive") +
                ", Data Collected: " + dataCollected;
    }
}
