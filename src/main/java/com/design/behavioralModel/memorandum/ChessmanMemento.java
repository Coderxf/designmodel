package com.design.behavioralModel.memorandum;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChessmanMemento {

    private String label;
    private int x;
    private int y;

}
