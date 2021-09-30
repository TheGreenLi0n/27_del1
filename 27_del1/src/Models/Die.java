package Models;

public class Die {
    private int Facevalue;// = (int)(Math.random() * 6 + 1);

    public void setFacevalue(int a) {
        Facevalue = a;
    }
    public int getFacevalue(){
        return Facevalue;
    }
    public void rolldice(){
        Facevalue = (int)(Math.random() * 6 + 1);
    }
}
