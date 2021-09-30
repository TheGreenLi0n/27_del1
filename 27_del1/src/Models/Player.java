package Models;

public class Player {
    private int score;
    private boolean win;
    private int turn;

    public Player(){
        score = 0;
        win = false;
        turn = 0;
    }
    public void updateScore(int x){
        score += x;
    }
    public void updateWin(){
        win = !win;
    }
    public int getScore(){
        return score;
    }
    public int getTurn(){
        return turn;
    }
}
