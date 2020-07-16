package com.design.behavioralModel.intermediary;

public class ColleagueA extends AbstractColleague{
    @Override
    public void setNumber(Integer number, AbstractMediator abstractMediator) {
        setNumber(number);
        abstractMediator.AaffectB();
    }
}
