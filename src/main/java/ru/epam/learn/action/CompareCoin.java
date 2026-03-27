package ru.epam.learn.action;

import ru.epam.learn.bean.Coin;

public class CompareCoin {
    public int compareDiameter(Coin first, Coin second) {
        int result = 0;
        double delta = first.getDiameter() - second.getDiameter();
        if(delta>0){
            result = 1;
        }else if(delta<0){
            result = - 1;
        }
        return result;
    }
}