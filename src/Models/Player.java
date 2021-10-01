package Models;

public class Player {
    private int score;
    private boolean win;
    private boolean Turn;

    // Constructor for player object

    public Player(){
        score = 0;
        win = false;
    }
    // For updating score
    public void updateScore(int x){

        score += x;
    }

    public void updateWin(){
        win = !win;
    }
    // Returns scores value.
    public int getScore(){
        return score;
    }
    // For setting score.
    public void setScore(int score) {
        this.score = score;
    }

    public boolean getTurn(){
        return Turn;
    }

    public void setTurn(boolean turn) {
        Turn = turn;
    }

    public boolean isWin() {
        return win;
    }
}
