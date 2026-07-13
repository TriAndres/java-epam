package ru.yandex.learn.bean;

import ru.yandex.learn.action.CompareCoin;

public class CoinMain {
    public static void main(String[] args) {
        Coin coin1 = new Coin();
        coin1.setDiameter(-0.11);
        System.out.println(coin1.getDiameter());
        coin1.setDiameter(0.12);
        System.out.println(coin1.getDiameter());
        Coin coin2 = new Coin();
        coin2.setDiameter(0.21);
        System.out.println(coin2.getDiameter());
        coin2.setWeight(170);
        System.out.println(coin2.getWeight());
        CompareCoin copare = new CompareCoin();
        System.out.println(copare.compareDiameter(coin1, coin2));
    }
}
