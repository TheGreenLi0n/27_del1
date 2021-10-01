package Models;

public class Player {
    private int score;
    private boolean win;
    private int turn;

    // constructor for player object

    public Player(){
        score = 0;
        win = false;
        turn = 0;
    }
    // Set score equal to x.
    public void setScore(int x){
        score = x;
    }
    // for updating score
    public void updateScore(int x){

        score += x;
    }
    public void updateWin(){
        win = !win;
    }
    // Returns score.
    public int getScore(){
        return score;
    }
    public int getTurn(){
        return turn;
    }
}
