package com.company;

import java.util.ArrayList;
import java.util.List;

public class PLayer {
    private PieceEnum symbol;
    private String name;
    private ArrayList<Location> moves;

    PLayer(int playerNo, String name){
        this.symbol = (playerNo == 1)?PieceEnum.CIRCLE:PieceEnum.CROSS;
        this.name = name;
        this.moves = new ArrayList<Location>();
    }

    public PieceEnum getSymbol() {
        return this.symbol;
    }

    public String getName() {
        return this.name;
    }

    public void addMove(Location p) {
        this.moves.add(p);
    }

    public ArrayList<Location> getMoves(){
        return this.moves;
    }

    public String toString() {
        return this.name;
    }
}