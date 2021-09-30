package Models;

import gui_main.GUI;

public class Cup {
    private Die die1;
    private Die die2;
    private GUI gui;

    public Cup(GUI Gui)
    {
      gui = Gui;
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

    public void rollCup()
    {
        die1.rolldice();
        die2.rolldice();
        gui.setDice(die1.getFacevalue(), die2.getFacevalue());
    }

    public boolean getPair()
    {
        return die1.getFacevalue() == die2.getFacevalue();
    }

    public int getSum()
    {
       return die1.getFacevalue() + die2.getFacevalue();
    }

}
