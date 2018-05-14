/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www.dataaccess;

import fact.it.www.beans.Lener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Sam
 */
    public class DALener {
    private final String url, login, password;
    
    public DALener(String url, String login, String password, String driver) throws ClassNotFoundException {
        Class.forName(driver);
        this.url = url;
        this.login = login;
        this.password = password;
        
    }
    
    public Lener getLener() {
        Lener lener = null;
        
        try (
                Connection connection = DriverManager.getConnection(url, login, password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM lener where nr = 1");)
        {
        if (resultSet.next()) {
            lener = new Lener();
            lener.setNr(resultSet.getInt("nr"));
            lener.setLenernaam(resultSet.getString("lenernaam"));
            lener.setStraat(resultSet.getString("straat"));
            lener.setHuisnr(resultSet.getString("huisnr"));
            lener.setBusnr(resultSet.getString("busnr"));
            lener.setPostcode(resultSet.getString("postcode"));
            lener.setGemeente(resultSet.getString("gemeente"));
            lener.setTelefoon(resultSet.getString("telefoon"));
            lener.setEmail(resultSet.getString("email"));
        }
        
        }catch (Exception e){
            e.printStackTrace();
        }
    return lener;
    }
}
