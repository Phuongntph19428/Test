/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testDBImage;

import java.io.Serializable;

/**
 *
 * @author ppolo
 */
public class TestImage implements Serializable {

    private int id;
    private byte[] anh;

    public TestImage() {
    }

    public TestImage(int id, byte[] anh) {
        this.id = id;
        this.anh = anh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte[] getAnh() {
        return anh;
    }

    public void setAnh(byte[] anh) {
        this.anh = anh;
    }

}
