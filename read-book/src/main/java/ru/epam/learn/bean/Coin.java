package ru.epam.learn.bean;

public class Coin {
    private double diameter;
    private double weight;

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double value) {
        if (value > 0) {
            diameter = value;
        } else {
            System.out.println("Negative diameter!");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
