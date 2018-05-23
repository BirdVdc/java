/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www.beans;

/**
 *
 * @author Sam
 */
public class Spel {
    private int nr;
    private String naam;
    private String uitgever;
    private String auteur;
    private String jaar_uitgifte;
    private String leeftijd;
    private String min_spelers;
    private String max_spelers;
    private int soortnr;
    private String speelduur;
    private int moeilijkheidnr;
    private double prijs;
    private String afbeelding;
    
    
    //Toevoegen van soort
    private Soort soortnaam;
    //Toevoegen van Moeilijkheid
    private Moeilijkheid moeilijkheidnaam;

    public Spel() {
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getUitgever() {
        return uitgever;
    }

    public void setUitgever(String uitgever) {
        this.uitgever = uitgever;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getJaar_uitgifte() {
        return jaar_uitgifte;
    }

    public void setJaar_uitgifte(String jaar_uitgifte) {
        this.jaar_uitgifte = jaar_uitgifte;
    }

    public String getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(String leeftijd) {
        this.leeftijd = leeftijd;
    }

    public String getMin_spelers() {
        return min_spelers;
    }

    public void setMin_spelers(String min_spelers) {
        this.min_spelers = min_spelers;
    }

    public String getMax_spelers() {
        return max_spelers;
    }

    public void setMax_spelers(String max_spelers) {
        this.max_spelers = max_spelers;
    }

    public int getSoortnr() {
        return soortnr;
    }

    public void setSoortnr(int soortnr) {
        this.soortnr = soortnr;
    }

    public String getSpeelduur() {
        return speelduur;
    }

    public void setSpeelduur(String speelduur) {
        this.speelduur = speelduur;
    }

    public int getMoeilijkheidnr() {
        return moeilijkheidnr;
    }

    public void setMoeilijkheidnr(int moeilijkheidnr) {
        this.moeilijkheidnr = moeilijkheidnr;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public String getAfbeelding() {
        return afbeelding;
    }

    public void setAfbeelding(String afbeelding) {
        this.afbeelding = afbeelding;
    }

    public Soort getSoortnaam() {
        return soortnaam;
    }

    public void setSoortnaam(Soort soortnaam) {
        this.soortnaam = soortnaam;
    }

    public Moeilijkheid getMoeilijkheidnaam() {
        return moeilijkheidnaam;
    }

    public void setMoeilijkheidnaam(Moeilijkheid moeilijkheidnaam) {
        this.moeilijkheidnaam = moeilijkheidnaam;
    }

   
    @Override
    public String toString() {
        return "Spel{" + "nr=" + nr + ", naam=" + naam + ", uitgever=" + uitgever + ", auteur=" + auteur + ", jaar_uitgifte=" + jaar_uitgifte + ", leeftijd=" + leeftijd + ", min_spelers=" + min_spelers + ", max_spelers=" + max_spelers + ", soortnr=" + soortnr + ", speelduur=" + speelduur + ", moeilijkheidnr=" + moeilijkheidnr + ", prijs=" + prijs + ", afbeelding=" + afbeelding + '}';
    }
    
    
}
