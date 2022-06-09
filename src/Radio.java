public class Radio implements Elektronik {

    private boolean status;
    private int lautstaerke;
    private double frequenz;

    public Radio() {
        status = false;
        lautstaerke = 50;
        frequenz = 0.0;
    }
    @Override
    public void ein_aus_schalten() {
        if (status == false) {
            status = true;
            System.out.println("Das Radio wurde eingeschaltet");
        } else {
            status = false;
            System.out.println("Das Radio wurde ausgeschaltet");
        }
    }
    public boolean checkStatus() {
        if (!status) System.out.println("Das Radio muss eingeschaltet sein!");
        return status;
    }
    public void ausgabe() {
        System.out.println("Sie hoeren gerade " + frequenz + " und die Lautstaerke liegt bei " + lautstaerke);
    }
    public void lauter() {
        if (lautstaerke < 100) lautstaerke++;
        System.out.println("Die Lautstaerke liegt bei " + lautstaerke);

    }
    public void leiser() {
        if (lautstaerke > 0) lautstaerke--;
        System.out.println("Die Lautstaerke liegt bei " + lautstaerke);

    }
    public void setLautstaerke(int lautstaerke) {
        if(checkStatus() && lautstaerke <= 100 && lautstaerke >= 0) {
            this.lautstaerke = lautstaerke;
            System.out.println("Die Lautstaerke liegt bei " + lautstaerke);
        } else System.out.println("Ungueltige Eingabe!");
    }
    public void setFrequenz(double frequenz) {
        if(checkStatus() && frequenz >= 0) {
            this.frequenz = frequenz;
            System.out.println("Sie hoeren gerade " + frequenz);
        } else System.out.println("Ungueltige Eingabe!");
    }

}
