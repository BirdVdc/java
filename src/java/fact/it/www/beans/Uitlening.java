package fact.it.www.beans;

public class Uitlening {
    private int nr;
    private int spelernr;
    private int lenernr;
    private String uitleendatum;
    private String terugbrengdatum;

    public Uitlening() {
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public int getSpelernr() {
        return spelernr;
    }

    public void setSpelernr(int spelernr) {
        this.spelernr = spelernr;
    }

    public int getLenernr() {
        return lenernr;
    }

    public void setLenernr(int lenernr) {
        this.lenernr = lenernr;
    }

    public String getUitleendatum() {
        return uitleendatum;
    }

    public void setUitleendatum(String uitleendatum) {
        this.uitleendatum = uitleendatum;
    }

    public String getTerugbrengdatum() {
        return terugbrengdatum;
    }

    public void setTerugbrengdatum(String terugbrengdatum) {
        this.terugbrengdatum = terugbrengdatum;
    }
}
