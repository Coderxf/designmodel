package com.design.behavioralModel.memorandum;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Chessman {

    private String label;
    private int x;
    private int y;


    public ChessmanMemento save() {
        return new ChessmanMemento(this.label, this.x, this.y);
    }

    public void restore(ChessmanMemento memento) {
        this.label = memento.getLabel();
        this.x = memento.getX();
        this.y = memento.getY();
    }

    public void show() {
        System.out.println(String.format("棋子<%s>：当前位置为：<%d, %d>", this.getLabel(), this.getX(), this.getY()));
    }



}
