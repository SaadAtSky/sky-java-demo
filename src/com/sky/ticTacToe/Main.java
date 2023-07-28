package com.sky.ticTacToe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board ticTacToe = new Board();
        ticTacToe.initBoard();

        Scanner sc = new Scanner(System.in);
        String name, symbol;

        System.out.println("Enter player 1 name: ");
        name = sc.nextLine();
        System.out.println("Enter player 1 symbol: ");
        symbol = sc.nextLine();
        Player p1 = new Player(name,symbol);

        System.out.println("Enter player 2 name: ");
        name = sc.nextLine();
        System.out.println("Enter player 2 symbol: ");
        symbol = sc.nextLine();
        Player p2 = new Player(name,symbol);

        while(!ticTacToe.boardFull()){
            // Player 1
            ticTacToe.displayBoard();
            ticTacToe.move(p1);
            if(ticTacToe.checkWinner(p1)){
                p1.incrementWins();
                break;
            }
            if(ticTacToe.boardFull())break;

            // Player 2
            ticTacToe.displayBoard();
            ticTacToe.move(p2);
            if(ticTacToe.checkWinner(p2)){
                p2.incrementWins();
                break;
            }
        }
        System.out.println(p1.getName() + ": " + p1.getNoOfWins() +" "+ p2.getName() + ": " + p2.getNoOfWins());


    }
}
