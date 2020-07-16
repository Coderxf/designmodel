package com.design.behavioralModel.intermediary;

public class Mediator extends AbstractMediator{


    public Mediator(AbstractColleague a, AbstractColleague b) {
        super(a, b);
    }

    @Override
    public void AaffectB() {
        Integer number = A.getNumber();
        B.setNumber(number*10);
    }

    @Override
    public void BaffectA() {
        Integer number = B.getNumber();
        A.setNumber(number/10);
    }
}
