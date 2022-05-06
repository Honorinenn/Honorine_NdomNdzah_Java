package com.company;

import java.util.Objects;

public class Farmer extends Humans {


        private boolean plowing;
        private boolean harvesting;


    public Farmer(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested, boolean plowing, boolean harvesting) {
        super(name, strength, health, stamina, speed, attackPower, running, arrested);
        this.plowing = plowing;
        this.harvesting = harvesting;
    }

    public boolean isPlowing() {
        return plowing;
    }

    public void setPlowing(boolean plowing) {
        this.plowing = plowing;
    }

    public boolean isHarvesting() {
        return harvesting;
    }

    public void setHarvesting(boolean harvesting) {
        this.harvesting = harvesting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Farmer farmer = (Farmer) o;
        return plowing == farmer.plowing && harvesting == farmer.harvesting;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), plowing, harvesting);
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "plowing=" + plowing +
                ", harvesting=" + harvesting +
                '}';
    }
}

