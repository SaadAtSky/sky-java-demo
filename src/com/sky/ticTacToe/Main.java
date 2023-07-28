package com.sky.ticTacToe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws  Exception{
        Board ticTacToe = new Board();

        Scanner sc = new Scanner(System.in);
        String name, symbol;
        boolean end = false;

        System.out.println("Play alone or with others? (1: Single 2: Multi-players)");
        int option = Integer.parseInt(sc.nextLine());

        System.out.println("Enter player 1 name: ");
        name = sc.nextLine();
        System.out.println("Enter player 1 symbol: ");
        symbol = sc.nextLine();
        Player p1 = new Player(name,symbol);

        if(option == 2){
            System.out.println("Enter player 2 name: ");
            name = sc.nextLine();
            System.out.println("Enter player 2 symbol: ");
            symbol = sc.nextLine();
        }
        else{
            name = "CPU";
            symbol = "c";
        }
        Player p2 = new Player(name,symbol);
        while(!end){
            ticTacToe.initBoard();
            while(!ticTacToe.boardFull()){
                // Player 1
                ticTacToe.displayBoard();
                ticTacToe.move(p1);
                if(ticTacToe.checkWinner(p1)){
                    p1.incrementWins();
                    break;
                }
                if(ticTacToe.boardFull()){
                    System.out.println("Its a Draw!");
                    break;
                }

                // Player 2
                ticTacToe.displayBoard();
                ticTacToe.move(p2);
                if(ticTacToe.checkWinner(p2)){
                    p2.incrementWins();
                    break;
                }
                if(ticTacToe.boardFull()){
                    System.out.println("Its a Draw!");
                    break;
                }
            }
            Thread.sleep(2000);
            System.out.println("Press Q to end the game");
            String input = sc.nextLine();
            if(input.equals("q"))end = true;
        }
        System.out.println(p1.getName() + ": " + p1.getNoOfWins() +" "+ p2.getName() + ": " + p2.getNoOfWins());


    }
}
