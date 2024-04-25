/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionIcad.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Kyorai
 */
public class MySQLConnector {

    /*private static final String url = "jdbc:mysql://localhost:3306/icad";
    private static final String user = "root";
    private static final String pass = "";
    private static Connection con = null;
     */
    private static final String url = "jdbc:mysql://172.28.36.10:3306/icad";
    private static final String user = "joandokevin";
    private static final String pass = "pass";
    private static Connection con = null;

    public static Connection getConnexion() throws SQLException {
        if (con == null) {
            con = DriverManager.getConnection(url, user, pass);
        }
        return con;
    }
}
