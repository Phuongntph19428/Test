/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testDBImage;


/**
 *
 * @author ppolo
 */
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
public class ImageReSize {
    
    public static Image resize(Image image, int x, int y){
        Image after = image.getScaledInstance(x, y, Image.SCALE_SMOOTH);
        return after;
    }
    
    public static byte[] toByteArray(Image img, String type) throws IOException{
        BufferedImage biamge = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_RGB);
        Graphics2D g = biamge.createGraphics();
        g.drawImage(img, 0, 0, null);
        g.dispose();
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(biamge, type, baos);
        
        byte[] imageInByte = baos.toByteArray();
        return imageInByte;
        
    }
    
    public static Image createImageFromByteArray(byte[] data, String type) throws IOException{
        ByteArrayInputStream bis = new ByteArrayInputStream(data);
        
        BufferedImage bimage = ImageIO.read(bis);
        
        Image img = bimage.getScaledInstance(bimage.getWidth(), bimage.getHeight(), Image.SCALE_SMOOTH);
        return img;
    }
    
}
