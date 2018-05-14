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
public class Soort {
    private int nr;
    private String soortnaam;

    public Soort(int nr, String soortnaam) {
        this.nr = nr;
        this.soortnaam = soortnaam;
    }

    public Soort() {
        
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getSoortnaam() {
        return soortnaam;
    }

    public void setSoortnaam(String soortnaam) {
        this.soortnaam = soortnaam;
    }
    
    
}
