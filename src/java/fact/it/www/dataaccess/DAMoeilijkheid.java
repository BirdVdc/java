/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www.dataaccess;

import fact.it.www.beans.Moeilijkheid;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Sam
 */
    public class DAMoeilijkheid {
    private final String url, login, password;
    
    public DAMoeilijkheid(String url, String login, String password, String driver) throws ClassNotFoundException {
        Class.forName(driver);
        this.url = url;
        this.login = login;
        this.password = password;
        
    }
    
    public Moeilijkheid getMoeilijkheid() {
        Moeilijkheid moeilijkheid = null;
        
        try (
                Connection connection = DriverManager.getConnection(url, login, password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from moeilijkheid order by nr");)
        {
        if (resultSet.next()) {                
                moeilijkheid.setNr(resultSet.getInt("nr"));
                moeilijkheid.setMoeilijkheidNaam(resultSet.getString("Moeilijkheidnaam"));
        }
        
        }catch (Exception e){
            e.printStackTrace();
        }
    return moeilijkheid;
    }
}
