/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www.dataaccess;

import fact.it.www.beans.Soort;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Maarten
 */
    public class DASoort {
    private final String url, login, password;
    
    public DASoort(String url, String login, String password, String driver) throws ClassNotFoundException {
        Class.forName(driver);
        this.url = url;
        this.login = login;
        this.password = password;
        
    }
    
    public Soort getSoort() {
        Soort soort = null;
        
        try (
                Connection connection = DriverManager.getConnection(url, login, password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM soort where nr = 1");)
        {
        if (resultSet.next()) {
            soort = new Soort();
            soort.setNr(resultSet.getInt("nr"));
            soort.setSoortnaam(resultSet.getString("soortnaam"));
        }
        
        }catch (Exception e){
            e.printStackTrace();
        }
    return soort;
    }
}
