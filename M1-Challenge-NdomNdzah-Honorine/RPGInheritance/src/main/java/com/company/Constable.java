package com.company;

import java.util.Objects;

public class Constable extends Humans {

  private String jurisdiction;

    public Constable(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested, String jurisdiction) {
        super(name, strength, health, stamina, speed, attackPower, running, arrested);
        this.jurisdiction = jurisdiction;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Constable constable = (Constable) o;
        return Objects.equals(jurisdiction, constable.jurisdiction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), jurisdiction);
    }

    @Override
    public String toString() {
        return "Constable{" +
                "jurisdiction='" + jurisdiction + '\'' +
                '}';
    }
}
