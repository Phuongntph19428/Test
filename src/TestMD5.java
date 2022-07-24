
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ppolo
 */
public class TestMD5 {

    public static String convertByteToHex1(byte[] data) {
        BigInteger number = new BigInteger(1, data);



        String hashtext = number.toString(16);
//        while (hashtext.length() < 32) {
//            hashtext = "0" + hashtext;
//
//        }


        byte[] number1 = hashtext.getBytes();
        System.out.println(number1);
        return hashtext;
    }

    public static String convertByteToHex2(byte[] data) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < data.length; i++) {
            sb.append(Integer.toString((data[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }

    public static String getMD5(String input) {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
            byte[] messageDigrest = md.digest(input.getBytes());
            System.out.println(messageDigrest);
            return convertByteToHex1(messageDigrest);
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        return null;
    }

//    public static String nguoc(String input) {
//        String 
//    }

    public static String getMD52(String input) {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
            byte[] messageDigrest = md.digest(input.getBytes());
            return convertByteToHex2(messageDigrest);
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(getMD5("password"));
    }
}
