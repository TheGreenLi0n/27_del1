import Models.*;
import gui_main.GUI;
import java.util.Scanner;

public class MainGameplayLoop {

    public static void main(String[] args) {

        //We are utilizing the gui for this project.
        GUI gui = new GUI();
        int i = 0;
        int Totalrolls = 0;
        boolean GameOngoing = true;
        Player player1 = new Player();
        Player player2 = new Player();
        Cup cup = new Cup(gui);

        Scanner in = new Scanner(System.in);
        System.out.println("To start the game type \"roll\"\nor if you want to close the game type \"exit\". ");
        while (GameOngoing)
        {
            System.out.println("Current player" + (i % 2 + 1));
            if ((i % 2 + 1)==1){
                player1.setTurn(true);
                player2.setTurn(false);
            }
            else {
                player2.setTurn(true);
                player1.setTurn(false);
            }

            //Different user inputs.
            String Userinput = in.next();
            switch (Userinput.toLowerCase()) {
                case ("roll"):
                    cup.rollCup();
                    if (i % 2 + 1 == 1) {
                        player1.updateScore(cup.getSum());

                    } else {
                        player2.updateScore(cup.getSum());
                    }

                    /* If the current player rolls a pair then that player gets
                    an extra dice throw because the value of "i" stays the same*/
                    if (!cup.getPair()) {
                        i++;
                    }
                    break;
                case ("exit"):
                    GameOngoing = false;
                    break;
                case ("score"):
                    if (i % 2 + 1 == 1) {
                        System.out.println("player1 score:" + player1.getScore());
                    } else {
                        System.out.println("player2 score:" + player2.getScore());
                    }
                    break;
                default:
                    System.out.println("Invalid input try again");
                    break;
            }

            //A player's score becomes 0 if that player rolled two 1's.
            if (cup.getDie1().getFacevalue() == 1 && cup.getDie2().getFacevalue() == 1) {
                if (i % 2 + 1 == 1) {
                    player1.setScore(0);
                } else {
                    player2.setScore(0);
                }
            }

            /*The current player wins if that player rolls a pair
            and afterwards has a score of at least 40.*/
            if (player1.getTurn() && player1.getScore() >= 40 && cup.getPair()) {
                player1.updateWin();
                GameOngoing = false;
            }
            else if (player2.getTurn() && player2.getScore() >= 40 && cup.getPair()) {
                player2.updateWin();
                GameOngoing = false;
            }
            Totalrolls ++;
        }
        if (player1.isWin()) {
            System.out.println("\n\n\n\nplayer1 won the game\nTotal turns:" + Totalrolls);
        }
        else if (player2.isWin()){
            System.out.println("\n\n\n\nplayer2 won the game\nTotal turns:" + Totalrolls);
        }
    }
}
