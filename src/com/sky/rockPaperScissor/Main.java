package com.sky.rockPaperScissor;

public class Main {
    public static void main(String[] args) {
        Person Abdul = new Person("Abdul");
        Person Saad = new Person("Saad");
        boolean win = false;
        int noOfGames = 10;
        for(int i = 0;i < noOfGames;i++){
            win = false;
            while(!win){
                Abdul.setChoice();
                Moves firstMove = Abdul.getChoice();

                Saad.setChoice();
                Moves secondMove = Saad.getChoice();

//                System.out.println("{Abdul: "+Abdul.getChoice()+", Saad: "+Saad.getChoice()+"}");

                if(!firstMove.equals(secondMove)){
                    if(firstMove.equals(Moves.paper) && secondMove.equals(Moves.rock)){
                        win = true;
                        Abdul.setStatus("Winner");
                        Saad.setStatus("Loser");
                    }
                    else if(firstMove.equals(Moves.paper) && secondMove.equals(Moves.scissors)){
                        win = true;
                        Saad.setStatus("Winner");
                        Abdul.setStatus("Loser");
                    }
                    else if(firstMove.equals(Moves.rock) && secondMove.equals(Moves.scissors)){
                        win = true;
                        Abdul.setStatus("Winner");
                        Saad.setStatus("Loser");
                    }
                    else if(secondMove.equals(Moves.paper) && firstMove.equals(Moves.rock)){
                        win = true;
                        Saad.setStatus("Winner");
                        Abdul.setStatus("Loser");
                    }
                    else if(secondMove.equals(Moves.paper) && firstMove.equals(Moves.scissors)){
                        win = true;
                        Abdul.setStatus("Winner");
                        Saad.setStatus("Loser");
                    }
                    else if(secondMove.equals(Moves.rock) && firstMove.equals(Moves.scissors)){
                        win = true;
                        Saad.setStatus("Winner");
                        Abdul.setStatus("Loser");
                    }
                }
                else {
                    System.out.println("Draw");
                }
                if(Saad.getStatus().equals("Winner")){
                    Saad.incrementWins();
                }
                else{
                    Abdul.incrementWins();
                }
                Saad.setStatus("");
                Abdul.setStatus("");

            }
//            System.out.println("Abdul is a "+Abdul.getStatus()+"\nSaad is a "+Saad.getStatus()+"");
        }
        System.out.println("Saad: "+Saad.getWinPercentage(noOfGames) + " Abdul: " +Abdul.getWinPercentage(noOfGames));
        }

}
