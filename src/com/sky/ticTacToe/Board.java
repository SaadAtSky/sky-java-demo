package com.sky.ticTacToe;

public class Board {
    final int rows = 3;
    final int cols = 3;
    private String[][] positions;
    public Board() {
        this.positions = new String[rows][cols];
    }
    public void initBoard(){
        for(int i = 0;i < cols;i++){
            for(int j = 0;j < rows;j++){
                positions[i][j] = "-";
            }
        }
    }
    public void displayBoard(){
        for(int i = 0;i < cols;i++){
            for(int j = 0;j < rows;j++){
                System.out.print(positions[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void move(Player p){

    }
    public boolean checkValidMove(){

        return true;
    }
    public boolean checkWin(){

        return true;
    }
}
