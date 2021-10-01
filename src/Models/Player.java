package Models;

public class Player {
    private int score;
    private boolean win;
    private boolean Turn;

    // constructor for player object

    public Player(){
        score = 0;
        win = false;
    }
    // for updating score
    public void updateScore(int x){

        score += x;
    }

    public void updateWin(){
        win = !win;
    }

    public int getScore(){
        return score;
    }

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
