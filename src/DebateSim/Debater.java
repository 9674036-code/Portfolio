public class Debater{
    private int speakerP=0;
    private int wins=0;
    private int mainArg=0;
    private int value=0;
    private int crossX=0;
    private int speakerI=0;

    public void setSpeakerI(int speakerI) {
        this.speakerI = speakerI;
    }
    public void setCrossX(int crossX) {
        this.crossX = crossX;
    }
    public void setMainArg(int mainArg) {
        this.mainArg = mainArg;
    }
    public void setSpeakerP(int s) {
        speakerP = s+speakerP;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public void setWins(int w) {
        wins = w+wins;
    }
    public int getCrossX() {
        return crossX;
    }
    public int getMainArg() {
        return mainArg;
    }
    public int getSpeakerP() {
        return speakerP;
    }
    public int getValue() {
        return value;
    }
    public int getWins() {
        return wins;
    }
    public int getSpeakerI() {
        return speakerI;
    }
}
