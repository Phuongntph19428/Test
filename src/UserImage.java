
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ppolo
 */
public class UserImage {
    
    public ImageIcon getImageIcon(String string) {
        return new ImageIcon(this.getClass().getClassLoader().getResource(string));
    }
    
    public ImageIcon resizeImg(ImageIcon image, JLabel label) {
        Image oldImage = image.getImage();
        Image newImage = oldImage.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        return new ImageIcon(newImage);
    }
    
}