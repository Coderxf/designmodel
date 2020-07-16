package com.design.behavioralModel.intermediary;

public abstract class AbstractColleague {


    private Integer number;


    public int getNumber() {
        return number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public abstract void setNumber(Integer number, AbstractMediator abstractMediator);
}
