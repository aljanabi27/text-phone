package org.example;

import java.io.*;
import java.util.ArrayList;

public class PhoneWriter {
    private ArrayList<PhoneNumber> listPhone;
    private File file;
    public PhoneWriter(ArrayList<PhoneNumber> listPhone, File file){
        this.listPhone = listPhone;
        this.file = file;
    }

    private ObjectOutputStream connection() throws IOException {
        FileOutputStream fos = new FileOutputStream(file,false);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        return oos;
    }
    public void write() throws IOException {
        ObjectOutputStream oos = this.connection();
        for (PhoneNumber x:listPhone)oos.writeObject(x);
        oos.close();
    }
}
