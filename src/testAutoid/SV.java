/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testAutoid;

import java.io.Serializable;

/**
 *
 * @author ppolo
 */
public class SV implements Serializable {

    public static int count;
    private int id;
    private String name;

    public SV() {
    }

    public SV(String name) {
        this.id = ++count;
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        SV.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SV{" + "id=" + id + ", name=" + name + '}';
    }

}
