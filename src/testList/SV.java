/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testList;

/**
 *
 * @author ppolo
 */
public class SV {
    private int id;
    private String diem;

    public SV() {
    }

    public SV(int id, String diem) {
        this.id = id;
        this.diem = diem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiem() {
        return diem;
    }

    public void setDiem(String diem) {
        this.diem = diem;
    }
    

    @Override
    public String toString() {
        return "SV{" + "id=" + id + ", diem=" + diem + '}';
    }
    
    
}
