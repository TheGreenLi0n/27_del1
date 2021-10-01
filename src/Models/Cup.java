package Models;

import gui_main.GUI;

public class Cup {
    private Die die1;
    private Die die2;
    private GUI gui;
    private int[] lastThrow;

    //Constructor for Cup with GUI so it can update the graphics
    public Cup(GUI Gui)
    {
      gui = Gui;
      die1 = new Die();
      die2 = new Die();
      lastThrow = new int[]{die1.getFacevalue(), die2.getFacevalue()};
    }

    public void setDie1(Die die1) {
        this.die1 = die1;
    }

    public void setDie2(Die die2) {
        this.die2 = die2;
    }

    public Die getDie1() {
        return die1;
    }

    public Die getDie2() {
        return die2;
    }

    //Rolls both the dice, and updates the GUI with the new Facevalues.
    public void rollCup()
    {
        die1.rolldice();
        die2.rolldice();
        gui.setDice(die1.getFacevalue(), die2.getFacevalue());
    }

    //checks if the dice got the same facevalue.
    public boolean getPair()
    {
        return die1.getFacevalue() == die2.getFacevalue();
    }

    // gets the sum of the 2 dice
    public int getSum()
    {
       return die1.getFacevalue() + die2.getFacevalue();
    }

    // saves the last roll 
    public void setLastThrow(int lastThrow1, int lastThrow2) {
        this.lastThrow = new int[] {lastThrow1, lastThrow2};
    }

    //checks if there was rolled pair 6 twice in a row
    public boolean getGotLucky()
    {
        return (die1.getFacevalue() == 6 && die2.getFacevalue() == 6 && lastThrow[0] == 6 && lastThrow[1] == 6);
    }
}
