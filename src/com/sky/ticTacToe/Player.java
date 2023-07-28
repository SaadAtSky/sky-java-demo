package com.sky.ticTacToe;

public class Player {
    private String name;
    private String symbol;
    private int noOfWins;

    public Player(String name, String symbol){
        noOfWins = 0;
        setName(name);
        setSymbol(symbol);
    }
    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getNoOfWins() {
        return noOfWins;
    }

    public void incrementWins() {
        noOfWins++;
    }

    public void setName(String name) {
        this.name = name;
    }
}
