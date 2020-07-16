package com.design.behavioralModel.memorandum;

import java.util.ArrayList;

public class MementoCaretaker {


    private ArrayList mementoList = new ArrayList();

    public ChessmanMemento getMemento(int i) {
        return (ChessmanMemento) mementoList.get(i);
    }

    public void addMemento(ChessmanMemento memento) {
        mementoList.add(memento);
    }


}
