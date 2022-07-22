/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testList;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author ppolo
 */
public class NewClass {

    public static void main(String[] args) {
        ArrayList<SV> list = new ArrayList<>();

        list.add(new SV(0, "a"));
        list.add(new SV(2, "a"));
        list.add(new SV(3, "a"));
        list.add(new SV(4, "a"));
        list.removeAll(list);

        for (SV sv : list) {
            if (sv.getId() == 2) {
            }
        }

        for (SV string : list) {
            System.out.println(string);
        }
    }
}
