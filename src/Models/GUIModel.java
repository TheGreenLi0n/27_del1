package Models;
import gui_main.GUI;

public class GUIModel
{
    static private GUI gui = new GUI();

    public void SetDiceFaces(int die1FaceValue, int die2FaceValue)
    {
           gui.setDice(die1FaceValue,die2FaceValue);
    }
}
