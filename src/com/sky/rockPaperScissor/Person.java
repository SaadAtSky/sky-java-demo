package com.sky.rockPaperScissor;
import java.util.Random;

public class Person {
    private int choice;
    private String name;
    private String status;
    private int noOfWins = 0;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Person(String name){
        this.name = name;
    }

    public Moves getChoice() {
        switch (choice){
            case 1:
                return Moves.rock;
            case 2:
                return Moves.paper;
            case 3:
                return Moves.scissors;
            default:
                System.out.println("Please enter a valid choice between 1 and 3");
                return null;
        }
    }

    public void setChoice() {
        Random random = new Random();
        choice = random.nextInt(3) + 1;
    }

    public void incrementWins() {
        noOfWins++;
    }

    public double getWinPercentage(int games){
        return (double)noOfWins/games * 100;
    }
}
