/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testDBImage;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ppolo
 */
public class Services {
    
    List<TestImage> _list;
    ConnectToDB con = new ConnectToDB();

    public Services() {
        _list = new ArrayList<>();
    }
    
    public int add(TestImage image) throws SQLException, FileNotFoundException{
        Connection conn = con.connect();
        System.out.println("Connected");
        String query = "INSERT INTO [Image](ID, anh) VALUES (?, ?)";
        
        PreparedStatement pstm = conn.prepareStatement(query);
        pstm.setString(1, image.getId() + "");
        pstm.setBytes(2, image.getAnh());
        ResultSet rs = pstm.executeQuery();
        
        return rs.getRow();
    }    
    
    
}
