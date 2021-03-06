package model;

public class Choice {

    //Attribute
    private int par1 = 0, par2 = 0, par3 = 0, par4 = 0;

    //Referenzen
    private String choiceIntro = "";
    private String choiceOutcome = "";

    /*
    Ein Objekt der Klasse choice wird erzeugt.
     */
    public Choice() {}

    public String getChoiceIntro() {
        return choiceIntro;
    }

    public void setChoiceIntro(String choiceIntro) {
        this.choiceIntro = choiceIntro;
    }

    public String getChoiceOutcome() {
        return choiceOutcome;
    }

    public void setChoiceOutcome(String choiceOutcome) {
        this.choiceOutcome = choiceOutcome;
    }

    public int getPar1() {
        return par1;
    }

    public void setPar1(int par1) {
        this.par1 = par1;
    }

    public int getPar2() {
        return par2;
    }

    public void setPar2(int par2) {
        this.par2 = par2;
    }

    public int getPar3() {
        return par3;
    }

    public void setPar3(int par3) {
        this.par3 = par3;
    }

    public int getPar4() {
        return par4;
    }

    public void setPar4(int par4) {
        this.par4 = par4;
    }
}
