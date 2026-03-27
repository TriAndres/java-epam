package ru.epam.learn.bean;

public class Coin {
    private double diameter; // encapsulation violation
    private double weight; // correct encapsulation
    public double getDiameter() {
        return diameter;
    }
    public void setDiameter(double value) {
        if(value>0){
            diameter = value;
        }else{
            System.out.println("Negative diameter!");
        }
    }
    public double takeWeight() { // incorrect method name
        return weight;
    }
    public void setWeight(double value) {
        weight = value;
    }

}
