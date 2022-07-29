/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testDBImage;

import java.sql.*;

/**
 *
 * @author ppolo
 */
public class ConnectToDB {

    private Connection conn = null;

    public Connection connect() throws SQLException {

        conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=[Image];encrypt=true;trustServerCertificate=true;sslProtocol=TLSv1.2;user=sa;password=phuongntph19428");

        return conn;
    }

    public void close() throws SQLException {
        conn.close();
    }

}
