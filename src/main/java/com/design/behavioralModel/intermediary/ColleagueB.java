package com.design.behavioralModel.intermediary;

public class ColleagueB extends AbstractColleague{
    @Override
    public void setNumber(Integer number, AbstractMediator abstractMediator) {
        setNumber(number);

        abstractMediator.BaffectA();
    }
}
