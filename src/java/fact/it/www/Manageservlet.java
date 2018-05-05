/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www;

import fact.it.www.beans.Lener;
import fact.it.www.beans.Soort;
import fact.it.www.beans.Spel;
import fact.it.www.dataaccess.DASoort;
import fact.it.www.dataaccess.DASpel;
import fact.it.www.dataaccess.DALener;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Maarten
 */
@WebServlet(name = "ManageServlet", urlPatterns = {"/ManageServlet"}, initParams = {
    @WebInitParam(name = "url",value = "jdbc:oracle:thin:@localhost:1521:XE"),
    @WebInitParam(name = "login",value = "admin"),
    @WebInitParam(name = "password",value = "sql"),
    @WebInitParam(name = "driver",value = "oracle.jdbc.driver.OracleDriver")})

public class Manageservlet extends HttpServlet {

    private DASoort dasoort = null;
    private DASpel daspel = null;
    private DALener dalener = null;
    
    @Override
    public void init() throws ServletException {
        try {
            String url = getInitParameter("url");
            String login = getInitParameter("login");
            String password = getInitParameter("password");
            String driver = getInitParameter("driver");
            if (dasoort == null) {
                dasoort = new DASoort(url, login, password, driver);
            }
            if (daspel == null) {
                daspel = new DASpel(url, login, password, driver);
            }
            if (dalener == null) {
                dalener = new DALener(url, login, password, driver);
            }
        } catch (ClassNotFoundException e) {
            throw new ServletException(e);
        }
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
           RequestDispatcher rd = null;
           String gekozen = request.getParameter("gekozen");
           
        if (request.getParameter("EersteSpelsoort") !=null){
            Soort soort = dasoort.getSoort();
            request.setAttribute("soort", soort);
            rd = request.getRequestDispatcher("soort.jsp");
        }else if(request.getParameter("VijfdeSpel") !=null){
            Spel spel = daspel.getSpel();
            request.setAttribute("spel", spel);
            rd = request.getRequestDispatcher("spel.jsp");
        }else if(gekozen.equals("lener")){
            Lener lener = dalener.getLener();
            request.setAttribute("lener", lener);
            rd = request.getRequestDispatcher("lener.jsp");
        }else if(request.getParameter("SpelNaarKeuze") != null){
            //???
        }
        rd.forward(request, response);
    }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
