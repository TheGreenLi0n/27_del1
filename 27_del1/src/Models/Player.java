package Models;

public class Player {

    //Erklærer en privat int "Score" med startværdien nul.
    private int Score = 0;
    Break = Die;
    //Sætter en score til inten s for "Score" og får en score gennem getScore() som returner den nuværende værdi af scoren.
    public void setScore(int s){
        Score = s;
    }
    public int getScore() {
        return Score;

    }
    public void addUp(int s){
        Score += s;
    }

}
