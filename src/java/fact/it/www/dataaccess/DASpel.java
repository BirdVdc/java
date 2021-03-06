/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www.dataaccess;

import fact.it.www.beans.Moeilijkheid;
import fact.it.www.beans.Soort;
import fact.it.www.beans.Spel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import fact.it.www.beans.Spel;
import java.sql.PreparedStatement;
import java.util.ArrayList;


/**
 *
 * @author Sam
 */
public class DASpel {

    private final String url, login, password;

    public DASpel(String url, String login, String password, String driver) throws ClassNotFoundException {
        Class.forName(driver);
        this.url = url;
        this.login = login;
        this.password = password;

    }

    public Spel getSpel() {
        Spel spel = null;

        try (
                Connection connection = DriverManager.getConnection(url, login, password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM spel where nr = 5");) {
            if (resultSet.next()) {
                spel = new Spel();
                spel.setNr(resultSet.getInt("nr"));
                spel.setNaam(resultSet.getString("naam"));
                spel.setUitgever(resultSet.getString("uitgever"));
                spel.setAuteur(resultSet.getString("auteur"));
                spel.setJaar_uitgifte(resultSet.getString("jaar_uitgifte"));
                spel.setLeeftijd(resultSet.getString("leeftijd"));
                spel.setMin_spelers(resultSet.getString("min_spelers"));
                spel.setMax_spelers(resultSet.getString("max_spelers"));
                spel.setSoortnr(resultSet.getInt("soortnr"));
                spel.setSpeelduur(resultSet.getString("speelduur"));
                spel.setMoeilijkheidnr(resultSet.getInt("moeilijkheidnr"));
                spel.setPrijs(resultSet.getDouble("prijs"));
                spel.setAfbeelding(resultSet.getString("afbeelding"));
                
                        
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return spel;
    }

    public Spel getSpelNaarKeuze(String SpelNaarKeuze) {
        Spel spel = null;

        try (
                Connection connection = DriverManager.getConnection(url, login, password);
                PreparedStatement statement = connection.prepareStatement("SELECT * FROM spel where lower(Naam) like ?");) {
            statement.setString(1,SpelNaarKeuze + "%");
            ResultSet resultSet = statement.executeQuery();
            
                if (resultSet.next()) {
                    spel = new Spel();
                    spel.setNr(resultSet.getInt("nr"));
                    spel.setNaam(resultSet.getString("naam"));
                    spel.setUitgever(resultSet.getString("uitgever"));
                    spel.setAuteur(resultSet.getString("auteur"));
                    spel.setJaar_uitgifte(resultSet.getString("jaar_uitgifte"));
                    spel.setLeeftijd(resultSet.getString("leeftijd"));
                    spel.setMin_spelers(resultSet.getString("min_spelers"));
                    spel.setMax_spelers(resultSet.getString("max_spelers"));
                    spel.setSoortnr(resultSet.getInt("soortnr"));
                    spel.setSpeelduur(resultSet.getString("speelduur"));
                    spel.setMoeilijkheidnr(resultSet.getInt("moeilijkheidnr"));
                    spel.setPrijs(resultSet.getDouble("prijs"));
                    spel.setAfbeelding(resultSet.getString("afbeelding"));
                }

            }catch (Exception e){
            e.printStackTrace();
        }
            return spel;
        }
    
    public ArrayList<Spel> getSpellen() {
        ArrayList<Spel> spellen = new ArrayList<>();

        try (
                Connection connection = DriverManager.getConnection(url, login, password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM spel ORDER BY Naam");) {
            
            
            while (resultSet.next()) {
                Spel spel = new Spel();
                spel.setNr(resultSet.getInt("nr"));
                spel.setNaam(resultSet.getString("naam"));
                spel.setUitgever(resultSet.getString("uitgever"));
                spel.setAuteur(resultSet.getString("auteur"));
                spel.setJaar_uitgifte(resultSet.getString("jaar_uitgifte"));
                spel.setLeeftijd(resultSet.getString("leeftijd"));
                spel.setMin_spelers(resultSet.getString("min_spelers"));
                spel.setMax_spelers(resultSet.getString("max_spelers"));
                spel.setSoortnr(resultSet.getInt("soortnr"));
                spel.setSpeelduur(resultSet.getString("speelduur"));
                spel.setMoeilijkheidnr(resultSet.getInt("moeilijkheidnr"));
                spel.setPrijs(resultSet.getDouble("prijs"));
                spel.setAfbeelding(resultSet.getString("afbeelding"));
                spellen.add(spel);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return spellen;
    }
    
    public Spel getSpelDetails() {
        Spel spel = null;

        try (
                Connection connection = DriverManager.getConnection(url, login, password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(" select * from spel");) {
            if (resultSet.next()) {
                spel = new Spel();
                spel.setNr(resultSet.getInt("nr"));
                spel.setNaam(resultSet.getString("naam"));
                spel.setUitgever(resultSet.getString("uitgever"));
                spel.setAuteur(resultSet.getString("auteur"));
                spel.setJaar_uitgifte(resultSet.getString("jaar_uitgifte"));
                spel.setLeeftijd(resultSet.getString("leeftijd"));
                spel.setMin_spelers(resultSet.getString("min_spelers"));
                spel.setMax_spelers(resultSet.getString("max_spelers"));
                spel.setSoortnr(resultSet.getInt("soortnr"));
                spel.setSpeelduur(resultSet.getString("speelduur"));
                spel.setMoeilijkheidnr(resultSet.getInt("moeilijkheidnr"));
                spel.setPrijs(resultSet.getDouble("prijs"));
                spel.setAfbeelding(resultSet.getString("afbeelding"));
                
                //relatie soort
                Soort soort = new Soort();
                soort.setSoortnaam(resultSet.getString("soortnaam"));

                spel.setSoortnaam(soort);
                
                //relatie moeilijkheid
                Moeilijkheid moeilijkheid = new Moeilijkheid();
                moeilijkheid.setMoeilijkheidNaam(resultSet.getString("moeilijkheidNaam"));
                spel.setMoeilijkheidnaam(moeilijkheid);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return spel;
    }
}