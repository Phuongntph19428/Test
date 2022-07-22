/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testAutoid;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ppolo
 */
public class Services {

    private List<SV> _lstSV;

    public Services() {
        _lstSV = new ArrayList<>();
        for (SV sv : getAll()) {
            _lstSV.add(sv);
        }
    }

    public List<SV> getAll() {
        return _lstSV;
    }

    public void addSV(SV sv) {
        if (_lstSV.isEmpty()) {
            SV.count = 0;
            System.out.println("SV.count = " + SV.count);
        } else {
            System.out.println("SV: " + _lstSV.get(_lstSV.size() - 1).getId());
            SV.count = _lstSV.get(_lstSV.size() - 1).getId();
            System.out.println("Đã set count = " + SV.count);
        }
        
        _lstSV.add(sv);
        System.out.println("ADD: " + sv.toString());
    }

    public void write() throws FileNotFoundException, IOException {

        FileOutputStream fos = new FileOutputStream("test.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for (SV sv : _lstSV) {
            oos.writeObject(sv);
        }

        oos.close();
        fos.close();
    }

    public void read() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("test.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        _lstSV = new ArrayList<>();
        while (fis.available() > 0) {
            var temp = ois.readObject();
            _lstSV.add((SV) temp);
        }
        System.out.println("SL SV: "+_lstSV.size());
        for (SV sv : _lstSV) {
            System.out.println(sv);
        }

        ois.close();
        fis.close();

    }

}
