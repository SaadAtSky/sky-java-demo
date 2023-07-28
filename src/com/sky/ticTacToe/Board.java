package com.sky.ticTacToe;

import java.util.Scanner;

public class Board {
    final int rows = 3;
    final int cols = 3;
    private String[][] positions;

    private boolean win;

    public void setWin(boolean win) {
        this.win = win;
    }

    public Board() {
        this.positions = new String[rows][cols];
        win = false;
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
        Scanner sc = new Scanner(System.in);
        int[] move = new int[2];
        do{
            try{
                System.out.println("Enter a valid move - 'row-enter-column-enter' ");
                move[0] = sc.nextInt();
                move[1] = sc.nextInt();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (!checkValidMove(move));
        positions[move[0]][move[1]] = p.getSymbol();
    }
    public boolean checkValidMove(int[] move){
        if(positions[move[0]][move[1]].equals("-"))return true;
        return false;
    }
    public boolean boardFull(){
        for(int i = 0;i < cols;i++){
            for(int j = 0;j < rows;j++){
                if(positions[i][j] == "-")return false;
            }
        }
        return true;
    }
    public boolean isWin() {
        return win;
    }
}
